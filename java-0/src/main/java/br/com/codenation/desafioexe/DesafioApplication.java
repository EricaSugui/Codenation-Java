package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

	public static List<Integer> fibonacci() {
		List<Integer> fiboNum = new ArrayList<>();
		Integer lastNum = 0;
		fiboNum.add(lastNum);
		fiboNum.add(lastNum + 1);
		int i = 1;

		while(lastNum < 350){
			lastNum = fiboNum.get(i) + fiboNum.get(i -1);
			fiboNum.add(lastNum);
			i++;
		}
		return fiboNum;
	}

	public static Boolean isFibonacci(Integer a) {
		return fibonacci().contains(a);
	}

}