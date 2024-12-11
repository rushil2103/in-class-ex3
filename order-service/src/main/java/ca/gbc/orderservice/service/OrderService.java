package ca.gbc.orderservice.service;

import ca.gbc.orderservice.dto.OrderRequest;

/**
 * @project microservice-parent
 * @authorparam on
 **/
public interface OrderService {
    void placeOrder(OrderRequest orderRequest);

}
