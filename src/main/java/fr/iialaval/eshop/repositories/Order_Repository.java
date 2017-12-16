package fr.iialaval.eshop.repositories;

import org.springframework.data.repository.CrudRepository;

import fr.iialaval.eshop.entity.Order;

/**
 *
 * @author dimitri
 *
 */
public interface Order_Repository extends CrudRepository<Order, Long> {

}
