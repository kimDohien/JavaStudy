package day7;

public class MethodEx01 {

	public static void main(String[] args) {
		/*
		 * Class 
		 * ● 멤버변수 
		 * 	-속성 
		 * ● 멤버 메소드
		 *  - 기능(전원,채도조절,명도조절 ...)
		 * ● 생성자 
		 *  -초기화
		 * 
		 * 
		 * 생성자 : 멤버 변수들의 값들을 초기화할때 사용한다. 
		 * ex) 자동차 클래스가 있으면 자동차르 공장에서 만들어서 출고할떄 기본색상을 뭐로할지?..옵션선택하는것
		 * 
		 * <기본 생성자(괄호에 아무것도 안들어가있는)> 
		 * public 클래스명(){ 
		 * 		초기화; 
		 * }
		 *
		 *
		 * <생성자> 
		 * public 클래스명(자료형 변수명, 자료형 변수명,...){
		 * 			 초기화; 
		 *  } 	
		 *  =>옵션에 따라서 나오는 차가 다른것처럼.. 변수들에 맞는 것들로 초기화가 되어 나옴.
		 *
		 *
		 * <복사 생성자> 
		 * public 클래스명(클래스명 객체명){
		 * 			 초기화;
		 *  } 
		 *  =>남이 만들어놓은 객체를 가지고 초기화 하는것.
		 *
		 *
		 * 메소드 : 기능
		 *
		 * 접근제한자 예약어 리턴타입 메소드명(매개변수들){ 
		 * 			구현; 
		 *  }
		 *
		 * ex) 메소드 = 음료수 자판기 ( 콜라, 사이다, 환타)
		 * 
		 * 리턴타입 = 음료수 
		 * 	ㄴ 기능이 끝나고 나서 돌려주는 정보의 자료형 
		 * 매개변수 = 돈, 메뉴(돈을 넣고 메뉴선택. 
		 * 	ㄴ 기능이 실행되기 위해서 필요한 정보들(필수)
		 * 
		 *
		 * 
		 * 메소드 호출
		 * 메소드명(매개변수/값)
		 */

		System.out.println(sum1(1,2)); //1+2가 뭐냐고 물어봄
		
		sum2(1,2); //sysout을 안써도 출력됨. 이유 :  내부에 sysout을 썼기 때문.
		
	}
	/*
	 * 메소드는 클래스 안에 위치해있어야 한다.
	 * 
	 * ⓐ기능 정리 : 두 정수가 주어지면 두 정수의 합을 알려주는 메소드 
	 * ⓑ매개변수 : 두 정수 => 자료형 변수명 int num1, int num2 (자료형 생략하면 안됨) 
	 * ⓒ리턴타입(일을 시키고나서 일을한 사람이 나에게 알려줄 정보가 있는지?) : 두 정수의 합 => 정수
	 * => int ⓓ메소드명 : sum1
	 */

	public static int sum1(int num1, int num2) {
		return num1 + num2;
	}

	/*
	 * ⓐ기능 정리 : 두 정수가 주어지면 두 정수의 합을 콘솔에 출력하는 메소드 
	 * ⓑ매개변수 : 두 정수 => 자료형 변수명 int num1, int num2 
	 * ⓒ리턴타입 : 없음 = >void (리턴타입 없음을 나타내는) 
	 * ⓓ메소드명 : sum2
	 */
	public static void sum2(int num1, int num2) {
		System.out.println(num1 + num2);
		return;
		// 지금 이 코드에서는 return이 필요없지만, void에서 return 생략가능
		// void에서 return을 사용할수 있다는 걸 보여주기 위해 추가함
	}

}