package day32;

public class MathEx01 {

	public static void main(String[] args) {
		double pi = 3.141592;
		//소수점 첫번째자리 에서 반올림
		double pi1 = Math.round(pi);
		System.out.println(pi); 
		//소수점 두번째자리 에서 반올림
		double pi2  = Math.round(pi*10)/10;
		System.out.println(pi2);
		//소수점 세째자리 에서 반올림
		double pi3  = Math.round(pi*100)/100.0;
		System.out.println(pi3);
		//소수점 네번째자리 에서 반올림
		double pi4  = Math.round(pi*1000)/1000.0;
		System.out.println(pi4);
		
		int num =4;//숫자를 조절해서 내가 원하는 자리 반올림 가능..
		double pi4_2 = Math.round(pi*Math.pow(10, num-1)) / Math.pow(10,1-num);
		System.out.println(pi4_2);
	}

}
