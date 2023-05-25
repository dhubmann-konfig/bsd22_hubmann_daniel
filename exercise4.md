# Exercise 4: Source Code Testing

## Dokumentation der Arbeitsschritte

1. Für JUnit notwendige Depencendies zu pom.xml hinzufügen
2. Anlegen eines Test Folders und des Packages: test/java/<package_name_des_zu_testenden_source_codes>
3. Notwendige Variablen/Objekte deklarieren
4. setUp-Methode implementieren (@BeforeEach): beinhaltet Initialisierung der zuvor deklarierten Variablen/Objekte
5. test-Methode(n) implementieren (@Test)
6. Testen

## Beschreibung der implementierten Testmethoden

Pro Methode der Calculator-Klasse wurden drei Testmethoden implementiert.

### Add

testAdd1: überprüft Rückgabe mit Input 1, -1
testAdd2: überprüft Rückgabe mit Input -1, -1
testAdd3: überprüft Rückgabe mit Input 2, -1

### Minus

testMinus1: überprüft Rückgabe mit Input 0, 1
testMinus2: überprüft Rückgabe mit Input -1, -1
testMinus3: überprüft Rückgabe mit Input 1, -1

### Divide

testDivide1: überprüft Rückgabe mit Input 1, 1
testDivide2: überprüft Rückgabe mit Input 1, 2
testDivide3: überprüft Rückgabe mit Input 10, 5

### Multiply

testMultiply1: überprüft Rückgabe mit Input 123, 0
testMultiply2: überprüft Rückgabe mit Input 1, -1
testMultiply3: überprüft Rückgabe mit Input -1, -1

### Factorial

testFactorial1: überprüft Rückgabe bei negativem Input
testFactorial2: überprüft Rückgabe mit Input 5
testFactorial3: überprüft Rückgabe mit Input 10
testFactorial4: überprüft Rückgabe mit Input 0 (nachträglich hinzugefügt)
