import java.util.ArrayList;
import java.util.List;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution8 s = new Solution8();
		System.out.println(s.solution(2, 5));
	}

}

class Solution8 {
    public List<Long> solution(int x, int n) {
        
        
        List<Long> list = new ArrayList<Long>();
        
        long result = 0;
        for(int i = 0; n > i; i++){
            result += x;
            list.add(result);
        }
        return list;
    }
}