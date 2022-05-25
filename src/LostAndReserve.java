import java.util.ArrayList;

public class LostAndReserve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution5 s = new Solution5();
		
		int[] lost = {3};
		int[] reserve = {1};
		
		System.out.println(s.solution(3, lost, reserve));
	}

}

class Solution5 {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		int result = n - lost.length;
		
		ArrayList<Integer> lost1 = new ArrayList<>(lost.length);
		for(int i=0; lost.length - 1 >= i; i++) {
			lost1.add(lost[i]);
		}
		lost1.add(-5);
		
		ArrayList<Integer> reserve1 = new ArrayList<>(reserve.length);
		for(int i=0; reserve.length - 1 >= i; i++) {
			reserve1.add(reserve[i]);
		}
		reserve1.add(-5);
		
		System.out.println(lost1);
		System.out.println(reserve1);
		int i = 0;
		for(int j = 0; lost1.size() - 1 >= j; j++) {
			if(lost1.get(j) == -5) break;
			if(reserve1.get(i) == -5)break;
			if(lost1.get(j) - reserve1.get(i) == 1 ||lost1.get(j) - reserve1.get(i) == -1) {
				result += 1;
				i++;
			}
		}
			System.out.println("return : " + result);
				
				
		answer = result;
		return answer;
	
	}
}