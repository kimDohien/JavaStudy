package day12;

public class InterfaceEx01 {

	public static void main(String[] args) {
		//인터페이스를 통해 객체를 생성할수 없다.
		//TvRemoteController tr = new TvRemoteController();
		//하지만 인터페이스 참조 변수에 객체를 저장할수있다.
		
		//구현클래스의 객체를 인터페이스 참조변수에 저장할수있다.
		TvRemoteController remocon1 = new TvRemoConA();
		//remocon1.print();
		//형변환을 통해서 
		((TvRemoConA)remocon1).print();

		TvRemoConA r2 = new TvRemoConA();
		
		r2.turn();
		for(int i = 0; i<10 ; i++) {
			r2.channelUp();
		}
		for(int i =0 ; i<2 ; i++) {
			r2.channelDown();
		}
		r2.channel(15);
		for(int i=0 ; i<2 ; i++) {
			r2.volumnUp();
		}
		for(int i=0; i<5 ; i++) {
			r2.volumnDown();
		}
		r2.print();
	}
	
	
}
