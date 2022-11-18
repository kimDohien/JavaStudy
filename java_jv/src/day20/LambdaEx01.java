package day20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaEx01 {

	public static void main(String[] args) {
		/*
		 * 람다식을 이용하여 생성된 것은? => 객체
		 * 인터페이스를 이용하여 객체를 만들때 구현 클래스 or 익명클래스가 필요하다
		 * =>익명 클래스 or 구현 클래스없이 바로 객체를 생성할수 있게 하는것이 람다식
		 */
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(10);
		list.add(8);
		list.add(0);
		System.out.println(list); //정렬안된 list
		
		Comparator<Integer> comparator/*참조변수*/ = (a,b)-> a-b;/*객체*/
		//참조변수에 저장할수 있는것 -> 객체
		Collections.sort(list,comparator);
		System.out.println(list);//정렬된 list
		System.out.println(comparator.compare(1, 2));
		
	}
}
