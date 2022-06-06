
public class 내적 {

	public static void main(String[] args) {
		Solution20 s = new Solution20();
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		s.solution(a, b);
	}

}
class Solution20 {
    public int solution(int[] a, int[] b) {
        int answer = 0;
 
        int[] result = new int[a.length];

        for(int i = 0; a.length > i; i++) {
        	result[i] = a[i]*b[i];
        	
        }
        for(int i = 0; a.length > i; i++) {
        	answer += result[i];
        	System.out.println(answer);
        	
        }
        return answer;
    }
}