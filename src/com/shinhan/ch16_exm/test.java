package com.shinhan.ch16_exm;

public class test {

	public static void main(String[] args) {
		int array1[] = { 1, 2, 2, 3, 3, 3, 4, 4 };
		int array2[] = { 1, 1, 2, 2 };
		int array3[] = { 1 };
		Solution sol1 = new Solution();
		System.out.println(sol1.solution(array1));
		// System.out.println(sol1.solution(array2));
		// System.out.println(sol1.solution(array3));
	}

}

class Solution {
	public int solution(int[] array) {
		int answer = 0;
		int count = 1;
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					if (answer != array[i]) {
						if (count >= temp) {
							temp = count;
							count = 0;
							answer = array[i];
							// System.out.println(count+""+temp);
						}
						count = 1;
						continue;
					}
					count++;

				}
			}
		}
		if (count == temp)
			answer = -1;
		if (array.length == 1)
			answer = array[0];

		return answer;
	}
}