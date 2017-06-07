package com.kdn.project;

import com.kdn.model.domain.Member;
import com.kdn.model.service.MemberService;
import com.kdn.model.service.MemberServiceImpl;

public class MemberTest {

	public static void main(String[] args) {
		MemberService ms = new MemberServiceImpl();
		
		Member m = new Member(1, "acy", "acy", "안치영", "kdn", "01090325741", "acy@kdn.com", 1);
		
		Member find = ms.search(m.getId());
		
		System.out.println(find);
	}
}
