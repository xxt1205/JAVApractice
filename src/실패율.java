import java.util.Arrays;

public class 실패율 {

	public static void main(String[] args) {
		Solution21 s = new Solution21();
		int[] stages = {2,1,2,6,2,4,3,3};
		int N = 5;
		int[] stages2 = {4,4,4,4,4};
		int N2 = 4;
		s.solution(N2, stages2);
		

	}

}
class Solution21 {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        double[] result = new double[N];
        double[] result2 = new double[N];
        
        for(int i = 1; N >= i; i++) {
        	double count = 0;
        	double round = 0;
        	for(int j = 0; stages.length > j; j++) {
        		if(i == stages[j]) {
        			count++;
        			
        		} 
        		if(i <= stages[j]) {
//        			System.out.println("i: " + i+", stages[i] : " + stages[j]);
        			round++;
        		}
        		
        		
        	}
//        	System.out.println(count);
//        	System.out.println(round);
        	if(count == 0) {
        		result[i-1] = 0;
        		result2[i-1] = result[i-1];
        	}else {
        	result[i-1] = (count/round)*100;
        	result2[i-1] = result[i-1];
        	}
    		System.out.printf("%.0f%%\n", result[i-1]);
        	
        }
        Arrays.sort(result);
       
       int[] result3 = new int[N];
        for(int i = N - 1; i >= 0; i++) {
        	int count = 0;
        	for(int j = 0; N > j; j++) {
        		if(j + 1 < N) {
        			
        		}
        		if(result2[i] == result[j]) {
        			result3[i] = i;
        			count++;
        		}
        	}
        	
        }
        System.out.println(Arrays.toString(result3));
       
        return result3;
    }
}