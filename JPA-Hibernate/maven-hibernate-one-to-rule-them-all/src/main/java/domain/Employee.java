package domain;

import javax.persistence.*;

/**
 * Created by user on 08.02.2017.
 */
@Entity
@Table(name = "Pracownicy")
@SecondaryTable(name = "Adresy", pkJoinColumns = @PrimaryKeyJoinColumn(name = "employeeID"))
public class Employee {

    @Id
    private long id; // działa w obu tabelach - do tego nadpisany został w SecondaryTable

    @Column(name = "imie")
    private String firstName;
    @Column(name = "nazwisko")
    private String lastName;
    @Column(name = "pensja")
    private double salary;

    @Column(table = "Adresy", name = "miejscowosc")
    private String locality;
    @Column(table = "Adresy", name = "kodPocztowy")
    private String zipCode;
    @Column(table = "Adresy", name = "ulica")
    private String street;
    @Column(table = "Adresy", name = "numerDomu")
    private int streetNumber;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }
}
