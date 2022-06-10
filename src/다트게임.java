public class 다트게임 {
    public static void main(String[] args) {
        Solution22 s = new Solution22();
        String str = "1S2D*3T";
        s.solution(str);
    }
}
class Solution22 {
    public int solution(String dartResult) {
        int answer = 0;
         char[] dart = dartResult.toCharArray();
         for (int i =0; dart.length > i; i++){

             if (dart[i] =='S' || dart[i] == 'D' || dart[i] == 'T'){
                 System.out.println(dart[i]);
             }
         }


        return answer;
    }
}