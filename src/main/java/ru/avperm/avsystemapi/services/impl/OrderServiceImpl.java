package ru.avperm.avsystemapi.services.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.avperm.avsystemapi.entity.Order;
import ru.avperm.avsystemapi.exceptions.EntityNotFound;
import ru.avperm.avsystemapi.repositories.OrderRepository;
import ru.avperm.avsystemapi.services.OrderService;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public Order getOrder(Long id) {
        return orderRepository.findById(id).orElseThrow(() -> new EntityNotFound("OrderNotFound " + id));
    }

}
