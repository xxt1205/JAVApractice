
public class 숫자와문자열16 {

	public static void main(String[] args) {
		Solution16 s = new Solution16();
		String str = "one4seveneight";
		System.out.println(s.solution(str));

	}

}
class Solution16 {
    public int solution(String str) {
        int answer = 0;
        String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight","nine"};
        String[] num = {"0","1","2","3","4","5","6","7","8","9"};
        for(int i = 0; word.length > i; i++) {
        	if(str.indexOf(word[i]) != -1) {
        		
        		str = str.replace(word[i], num[i]);
        		
        	}
        	
        }
        answer = Integer.parseInt(str);
        return answer;
    }
}