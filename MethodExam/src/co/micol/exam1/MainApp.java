package co.micol.exam1;

public class MainApp {
	public static void main(String[] args) {
		MethodTest methodtest = new MethodTest(); //메소드를 초기화
		methodtest.strTest1(); //void타입이라서 그대로호출
		
		
		String name = methodtest.strTest2(); //스트링타입이라 스트링타입선언후 담을 변수명이 필요하다. (리턴타입이있으니깐)
		System.out.println(name);
		
		String str = methodtest.strTest3();
		System.out.println(str);
	}
}
