# MyGradleApp

A simple Java application built using Gradle, tested with JUnit 5, packaged into a fat JAR using the Shadow plugin, and containerized using Docker.

---

## 📁 Project Structure

MyGradleApp/
├── app/
│ ├── build.gradle
│ └── src/
│ ├── main/java/com/example/MyGradleApp.java
│ └── test/java/org/example/AppTest.java
├── Dockerfile
├── settings.gradle
├── README.md


---

## 🚀 Features

- Java 17 support
- Gradle build system
- JUnit 5 for testing
- Shadow plugin for fat JAR generation
- Docker containerization

---

## 🛠️ Prerequisites

Ensure the following are installed:

- Java 17+
- Gradle
- Docker
- Git (optional for version control)

---

## 🔧 Build & Run

### Clone the Repository

```bash
git clone https://github.com/Hinakumari1/MyGradleApp.git
cd MyGradleApp

**Build with Gradle**
- ./gradlew clean build shadowJar

**Generates a fat JAR at:**
- app/build/libs/app-all.jar

**Run Tests**
- ./gradlew test

**Docker Usage**
- docker build -t mygradleapp .

**Run the Container**
- docker run mygradleapp

**Expected Output:**
- Hello from MyGradleApp!

📘 DEVOPS PRINCIPLES COVERED
Principle	Description
Automation	Build and test runs automatically.
Continuous Integration (CI)	Every commit is tested.
Continuous Delivery (CD)	You can automatically deploy after testing.
Version Control	Using Git to track changes.
Dependency Management	Gradle downloads and manages libraries.
