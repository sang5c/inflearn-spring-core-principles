package com.example.inflearnspringcoreprinciples.discount;

import com.example.inflearnspringcoreprinciples.member.Grade;
import com.example.inflearnspringcoreprinciples.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {

    private static final int discountPercent = 10; // 10% 할인

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        }

        return 0;
    }
}
