/**
 *
 */
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

/**
 * @author Dimitri Sauvage
 *
 */
@Entity
@Table(name="Product")
public class Product {

    //Fields

    /**
     * Technical ID of the product
     */
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private long Id;

    /**
     * Product's name
     */
    @Column(name="name", length=50)
    private String name;

    /**
     * Product's desciprition
     */
    @Column(name="description", length=500)
    private String description;

    /**
     * Product's stock quantity
     */
    @Column(name="quantity")
    private int quantity;

    /**
     * True if the product life is finished
     */
    @Column(name="end_of_life")
    private Boolean end_of_life;

    /**
     * Product's price
     */
    @Column(name="price",precision=2)
    private float price;

    /**
     * Path of the picture's image
     */
    @Column(name="picturePath")
    private String picturePath;

    /**
     * Creation date of the product
     */
    @Column(name="createdAt")
    public Date createdAt;

    /**
     * Update date of the product
     */
    @Column(name="updatedAt")
    public Date updatedAt;


//    @OneToMany(mappedBy="product.ID")
//    private List<Product> orders;


    //Properties


    /**
     * @return the id
     */
    public long getId() {
        return Id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        Id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the end_of_life
     */
    public Boolean getEnd_of_life() {
        return end_of_life;
    }

    /**
     * @param end_of_life the end_of_life to set
     */
    public void setEnd_of_life(Boolean end_of_life) {
        this.end_of_life = end_of_life;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the picturePath
     */
    public String getPicturePath() {
        return picturePath;
    }

    /**
     * @param picturePath the picturePath to set
     */
    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }
//
//    /**
//     * @return the orders
//     */
//    public List<Product> getOrders() {
//        return orders;
//    }
//
//    /**
//     * @param orders the orders to set
//     */
//    public void setOrders(List<Product> orders) {
//        this.orders = orders;
//    }

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
