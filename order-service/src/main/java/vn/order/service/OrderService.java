package vn.order.service;

import vn.order.entity.Order;
import vn.order.entity.dto.OrderDTO;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {
    Order createOrder(OrderDTO dto);
}
