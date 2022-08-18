package kr.ac.sku.service;

import java.util.List;

import kr.ac.sku.dao.MemberDAO;
import kr.ac.sku.dto.MemberDTO;

public class MemberService {
	MemberDAO dao = new MemberDAO();
	// 회원가입
	public void joinMember(MemberDTO member) {
		// 회원 가입을 위해서 체크해야 하거나
		// 필요한 비즈니스가 있다면 여기서 구현 !!
		// 회원가입 조건에 충족하면 DB에 저장하도록 dao를 이용한다.
		boolean resultFlag = dao.addMember(member);
		if(resultFlag)
			System.out.println("DB에 저장 성공");
		else {
			System.out.println("DB에 저장하다가 문제 발생!!");
		}
	}
	// 회원목록
	public List<MemberDTO> getMemberList(){
		return dao.getMembers();
	}
}
