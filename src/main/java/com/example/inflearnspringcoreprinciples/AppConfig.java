package com.example.inflearnspringcoreprinciples;

import com.example.inflearnspringcoreprinciples.discount.DiscountPolicy;
import com.example.inflearnspringcoreprinciples.discount.FixDiscountPolicy;
import com.example.inflearnspringcoreprinciples.discount.RateDiscountPolicy;
import com.example.inflearnspringcoreprinciples.member.MemberRepository;
import com.example.inflearnspringcoreprinciples.member.MemberService;
import com.example.inflearnspringcoreprinciples.member.MemberServiceImpl;
import com.example.inflearnspringcoreprinciples.member.MemoryMemberRepository;
import com.example.inflearnspringcoreprinciples.order.OrderService;
import com.example.inflearnspringcoreprinciples.order.OrderServiceImpl;

public class AppConfig {

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
