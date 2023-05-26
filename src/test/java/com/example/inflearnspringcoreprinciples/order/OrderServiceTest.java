package com.example.inflearnspringcoreprinciples.order;

import com.example.inflearnspringcoreprinciples.AppConfig;
import com.example.inflearnspringcoreprinciples.member.Grade;
import com.example.inflearnspringcoreprinciples.member.Member;
import com.example.inflearnspringcoreprinciples.member.MemberService;
import com.example.inflearnspringcoreprinciples.member.MemberServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OrderServiceTest {
    private MemberService memberService;
    private OrderService orderService;

    @BeforeEach
    void beforeEach() {
        AppConfig appConfig = new AppConfig();
        orderService = appConfig.orderService();
        memberService = appConfig.memberService();
    }

    @Test
    void createOrder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }

}
