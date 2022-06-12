import java.util.Arrays;
import java.util.StringTokenizer;


public class 다트게임 {
    public static void main(String[] args) {
        Solution22 s = new Solution22();
        String str = "1D2S0T";
        s.solution(str);
    }
}
class Solution22 {
    public int solution(String dartResult) {
        int answer = 0;
        StringTokenizer str = new StringTokenizer(dartResult,"SDT*#");
        StringTokenizer bonus = new StringTokenizer(dartResult,"0123456789");

        String[] add = new String[bonus.countTokens()];
        int[] bonusint = new int[str.countTokens()];

        int i = 0;
        while(bonus.hasMoreTokens()) {
            add[i] = bonus.nextToken();

            i++;
        }
        i = 0;
        while(str.hasMoreTokens()) {
            bonusint[i] = Integer.parseInt(str.nextToken());


            i++;
        }
        System.out.println(Arrays.toString(add));
        for(int j = 0; j < 3; j++){

            switch (add[j]) {
                case "S": bonusint[j] = (int) Math.pow(bonusint[j],1);
                    break;
                case "S*": bonusint[j] = (int) Math.pow(bonusint[j],1) * 2; if (j != 0){bonusint[j-1] =bonusint[j-1]*2;}
                    break;
                case "S#" : bonusint[j] = (int) Math.pow(bonusint[j],1) * (-1);
                    break;
                case "D": bonusint[j] = (int) Math.pow(bonusint[j],2);
                    break;
                case "D*": bonusint[j] = (int) Math.pow(bonusint[j],2) * 2; if (j != 0){bonusint[j-1] =bonusint[j-1]*2;}
                    break;
                case "D#" : bonusint[j] = (int) Math.pow(bonusint[j],2) * (-1);
                    break;
                case "T": bonusint[j] = (int) Math.pow(bonusint[j],3);
                    break;
                case "T*": bonusint[j] = (int) Math.pow(bonusint[j],3) * 2; if (j != 0){bonusint[j-1] =bonusint[j-1]*2;}
                    break;
                case "T#" : bonusint[j] = (int) Math.pow(bonusint[j],3) * (-1);
                    break;
            }

        }
        for(int j : bonusint){
            answer+= j;

        }
        System.out.println(answer);
        return answer;
    }
}