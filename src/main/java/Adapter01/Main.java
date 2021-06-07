package Adapter01;


// 클래스에 의한 Adapter 패턴

public class Main {
	
	public static void main(String[] args) {
		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printSrong();

		// TEST
	}

}
