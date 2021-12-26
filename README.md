### Spring Data JPA

References - https://github.com/daliasheasha/SpringDataJPA

- Employee - DataObject
- EmployeeRepository extends CrudRepository and is essentially the interface for generic CRUD operations for a specific type ( Employee)

### Configuring/ Setting up the database

- This uses the default H2 database
  - The problem is that the data is wiped out everytime the application is restarted. So in order to change the behavior we are going to change a property setting in the yml file
```shell
spring.datasource.url=jdbc:h2:file:./data/rso_01
driver.datasource.driver-class-name=org.h2.driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update
```