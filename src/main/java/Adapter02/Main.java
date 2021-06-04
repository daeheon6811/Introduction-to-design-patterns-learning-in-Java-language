package Adapter02;


// 인스턴스에 의한 Adapter 패턴

public class Main {
	
	public static void main(String[] args) {
		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printStrong();
		
	}
	

}
