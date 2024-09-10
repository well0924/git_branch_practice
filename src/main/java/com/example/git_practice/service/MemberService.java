package com.example.git_practice.service;

import com.example.git_practice.domain.Member;
import com.example.git_practice.repository.MemberRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional(readOnly = true)
    public List<Member> getMemberAll() {
        return memberRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Member getMemberById(Integer id) {
        return memberRepository.findById(id)
                .orElseThrow(()->new RuntimeException("회원이 없습니다."));
    }

    public Integer createMember(Member member) {
        Member save = Member
                .builder()
                .userId(member.getUserId())
                .password(member.getPassword())
                .userName(member.getUserName())
                .createdTime(LocalDateTime.now())
                .build();
        save = memberRepository.save(save);
        return save.getId();
    }
}
