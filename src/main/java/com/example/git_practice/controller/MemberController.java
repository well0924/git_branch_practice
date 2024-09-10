package com.example.git_practice.controller;

import com.example.git_practice.domain.Member;
import com.example.git_practice.service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/")
    public ResponseEntity<?> memberList() {
        List<Member>members = memberService.getMemberAll();
        return ResponseEntity.ok(members);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> memberDetail(@PathVariable("id")Integer id) {
        Member member = memberService.getMemberById(id);
        return ResponseEntity.ok(member);
    }

    @PostMapping("/")
    public ResponseEntity<?> createMember(@RequestBody Member member) {
        Integer createResult = memberService.createMember(member);
        return ResponseEntity.ok(createResult);
    }
}
