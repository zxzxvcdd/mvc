package com.spring.mvc.practice.repository;

import com.spring.mvc.practice.domain.Member;

import java.util.List;

public interface MemberRepository {

    boolean joinMember(Member member);

    List<Member> getMemberList();


}
