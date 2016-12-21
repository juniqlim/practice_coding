public class Test {
	public static void main(String[] args) {
		int n = 3;
		
		int arrPoll1[] = new int[n];
		int arrPoll2[] = new int[n];
		int arrPoll3[] = new int[n];
		
		// ¼ÂÆÃ
		for (int i=1; i<=n; i++) {
			arrPoll1[i-1] = n-(i-1);
		}
		
		printNow(arrPoll1, arrPoll2, arrPoll3);
	}
	
	public static void printArray(int[] array) {
		System.out.println("");
		for (int temp : array) {
			System.out.print(temp+" ");
		}
	}
	
	public static void printNow(int[] array1, int[] array2, int[] array3) {
		printArray(array1);
		printArray(array2);
		printArray(array3);
	}
}
