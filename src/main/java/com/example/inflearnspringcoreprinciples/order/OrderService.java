package com.example.inflearnspringcoreprinciples.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
