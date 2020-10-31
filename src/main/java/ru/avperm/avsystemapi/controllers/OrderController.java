package ru.avperm.avsystemapi.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.avperm.avsystemapi.entity.Order;
import ru.avperm.avsystemapi.services.OrderService;

import java.util.List;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("/api/")
@Tag(name = "Интернет-заказы", description = "REST API для работы с интернет-заказами")
public class OrderController {

    private final OrderService orderService;

    @GetMapping(path = "/order/{id}")
    @Operation(summary = "Получение заказа по номеру", description = "Заказ по ID", tags = {"Order"})
    public Order getOrder(@PathVariable("id") Long id) {
        return orderService.getOrder(id);
    }

}
