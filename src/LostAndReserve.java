import java.sql.Array;

public class LostAndReserve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution5 s = new Solution5();
		
		int[] lost = {2,4};
		int[] reserve = {3};
		
		System.out.println(s.solution(5, lost, reserve));
	}

}

class Solution5 {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		int result = n - lost.length;
		int[] reserve1 = ArrayUtils
		
		System.out.println(lost.length);
		System.out.println(result);
		int i = 0;
		for (int j = 0; lost.length - 1 >= j; j++) {
			if(reserve[i] == -100 || lost[j] == -100) {
				break;
			}
			if(lost[j] - reserve[i] == 1 || lost[j] - reserve[i] == -1) {
				result = result + 1;
				i += 1;
			}
		}
			
				
				
		answer = result;
		return answer;
	
	}
}