package fr.iialaval.eshop.repositories;

import fr.iialaval.eshop.entity.CompoudPrimaryKeys.Order_Product_PK;
import fr.iialaval.eshop.entity.Order_Product;
import org.springframework.data.repository.CrudRepository;

public interface OrderProduct_Repository extends CrudRepository<Order_Product, Long> {

}
