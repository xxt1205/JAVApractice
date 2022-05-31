import java.util.ArrayList;
import java.util.Arrays;

public class 키패드누르기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		Solution14 s = new Solution14();
		s.solution(numbers, hand);
	}

}

class Solution14 {
    public String solution(int[] numbers, String hand) {
    	
    	String answer = "";
    	String left_st = "*";
    	String right_st = "#";
    	
    	
    	int[] startH = {0, 0};
    	ArrayList<Integer> moveL = new ArrayList<Integer>();
    	ArrayList<Integer> moveR = new ArrayList<Integer>();
    	
    	
    	for(int i = 0; numbers.length > i; i++) {
    		int aNum = numbers[i];
    		
    		switch(aNum) {
    		case 1 : 
    		case 4 :
    		case 7 : answer.concat("L"); moveL.add(numbers[i]); startH[0] = 1;
    		case 3 :
    		case 6 :
    		case 9 : answer.concat("R"); moveR.add(numbers[i]);	startH[0] = 2;
    		
    		
    		}
    		
    	}
        
        return answer;
    }
    public double distance(int[] now, int[] location) {
    	double result =0;
    	return result;
    }
}
   