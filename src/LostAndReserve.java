import java.util.ArrayList;
import java.util.Collections;

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
		
		ArrayList<Integer> lost1 = new ArrayList<>(lost.length);
		for(int i=0; lost.length - 1 >= i; i++) {
			lost1.add(lost[i]);
		}
		
		
		ArrayList<Integer> reserve1 = new ArrayList<>(reserve.length);
		for(int i=0; reserve.length - 1 >= i; i++) {
			reserve1.add(reserve[i]);
		}
		
		
		
		for(int i = 0; lost1.size() > i; i++) {
			for(int j = 0; reserve1.size() > j; j++) {
				if(reserve1.get(j) == lost1.get(i)) {
					
					reserve1.set(j, 101);
					lost1.set(i, 101);
					
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
					
					reserve1.set(i, 101);
					lost1.set(j, 101);
					
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

//class Solution7 {
//    public int solution(int n, int[] lost, int[] reserve) {
//        int answer = n-lost.length;
//
//        //잃어버린 학생이 여분 체육복을 가지고 있을 때,
//        for(int i=0; i<lost.length; i++){
//            for(int j=0; j<reserve.length; j++){
//                if(lost[i]==reserve[j]){
//                    lost[i] = reserve[j] = -1;
//                    answer ++;
//                    break;
//                }
//            }
//        }
//
//        for(int i=0; i<lost.length; i++){
//            for(int j=0; j<reserve.length; j++){
//                if(lost[i]==reserve[j]-1 || lost[i]==reserve[j]+1){
//                    lost[i] = reserve[j] = -1;
//                    answer ++;
//                    break;
//                }
//            }  
//        }
//        return answer;
//    }
//}