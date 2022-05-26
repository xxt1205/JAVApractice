import java.util.ArrayList;
import java.util.Collections;

class Solution5 {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		int result = n - lost.length;
		
		ArrayList<Integer> lost1 = new ArrayList<>(lost.length);
		for(int i=0; lost.length > i; i++) {
			lost1.add(lost[i]);
		}
		
		
		ArrayList<Integer> reserve1 = new ArrayList<>(reserve.length);
		for(int i=0; reserve.length > i; i++) {
			reserve1.add(reserve[i]);
		}
		
		
		Collections.sort(lost1);
		Collections.sort(reserve1);
		for(int i = 0; lost1.size() > i; i++) {
			for(int j = 0; reserve1.size() > j; j++) {
				if(reserve1.get(j) == lost1.get(i)) {
					
					reserve1.set(j, -1);
					lost1.set(i, -1);
					
					result ++;
					break;
				}
			}
		}
		System.out.println(lost1);
		System.out.println(reserve1);
		for(int j = 0; lost1.size() > j; j++) {
			
			for(int i = 0; reserve1.size() > i; i++) {
				
				if(lost1.get(j) - reserve1.get(i) == 1 || lost1.get(j) - reserve1.get(i) == -1) {
					
					reserve1.set(i, -1);
					lost1.set(j, -1);
					
					result++;
					
				}
			}
		}
		System.out.println(lost1);
		System.out.println(reserve1);
			System.out.println("return : " + result);
				
				
		answer = result;
		return answer;
	
	}
}