/*
 * Copyright (C) 2011 Michael Muehlebach <michael@anduin.ch>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * $Id$
 * 
 * Copyright (c) 2010 Anduin Developments. http://www.anduin.ch
 */
package zbeans.cowgraph.windows.version;

import java.beans.IntrospectionException;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import zbeans.cowgraph.model.CowGraphDocument;
import zbeans.cowgraph.model.CowGraphVersion;

/**
 * Defining the children of a document node.
 * 
 * @author Michael Muehlebach <michael@anduin.ch>
 */
public class VersionNodeFactory extends ChildFactory<CowGraphVersion> implements PropertyChangeListener {

    private final CowGraphDocument document;

    public VersionNodeFactory(CowGraphDocument document) {
        this.document = document;
        
        this.document.addPropertyChangeListener(this);
    }

    @Override
    protected boolean createKeys(List<CowGraphVersion> toPopulate) {
        toPopulate.addAll(document.getVersions());
        return true;
    }

    @Override
    protected Node createNodeForKey(CowGraphVersion key) {
        Node node = null;
        try {
            node = new VersionNode(key);
        } catch (IntrospectionException ex) {
            Exceptions.printStackTrace(ex);
        }
        return node;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.refresh(true);
    }
}