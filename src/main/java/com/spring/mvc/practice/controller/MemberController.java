package com.spring.mvc.practice.controller;

import com.spring.mvc.practice.domain.Member;
import com.spring.mvc.practice.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@Log4j2
public class MemberController {

    private final MemberService service;


    @PostMapping("/member/List")
    public String list(Model model){

        List<Member> memberList = service.getList();

        model.addAttribute("memberList",memberList);

        return "practice/memberList";
    }

    @GetMapping("/member/join")
    public String join(Member member){

        service.joinMember(member);
        return "redirect:member/List";


    }


    @GetMapping("/member/joinPage")
    public String joinPage(){

        return "practice/joinMember";
    }





}
