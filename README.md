Daily Learning

# Account Bank

Project developed during the Santander 2023 Bootcamp - Java Backend, under the guidance of specialist [Gleyson Sampaio](https://github.com/glysns/ "Gleyson Sampaio").
Learning how to simulate a bank account using the terminal/console.

## Requirements

- Java 11 or higher
- Maven 3.6.0 or higher

## Project Structure

```Markdown

Account_Bank
├─ .github
│  └─ instructions.md
├─ .vscode
│  └─ settings.json
├─ src
│  ├─ main
│  │  ├─ java
│  │  │  └─ com
│  │  │     └─ accountbank
│  │  │        └─ AccountTerminal.java
│  │  └─ resources
│  │     └─ sample-data.txt
│  └─ test
│     └─ java
│        └─ com
│           └─ accountbank
│              └─ AccountTerminalTest.java
├─ target
│  ├─ classes
│  │  ├─ com
│  │  │  └─ accountbank
│  │  │     └─ AccountTerminal.class
│  │  └─ sample-data.txt
│  └─ test-classes
│     └─ com
│        └─ accountbank
│           └─ AccountTerminalTest.class
├─ .gitignore
├─ LICENSE
├─ pom.xml
└─ README.md

```

## Build and Run

### Compile

```bash
mvn clean compile
```

### Run (using exec plugin)

```bash
mvn exec:java -Dexec.mainClass="com.accountbank.AccountTerminal"
```

### Package

```bash
mvn clean package
```

### Run the packaged JAR

```bash
java -jar target/Account_Bank-1.0.0.jar
```

### Run tests

```bash
mvn test
```

## Development

To start developing, add your classes under `src/main/java/com/accountbank/`.

## License

[LICENSE](/LICENSE)

## Original Repository

See [original repository](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe)
