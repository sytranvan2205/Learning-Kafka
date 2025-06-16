package vn.order.service.impl;

import vn.order.kafka.OrderProducer;
import vn.order.service.OrderService;
import vn.order.entity.Order;
import vn.order.entity.dto.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class OrderServiceImpl implements OrderService {
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private OrderProducer orderProducer;

    @Override
    public Order createOrder(OrderDTO dto) {
        Order order = new Order(
                counter.incrementAndGet(),
                dto.getCustomerName(),
                dto.getProduct(),
                dto.getQuantity(),
                LocalDateTime.now()
        );
        orderProducer.sendOrder(order);
        return order;
    }
}
