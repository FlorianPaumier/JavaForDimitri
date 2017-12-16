package fr.iialaval.eshop.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {

    //Fields

    /**
     * Technical ID of the Customer
     */
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    /**
     * FirstName of the Customer
     */
    @Column(name="first_name")
    private String firstName;

    /**
     * LastNameName of the Customer
     */
    @Column(name="last_name")
    private String lastName;

    /**
     * Email adress of the customer
     */
    @Column(name="emailAdress")
    public String email;

    /**
     * Phone number of the customer
     */
    @Column(name="phone")
    public String phone;
    
    /**
     * Zip code of the customer
     */
    @Column(name="zipCode")
    public String zipCode;

    /**
     * Adress of the customer
     */
    @Column(name="adress")
    public String adress;

    /**
     * City of the customer
     */
    @Column(name="city")
    public String city;
    
    /**
     * Creation date of the customer
     */
    @Column(name="createdAt")
    public Date createdAt;

    /**
     * Update date of the customer
     */
    @Column(name="updatedAt")
    public Date updatedAt;
    
    @OneToMany(mappedBy="customer")
    public List<Order> orders;
    
    //Properties

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * @param zipCode the zipCode to set
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * @return the adress
     */
    public String getAdress() {
        return adress;
    }

    /**
     * @param adress the adress to set
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Set the creation date at now before inserting
     */
    @PrePersist
    private void setCreatedDate() {
        this.createdAt = new Date();
    }
    
    /**
     * Set the update time at now before updating
     */
    @PreUpdate
    private void setUpdateDate() {
        this.updatedAt = new Date();
    }
    
}
