import java.util.ArrayList;
import java.util.Arrays;



public class 카카오지옥의뽑기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution11 s = new Solution11();
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		s.solution(board, moves);
	}

}
// 4 3 4 2 3 4

//0 0 0 0 0 board =1 - 0
//0 0 1 0 3 board =2 - 1
//0 2 5 0 1 board =3 - 2
//4 2 4 4 2 board =4 - 3
//3 5 1 3 1 board =5 - 4
class Solution11 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> store = new ArrayList<Integer>();
        
        
        
        
        
        int x = 0;
        for(int i = 0; moves.length > i; i++) {
        	for(int j = 0; board.length > j; j++) {
        		if(board[j][moves[i] - 1] != 0) {
        			store.add(store.size(),board[j][moves[i] - 1]);
        			board[j][moves[i] -1] = 0;
        			
        			if(store.size() > 1) {
        				if(store.get(x + 1) == store.get(x)) {
            				System.out.println(x);
            				
            				System.out.println(store);
        					answer+= 2;
            				store.remove(x);
            				System.out.println(store);
            				store.remove(x);
            				System.out.println(store);
            				x =store.size() - 1;
            				System.out.println("x뺀값"+x);
            			}else {
            				x++;
            			}
        			}
        			
        			
        			System.out.println("스토어" + store);
        			break;
        		}else if(board[j][moves[i] - 1] == 0) {
        			
        		}
        	}
        }
//        System.out.println(store);
        System.out.println(answer);  
        System.out.println(store);
        return answer;
    }
}

//