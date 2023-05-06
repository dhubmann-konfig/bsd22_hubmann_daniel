# Git Commands

\<git command>: \<Funktionsweise>; \<Parameter>; \<betroffene Daten>; \<wo diese Daten verändert werden>

## git config

Anpassungen der Git-Konfiguration (auf lokaler Ebene, oder global mittels global-Flag); z.B. user.name gefolgt von "\<username>"; Grundeinstellungen; lokales Repository  
Bsp.: git commit --global user.name "Daniel Hubmann"

## git init

erstellt ein neues, leeres lokales Repository, erstellt dabei ein .git-Unterveichnis im aktuellen Arbeitsverzeichnis; ohne Paramater; lokales Repository; lokal  
Bsp.: (im jew. Arbeistverzeichnis) git init

## git status

gibt aktuellen Status über das Arbeitsverzeichnis und den Staging-Bereich aus (untracked files, staged, modified); o. P.; lokale Dateien; lokal  
Bsp.: git status

## git add

fügt Änderungen einer Datei aus dem Arbeitsverzeichnis dem Staging-Bereich hinzu (Vorbereitung für commit); \<filename>; lokale Dateien; lokal  
Bsp.: git add README.md  
Bsp.: git add . (fügt alle geänderten Dateien zum Staging hinzu)

## git commit

nach git add möglich, erzeugt eine dauerhafte Version einer Datei mit den aktuellen Änderungen; -m \<message: description of changes>; lokale Dateien; lokal  
Bsp.: git commit -m "README.md added"

## git log

listet (in chronologisch umgekehrter Reihenfolge) alle commits des Git-Projekts auf (mit Author, Date & Message); ohne Parameter; lokales Repository; lokal  
Bsp.: git log

## git diff

zeigt die Veränderungen, die in einer Datei gemacht wurden; u.a \<branch>, \<commit>, \<commit-hash>, \<path to file> ; lokale Dateien; lokal  
Bsp.: git diff (zeigt Veränderungen seit dem letzten Commit)  
Bsp.: git diff HEAD \<path to file>  
Bsp.: git diff \<commit> \<commit> \<path to file>  

## git pull

ladet Inhalt bwz. Änderungen aus einem Remote-Repository in das lokale Repository (führt fetch und merge aus); o. P.; Remote-Repository; lokales Repository  
Bsp.: git pull origin main

## git push

pusht lokales Repository auf das Remote-Repository (Übertragung der Commits); \<remote-repository>, \<local branch>; lokales Repository; Remote-Repository  
Bsp.: git push origin main
