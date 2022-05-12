package kosta.di;

import org.springframework.stereotype.Service;

@Service
public class KostaService implements Kosta {

	public void list() {
		System.out.println("KostaService list() 호출");
	}

	public void insert() {
		System.out.println("KostaService insert() 호출");
	}

}
