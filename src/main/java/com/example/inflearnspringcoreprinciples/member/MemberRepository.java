package com.example.inflearnspringcoreprinciples.member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
