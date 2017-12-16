package fr.iialaval.eshop.entity.CompoudPrimaryKeys;

import fr.iialaval.eshop.entity.Order;
import fr.iialaval.eshop.entity.Product;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class Order_Product_PK implements Serializable{

    //Fields

    //Id required for Serializable interface
    private static final long serialVersionUID = 1L;

	/**
     * Order of the product
     */
    @ManyToOne
    private Order order;

    /**
     * Product of the order
     */
    @ManyToOne
    private Product product;

    public Order_Product_PK(){}

	public Order_Product_PK(Order order, Product product) {
		this.order = order;
		this.product = product;
	}


//Properties


    /**
	 * @return the order_ID
	 */
	public Order getOrder() {
		return order;
	}

	/**
	 * @param order the order_ID to set
	 */
	public void setOrder(Order order) {
		this.order = order;
	}

	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @param product the product_ID to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}


}

