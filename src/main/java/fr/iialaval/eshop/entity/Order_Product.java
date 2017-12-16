/**
 *
 */
package fr.iialaval.eshop.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import fr.iialaval.eshop.entity.CompoudPrimaryKeys.Order_Product_PK;

/**
 * @author dimitri
 *
 */

@Entity
@Table(name="Order_Product")
public class Order_Product {

	    private static final long serialVersionUID = 1L;

	    @EmbeddedId
	    @AttributeOverrides({
	    	@AttributeOverride(name = "ID.product", column = @Column(name = "product_ID")),
	    	@AttributeOverride(name = "ID.orders", column = @Column(name = "order_ID"))
	    	})
	    private Order_Product_PK id;
    public Order_Product(){}
	public Order_Product(Order order, Product product) {
		id = new Order_Product_PK(order, product);
	}
}
