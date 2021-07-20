package co.micol.prj;

public class SelectiongSort {
	
	//버블소트(가까운배열비교) 퀵소트(중의값_재귀함수>양쪽)
	
	private int[] arr = { 5, 2, 3, 4, 1 };

	public void selectSort() { //전통적인 선택소트
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) { // asc sort < desc sort
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int n : arr) {
			System.out.print(n + " : ");
		}
	}

	public void selectSort2() { //진화된 선택소트
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}//for end
			if (min != i) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}//sort end
		for (int n : arr) {
			System.out.print(n + " : ");
		}//method end
	}
}
