

public class 비밀지도 {

	public static void main(String[] args) {
		Solution17 s = new Solution17();
		int [] arr1 = {9, 20, 28, 18, 11};
		int [] arr2 = {30, 1, 21, 17, 28};
		int [] arr3 = {46, 33, 33 ,22, 31, 50};
		int [] arr4 = {27 ,56, 19, 14, 14, 10};
		int n = 5;
		int n2 = 6;
		s.solution(n, arr1, arr2);

	}

}
class Solution17 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        
   
       String[] result = new String[n];
        	for(int j = 0; n > j; j++) {
        		
        		result[j] = 
        		String.format("%0"+n+"d", Long.parseLong(Integer.toBinaryString(arr1[j]|arr2[j])))
        		.replaceAll("0", " ").replace("1", "#");
        		      	System.out.println(result[j]);

        }

        return result;
    }
}