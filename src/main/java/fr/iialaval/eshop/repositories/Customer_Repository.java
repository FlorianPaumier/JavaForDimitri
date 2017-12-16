package fr.iialaval.eshop.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import fr.iialaval.eshop.entity.Customer;

/**
 *
 * @author DSAUVA
 *
 */

public interface Customer_Repository extends CrudRepository<Customer, Long>{

    /**
     * List of the customers which have email adress like argument
     * @param emailAdress
     * @return
     */
    List<Customer> findByEmail(String emailAdress);
}
