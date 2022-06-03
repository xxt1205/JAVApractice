
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		String str2 ="";
		char[] arr = new char[str.length()];
		arr= str.toCharArray();
		System.out.println(arr);
		for(int i = arr.length - 1; i >=0; i--) {
			str2 += arr[i];
			System.out.println(str2);
		}
		
		int[] num = {9,1,4,7,5,3};
		int result = 12;
//		cal(num,result);
		
		
		
	}
}
	
//	public static void cal(int[] num, int num2) {
//		for(int i =0; num.length -1> i; i++) {
//			for(int j =0; num.length > j; j++) {
//				if(num[i] + num[j] == num2) {
//					System.out.println(num[i] + " + " + num[j] + "=" + num2);
//				}
//			}
//		}
//	}
//	public static void cal2() {
//		
//	}


