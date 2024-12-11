package ca.gbc.orderservice.repository;

import ca.gbc.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @project microservice-parent
 * @authorparam on
 **/
public interface OrderRepository extends JpaRepository<Order,Long> {
}
