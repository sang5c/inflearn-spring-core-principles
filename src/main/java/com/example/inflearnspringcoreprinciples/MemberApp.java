package com.example.inflearnspringcoreprinciples;

import com.example.inflearnspringcoreprinciples.member.*;

public class MemberApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        Member newMember = new Member(1L, "memberA", Grade.VIP);
        memberService.join(newMember);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + newMember.getName());
        System.out.println("find member = " + findMember.getName());
    }
}
