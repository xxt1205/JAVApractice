
public class Average {

	public static void main(String[] args) {
		
		Solution2 s2 = new Solution2();
		
		int [] arr = {1,2,3,4};
		int [] arr1 = {5,5};
		System.out.println(s2.solution(arr));
		
	
	}
	
}

class Solution2 {
	public double solution(int[] arr) {
		double answer = 0;
		
			double sum = 0;

			for (int i = 0; i < arr.length; i++) {

				
				sum += arr[i];

			}
			System.out.println(sum);
			answer = sum / arr.length;
		

		return answer;

	}
}