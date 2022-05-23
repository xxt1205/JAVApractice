
public class LostAndReserve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution5 s = new Solution5();
		int[] lost = {2,4};
		int[] reserver = {1,3,5};
		s.solution(5, lost, reserver);
	}

}
class Solution5 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        for(int i = 0; n >= i; i++) {
        	if(lost[i] - reserve[i] != 1 || lost[i] - reserve[i] != -1) {
        		n = n -1;
        	}else if(reserve[i] == null) {
        		
        	}
        }
        System.out.println(n);
        return answer;
    }
}