package fr.iialaval.eshop.entity.CompoudPrimaryKeys;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import fr.iialaval.eshop.entity.Order_Product;

@StaticMetamodel(Order_Product_PK.class)
public abstract class Order_Product_PK_ {
	//Fields

    public static volatile SingularAttribute<Order_Product, Long> idOrder;
    public static volatile SingularAttribute<Order_Product, Long> idProduct;
}
