package kosta.mission;

import java.util.Scanner;

public class Mission03 {

	public static void main(String[] args) {
		//로그인 예제를 구현 하시오.
		//id, pass 키보드로 부터 입력 받는다.
		//id, pass 일치하면 => 로그인 성공
		//id가 불일치 하면 => 해당 아이디가 존재하지 않습니다.
		//pass 불일치 => 비밀번호가 일치하지 않습니다.
		
		Scanner sc = new Scanner(System.in);
		String m_id = "junbeom";
		String m_pass = "4018";
		
		System.out.print("아이디를 입력하세요 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호를 입력하세요 : ");
		String pass = sc.nextLine();
		
		
		
		if(id.equals(m_id) && pass.equals(m_pass)) {
			System.out.println("로그인 성공");
		}else if(id.equals(m_id) == false) {
			System.out.println("해당 아이디가 존재하지 않습니다.");
		}else if(pass.equals(m_pass) == false) {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
	}

}
