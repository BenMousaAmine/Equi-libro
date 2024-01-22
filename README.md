# Equi-libro

Benvenuto su Equi-libro, un semplice negozio online di libri costruito con Spring Boot.

## Caratteristiche

1. **Registrazione Utente:** Gli utenti possono registrarsi per un account.
2. **Aggiunta di Libri:** Gli utenti possono aggiungere libri al negozio.
3. **Gestione Carrello:** Gli utenti possono aggiungere e rimuovere libri dal carrello.
4. **Accesso Sicuro:** Le pagine riservate sono accessibili solo agli utenti autenticati.
5. **Rimozione Utente:** Gli utenti possono cancellare il proprio account.

## Tecnologie Utilizzate

- Java
- Spring Boot
- Thymeleaf
- MySQL
- Spring web
- JDBC API

## Configurazione del Database

Assicurati di aver configurato correttamente le proprietà del database nel file `application.properties`.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/mybookstore
spring.datasource.username=your_username
spring.datasource.password=your_password
