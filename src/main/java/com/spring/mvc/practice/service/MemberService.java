package com.spring.mvc.practice.service;

import com.spring.mvc.practice.domain.Member;
import com.spring.mvc.practice.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository repository;


    public List<Member> getList(){

        List<Member> memberList = repository.getMemberList();

        return memberList;
    };


    public void joinMember(Member member){

        repository.joinMember(member);


    }







}
