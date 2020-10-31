package ru.avperm.avsystemapi.services;

import ru.avperm.avsystemapi.entity.Order;


public interface OrderService {

    /**
     * Получить заказ по id
     *
     * @param id заказа
     * @return Заказ {@link ru.avperm.avsystemapi.entity.Order}
     */
    Order getOrder(Long id);


}
