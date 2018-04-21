public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {54,26,93,17,77,31,44,55,20};
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + ",");
			if (i == arr.length-1)
				System.out.println("");
		}
		int length = arr.length;
		for (int i=0; i<length-1; i++) {
			int max_index = 0;
			int j;
			for (j=1; j<length-i; j++) {
				if (arr[max_index] < arr[j]) {
					max_index = j;
				}
			}
			System.out.println("(" + i + "," + j + ")");  
			if (max_index != j-1) {
				int temp = arr[max_index];
				arr[max_index] = arr[j-1];
				arr[j-1] = temp;
			}
		}
		for (int i=0; i<arr.length; i++) {
                        System.out.print(arr[i] + ",");
			if (i == arr.length-1)
                                System.out.println("");
                }
	}
}
