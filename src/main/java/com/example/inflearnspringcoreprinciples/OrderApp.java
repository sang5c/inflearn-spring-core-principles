package com.example.inflearnspringcoreprinciples;

import com.example.inflearnspringcoreprinciples.member.Grade;
import com.example.inflearnspringcoreprinciples.member.Member;
import com.example.inflearnspringcoreprinciples.member.MemberService;
import com.example.inflearnspringcoreprinciples.order.Order;
import com.example.inflearnspringcoreprinciples.order.OrderService;

public class OrderApp {

    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();

        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        System.out.println("order = " + order);
        System.out.println("order.calculatePrice() = " + order.calculatePrice());
    }
}
