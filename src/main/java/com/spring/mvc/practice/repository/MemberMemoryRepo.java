package com.spring.mvc.practice.repository;

import com.spring.mvc.practice.domain.Member;
import com.spring.mvc.score.domain.Score;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MemberMemoryRepo implements MemberRepository {


    private static final Map<String, Member> memberMap = new HashMap<>();


    @Override
    public boolean joinMember(Member member) {

        memberMap.put(member.getId(),member);

        return true;
    }


    @Override
    public List<Member> getMemberList() {

        List<Member> memberList = new ArrayList<>();

        for (String id : memberMap.keySet()) {

            Member member = memberMap.get(id);
            memberList.add(member);
        }

        return memberList;
    }


}
