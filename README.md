# 🔐 Password Validator (Java, Maven)

![Java](https://img.shields.io/badge/Java-17-blue)
![Maven](https://img.shields.io/badge/Maven-3.8+-orange)
![Build](https://img.shields.io/badge/Build-Passing-brightgreen)

Eine einfache Konsolenanwendung zur Validierung von Passwörtern mit definierten Sicherheitsregeln.

---

## 📋 Funktionen

Das Passwort muss:

- Mindestens 8 Zeichen lang sein
- Mindestens einen Großbuchstaben enthalten
- Mindestens einen Kleinbuchstaben enthalten
- Mindestens eine Zahl enthalten
- Mindestens ein Sonderzeichen enthalten
- Kein häufig verwendetes Passwort sein

---

## ⚙️ Voraussetzungen

- Java 17 oder höher
- Maven 3.8 oder höher

Version prüfen:

```bash
java -version
mvn -version
```

---

## 🔨 Projekt bauen

Im Projektverzeichnis ausführen:

```bash
mvn clean package
```

Danach befindet sich die ausführbare `.jar` Datei im Ordner:

```
target/
```

---

## ▶️ Anwendung starten

### Variante 1 – Direkt mit Maven

```bash
mvn exec:java -Dexec.mainClass="Main"
```

*(Falls die Main-Klasse in einem Package liegt, z. B. `com.example.Main`, entsprechend anpassen.)*

---

### Variante 2 – Über die erzeugte JAR-Datei

```bash
java -jar target/password-validator-1.0-SNAPSHOT.jar
```

---

## 🖥️ Beispielausgabe

```
Hello, please set a password.

Password requirements:
- At least 8 characters long
- At least one uppercase letter
- At least one lowercase letter
- At least one digit
- At least one special character
```

---

## 🏗️ Projektstruktur

```
src/
 └── main/
     └── java/
         ├── Main.java
         └── PasswordValidator.java
```

---

## 📚 Technologien

- Java
- Maven
- Objektorientierte Programmierung
- Statische Validierungsmethoden

---

## 👨‍💻 Autor

Viktoria Uyanik
GitHub: https://github.com/Wicky42
