# Exercise 5: Branching

## Warum werden Logging Bibliotheken verwendet?

Aufzeichnung von Anwendungsfluss, Datenfluss, Fehlermeldungen (recoverable oder schwerwiegend), Warnungen zu möglichen Fehler

## Welche Loglevel gibt es in Log4J und was hat es damit auf sich?

Loglevels kategorisieren Logeinträge je nach Schweregrad eines Events.

- ALL: alle Events
- DEBUG: Debug-Events
- ERROR: Fehler (Exceptions) in der Anwendung
- FATAL: schwerwiegende Fehler
- INFO: informierendes Event
- TRACE: zeichnet Fluss der Anwendung auf
- WARN: Warnung zu möglich auftretenden Fehler
- OFF: keine Aufzeichnung

## Was für Konfigurationsmöglichkeiten bietet Ihnen log4J?

- Angabe zur Adresse der Zieldatei für die Logeinträge
- Ausgabe über Konsole oder in externe Logdatei schreiben
- Definition von Appenders: unterschiedlich Ziele der einzelnen Logs können definiert werden
- Definition eines Patterns für einen Logeintrag mit Datum, Zeit und Information
