package co.micol.exam1;

public class MethodTest {
	void strTest1(){
		System.out.println("void타입 테스트");
	}
	public String strTest2() {
		return "홍길동"; //리턴구문에 스트링타입의 값을 넣음
	}
	
	String strTest3() {
		String str = "박승리";
		return str; //리턴구문에 스트링타입의 변수를 넣음
	}
}
