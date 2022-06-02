
public class rotto최고최저순위 {

	public static void main(String[] args) {
		
		int[] lottos = { 44, 1, 0, 0, 31, 25 };
		int[] win_nums = { 31, 10, 45, 1, 6, 19 };
		Solution17 s = new Solution17();
		s.solution(lottos, win_nums);

	}

}

class Solution17 {
	public int[] solution(int[] lottos, int[] win_nums) {
		 
		int count = 0;
		int rate = 6;
		int unknown = 0;
		
		
		for (int i = 0; 6 > i; i++) {
			if(lottos[i] == 0) {
				unknown++;
				
			}
			for (int j = 0; 6 > j; j++) {
				if (lottos[i] == win_nums[j] && lottos[i] != 0) {
					count++;
					if (count >= 2) {
						rate--;
					}
				}
			}

		}
		System.out.println(rate+ ", "+unknown+ "," + count);
		int max = rate - unknown;
		int min = rate;
		if(max < 1) {
			max = 1;
		}
		if(min > 6) {
			min = 6;
		}
		
		System.out.println(max+", "+min); 
		int[] answer = {max, rate};
		return answer;
	}
}