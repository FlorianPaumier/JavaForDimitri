package fr.iialaval.eshop;

import java.util.List;

import fr.iialaval.eshop.entity.Order;
import fr.iialaval.eshop.entity.Order_Product;
import fr.iialaval.eshop.entity.Product;
import fr.iialaval.eshop.repositories.OrderProduct_Repository;
import fr.iialaval.eshop.repositories.Order_Repository;
import fr.iialaval.eshop.repositories.Product_Repository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fr.iialaval.eshop.entity.Customer;
import fr.iialaval.eshop.repositories.Customer_Repository;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        // TODO Auto-generated method stub
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner addFixtures(Customer_Repository repo,
                                         Product_Repository product_repository,
                                         Order_Repository order_repository,
                                         OrderProduct_Repository orderProduct_repository) {
        return (args) ->{
            Customer client = new Customer();
            client.setFirstName("Dimitri");
            client.setLastName("Sauvage");
            client.setEmail("dimitri1993@live.fr");

            Product product = new Product();
            product.setName("plouf");

            Order order = new Order();
            order.setCustomer(client);
            order.setTotal(100);

            Order_Product order_product = new Order_Product(order, product);


            repo.save(client);
            product_repository.save(product);
            order_repository.save(order);
            orderProduct_repository.save(order_product);

            List<Customer> customers = repo.findByEmail("dimitri1993@live.fr");

        };
    }

}
