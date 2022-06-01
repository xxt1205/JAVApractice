import java.util.Arrays;

public class 소수만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1,2,7,6,4};
		int[] num2 = {768,423,676,123,555,323,976};
		Solution15 s = new Solution15();
		s.solution(num);
	}

}
class Solution15 {
    public int solution(int[] nums) {
        int answer = 0;
        Arrays.sort(nums);
        for(int i =0 ; nums.length - 2> i; i++) {

        	for(int j =i + 1; nums.length - 1> j; j++) {
        		
        		for(int l = j + 1; nums.length > l; l++) {
        			
        			int resultNum = nums[i] + nums[j] + nums[l];
        			System.out.print(resultNum+" : ");
        			System.out.println(nums[i]+ ", " + nums[j] + ", " + nums[l]);
        			if(cal(resultNum) && resultNum >= 2) {answer++;}
        			
        			
        		}
        	}
        }
        
        
        System.out.println(answer);
        return answer;
    }
    public boolean cal(int num) {
    	for(int i = 2; Math.sqrt(num) >= i; i++) {
    		System.out.println(i);
    		System.out.println(Math.sqrt(num));
    		
    		if(num % i ==0) {System.out.println("거짓");return false;}
    	}
    	System.out.println("참");
    	return true;
    }
}