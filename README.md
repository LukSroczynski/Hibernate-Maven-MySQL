# Hibernate

<b> Objectives: </b>
- ~~ Learn maven ~~
- Learn basics of Hibernate
- Learn basics of Spring
- Try out MySQL

<b>USEFUL STUFF</b> - persistence.xml file

``` xml
<persistence xmlns="http://java.sun.com/xml/ns/persistence"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://java.sun.com/xml/ns/persistence http://java.sun.com/xml/ns/persistence/persistence_2_0.xsd"
             version="2.0">
    <persistence-unit name="TestDatabase" transaction-type="RESOURCE_LOCAL">
        <provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>
        <properties>
            <property name="javax.persistence.jdbc.driver" value="com.mysql.jdbc.Driver"/>
            <property name="javax.persistence.jdbc.user" value="test"/>
            <property name="javax.persistence.jdbc.password" value="test"/>
            <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/hibernatetest"/>
            <property name="hibernate.dialect" value="org.hibernate.dialect.MySQL5Dialect"/>
            <property name="hibernate.hbm2ddl.auto" value="create-drop"/>
        </properties>
    </persistence-unit>
</persistence>
```
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/HibernateTest
spring.datasource.username=postgres
spring.datasource.password=zaq12wsx
spring.jpa.generate-ddl=true
server.port=8080
```
