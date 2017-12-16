/**
 *
 */
package fr.iialaval.eshop.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author dimitri
 *
 */
@Entity
@Table(name="orders")
public class Order {

    
    //Fields
    
    
    /**
     * Techical ID of the order
     */
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private long ID;
    
    /**
     * Total priceof the order
     */
    @Column(name="total", precision=2)
    private float total;

    /**
     * Customer of the order
     */
    @ManyToOne
    private Customer customer;

    /**
     * List of the order's products
     */
//    @OneToMany(mappedBy="order.ID")
//    private List<Order_Product> products;

    
    
    
    //Properties
    
    
    
    /**
     * @return the products
     */
//    public List<Order_Product> getProducts() {
//        return products;
//    }

    /**
     * @param products the products to set
     */
//    public void setProducts(List<Order_Product> products) {
//        this.products = products;
//    }

    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * @return the iD
     */
    public long getID() {
        return ID;
    }

    /**
     * @param iD the iD to set
     */
    public void setID(long iD) {
        ID = iD;
    }

    /**
     * @return the total
     */
    public float getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(float total) {
        this.total = total;
    }
}

