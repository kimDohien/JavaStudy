package day5;

public class While {

	public static void main(String[] args) {
		/*1 부터 10사이의 홀수의 합을 구하는 코드를 while문으로 작성하세요.
		 *  
		 */
		int i=0,sum=0;
					
		while(++i<=10) {
			if(i % 2 != 0) {
				sum +=i;
			}
			
		}
		System.out.println(sum);	
		
//		
//		<방법2>		
//		while(i<=10) {
//			if(i % 2 != 0) {
//				sum +=i;
//			}
//			++i;
//		}
//		System.out.println(sum);	
//					
		}
	}


