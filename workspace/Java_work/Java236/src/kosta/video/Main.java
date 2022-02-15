package kosta.video;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Video v1 = new Video("1","경관의피","조진웅");
//		Video v2 = new Video("2","기생충","송강호");
		
		//SpecialMember : bonusPoint
		//구현
		
		Video videos[] = {
				 new Video("1","경관의피","조진웅"),
				 new Video("2","기생충","송강호")
		};
//		
//		GeneralMember members[] = {
//				new GeneralMember("aaa","홍길동","가산"),
//				new GeneralMember("bbb","박길동","서울")
//		};
		
//		Member m = new Member("3","김길동","동탄");
//		m.rentalVideo(videos[1]);
		
	
//		for(int i = 0; i < members.length; i++) {
//			members[i].setRental(videos[i]);
//			members[i].print();
//		}
//		GeneralMember m = new GeneralMember("aaa","홍길동","가산");
//		m.setRental(v1);
//		m.show();
//		
//		SpecialMember sm = new SpecialMember("2","박길동","강남",100);
//		sm.setRental(v2);
//		sm.show();
//		sm.print();
		
		GeneralMember arr[] = {
				new GeneralMember("aaa","홍길동","가산"),
				new SpecialMember("2","박길동","강남",100)
		};
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].setRental(videos[i]);
			arr[i].show();
		}
		
	}

}
