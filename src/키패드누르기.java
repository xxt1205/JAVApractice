// <문제> https://programmers.co.kr/learn/courses/30/lessons/67256
public class 키패드누르기 {

	public static void main(String[] args) {
		
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		Solution14 s = new Solution14();
		System.out.println(s.solution(numbers, hand));
		System.out.println("x 축 : "+(13-1)%3 +", " + "y 축 : " +(13 -1)/3);
	}

}

class Solution14 {
	public String solution(int[] numbers, String hand) {

		String answer = "";
		int left = 10;
		int right = 12;

		for (int i = 0; numbers.length > i; i++) {
			int aNum = numbers[i];
			System.out.println("갈좌표" + aNum);
			if (aNum == 1 || aNum == 4 || aNum == 7) {
				left = aNum;
				answer += "L";
				System.out.println("L " + left);
			} else if (aNum == 3 || aNum == 6 || aNum == 9) {
				right = aNum;
				answer += "R";
				System.out.println("R " + right);
			}

			if (aNum == 2 || aNum == 5 || aNum == 8 || aNum == 0) {
				if (aNum == 0) {
					aNum = 11;
				}
				int leftHand = distance(left, aNum);
				int rightHand = distance(right, aNum);
				if (leftHand > rightHand) {
					answer += "R";
					right = aNum;
					System.out.println("R" + right);
				} else if (leftHand < rightHand) {
					System.out.println("L" + left);
					answer += "L";
					left = aNum;
				} else if (leftHand == rightHand) {
					if (hand.equals("left")) {
						left = aNum;
						answer += "L";
						System.out.println("L" + left);
					}
					if (hand.equals("right")) {
						right = aNum;
						answer += "R";
						System.out.println("R" + right);
					}
				}

			}
		}
		System.out.println(answer);
		return answer;
	}

	public static int distance(int location, int num) {
		int result = 0;

		int lx = (location - 1) % 3;
		int ly = (location - 1) / 3;

		int hx = (num - 1) % 3;
		int hy = (num - 1) / 3;

		result = Math.abs(lx - hx) + Math.abs(ly - hy);

		return result;
	}
}
   