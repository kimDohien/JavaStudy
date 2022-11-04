package day10;

import day10_1.TestB;

//접근제한자 예제

public class AcessModifierEx01 {

	public static void main(String[] args) {
		TestA a = new TestA();
		TestB b = new TestB();
		//a.num1 = 1; //에러발생 이유 : private때문에 외부에서 접근할수 없음
		a.num2 = 2;	//default이고 같은 패키지 이기 때문에 정상동작
		a.num3 = 3;
		//b.num1 = 1;//에러발생 이유 : private때문에 외부에서 접근할수 없음
		//b.num2 = 2;//에러발생 이유 : default이기 때문에 다른 패키지에서 접근할수 없음.
		b.num3 = 3;
	}

}
