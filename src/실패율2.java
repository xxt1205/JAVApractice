import java.util.*;

public class 실패율2 {
    public static void main(String[] args) {
        Solution25 s = new Solution25();
        int[] stages = {2,1,2,6,2,4,3,3};
        int N = 5;
        int[] stages2 = {3,3,3,3};
        int N2 = 5;
        s.solution(N, stages);
    }
}
class Solution25 {
    public int[] solution(int N, int[] stages) {
        double[] result = new double[N];
        double[] result2 = new double[N];
        double count =0;
        Map<Integer,Double> mp = new HashMap<Integer,Double>();
        for (int i = 0; i < N; i++){
           for (int j =0; stages.length > j; j++){
               if(i + 1 == stages[j]){
                   result[i]++;

               }
           }
            System.out.println(result[i]);
            if (i > 0) {
                count += result[i - 1];
                if (result[i] == 0.0) {
                    result2[i] = 0.0;
                } else {
                result2[i] = (result[i] / (stages.length - count)) * 100;
            }
            } else{
                result2[i]= (result[i] / stages.length) * 100;
            }

            mp.put(i+1,result2[i]);
        }
        List<Integer> result3 = new ArrayList<>(mp.keySet());
        Collections.sort(result3,((o1, o2) -> (mp.get(o2).compareTo(mp.get(o1)))));
        int [] answer = new int[N];
        for (int i = 0; i < N; i++){
            answer[i] = result3.get(i);
        }
        System.out.println(Arrays.toString(answer));

        return answer;
    }

}
