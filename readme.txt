ZBeans Projects / CowGraph
==========================

ZBeans
------

ZBeans ist der �berbegriff f�r unsere Projekte welche mi der Netbeans Platform zu tun haben.
Z steht f�r eine Firma in Z wie Z�rich bei welcher die Gr�nder dieses Projektes, zu Beginn dieses Opensource-Projektes gearbeitet haben.
Wir verwenden in unseren Projekten auch entsprechende Namespaces und Package-Names, welche immer mit "zbeans" beginnen.

ACHTUNG: Da wir (noch) keine entsprechende Domain haben, verwenden wir NICHT org.zbeans noch net.zbeans noch com.zbeans.


CowGraph
--------

CowGraph ist die erste Beispiel/Demo-Applikation die wir gemeinsam auf der Netbeans Platform entwickeln.
Die Applikation erm�glicht es sogenannte "CashCow"-Grafiken zu erstellen und versioniert abzulegen, so dass die Entwicklung der Grafiken �ber die Zeit verfolgt werden kann.


Naming Conventions
------------------

Package Names beginnen immer mit "zbeans", da es sich um Opensource handelt ist darauf zu achten, keinerlei Firmen-Namen in den Source-Codes zu verwenden.

Beispiele f�r Package Names: zbeans.cowgraph, zbeans.simple


Entwicklungs-Umgebung
---------------------

Wir verwenden folgende Entwicklungs-Umgebung:
- Netbeans 7.0 (aktuell RC1)
- Versionskontrolle mit GIT (vorwiegend �ber GIT-Bash-Konsole)

Die Entwicklungs-Umgebung ist wie folt zu installieren und einzurichten:

1. NetBeans installieren: 
	http://netbeans.org/downloads/index.html
	(die Java SE Version reicht bereits aus)

2. Account auf github erstellen
	https://github.com/

3. Git installieren und konfigurieren:
	Gem�ss Anleitung: http://help.github.com/win-set-up-git/
	ACHTUNG: 
	Git-Bash speichert alle Einstellungen im Working Directory wo es sich sktuell befindet (Command: pwd), 
	Auch wird dort hin ausgecheckt wo die Konsole sich aktuell befindet: mit cd in entsprechendes Verzeichnis wechseln!
	Deshalb wird empfohlen, bevor Git gem�ss Anleitung konfiguriert wird, 
	die Git-Bash-Konsole auf das gew�nschte Working-Directory f�r ZBeans-Projekte zu konfigurieren 
	(einfach in der Windows-Verkn�pgung->Properties->Start In)

4. Dann auf github.com nach unserem Projekt "zbeans/cashcow" suchen und dieses "forken" und auschecken:
	- Gem�ss Anleitung unter http://help.github.com/fork-a-repo/
	- $ git clone git@github.com:<youusername>/cashcow.git

5. (Optional) Git Plugin f�r Netbeans installieren
	[Optional, weil es nicht wahnsinnig hilfreich zu sein scheint.]
	- http://nbgit.org/
	- nbm file von der Website runterladen
	- in NetBeans unter Tools-> Plugins->Downloaded installieren

6. In Netbeans eine ProjetcGroup einrichten:
	- Unter File/Project Group/New
	- Folder Of Projects: Das cashcow-Verzeichnis in welches Du die zbeans Projekte ausgecheckt hast
	- Es werden jeweils automatisch alle Projekte ge�ffnet, die dort ausgecheckt sind (kein Import/Refresh wie in Eclipse n�tig)

Hier noch ein paar Links zu git Infoquellen:
- http://help.github.com/
- http://gitref.org/
- http://progit.org/book/

Bei Fragen zur Entwicklungs-Umgebung kontaktiert ihr Michael.


GIT Howto
---------

Alle folgenden Befehle sind im gew�nschten Verzeichnis (allenfalls mit cd wechseln) auszuf�hren.

1. Updating from Git-Hub
	git pull upstream master

2. Committing (nur in mein Repository):
	git commit -a -m "Dein Commmit Text*  // alle �nderungen, auch neue Files, nur lokal
	git push  // in mein repository

3. Commiting (von eigenem Repository in gemeinsames Repository):
	- auf github.com einloggen
	- im Repository pull request absetzen 
		(z.B. auf eigener Repository Seite auf Seite Commits)
	- danach wird man auf geshared Repository weitergeleitet dort 
		Request akzeptieren
		(ganz nach unten scrollen)

4. Mergen (lokal):

	Eigene �nderungen zuerst in eigenem Repo einchecken/sichern (sicher ist sicher): 
	git commit -a -m "blabla*  // alle �nderungen, auch neue Files, nur lokal
	git push // in mein remote repository 

	Dann erst alle �nderungen auschecken:
	git pull upstream master

	Dann in Netbeans alle aufgef�hrten conflicted files von Hand korrigieren
	und alle gemergten �nderungen einchecken:
	git commit -a -m "merged blabla"

	Schliesslich gem�ss Punkt 3 in gemeinsames Repository pullen.

Siehe auch weitere GIT cheat sheets unter http://help.github.com/git-cheat-sheets/


Kontakte / Lead-Entwickler
--------------------------

Michael M�hlebach
Rolf Bruderer
