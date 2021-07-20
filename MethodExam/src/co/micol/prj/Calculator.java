package co.micol.prj;

public class Calculator {
	public int sum(int a, int b) {

		return a + b;
	}

	public void sub(int a, int b) {
		System.out.println(a - b);
	}

	public void sub(float f, int b) {
		System.out.println(f - b); //함수명이 같다_함수오버로딩 : 전달인자개수 달라도됌,
	}
	
	public long sub(long l, long m) {
		return l-m;
	}
}
