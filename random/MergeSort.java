import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Please pass array as command line arguments");
			System.out.println("Usage: java MergeSort 10 3 23 7");
		} else {
			int [] arrToSort = new int[args.length];
			boolean isArrayValid = true;
			for (int i=0; i<args.length; i++) {
				try {
					arrToSort[i] = Integer.parseInt(args[i]);	
				} catch(NumberFormatException e) {
					System.out.println("all the elements of the array should be of type integer");
					isArrayValid = false;
					break;
				}
				
			}
			if(isArrayValid)
				display(mergeSort(arrToSort));
		}
		
	}

	public static int[] mergeSort(int[] arr) {
		if (arr.length == 1) {
			return arr;
		} else {
			int mid = (int)arr.length/2;
			int [] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
			int [] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
			return merge(left, right);
		}
	}

	public static void display(int[] arr) {
		for(int num : arr) {
			System.out.print(num + ", ");
		}
		System.out.println("");
	}

	public static int[] merge(int[] left, int[] right) {
		int[] sortedArr = new int[left.length + right.length];
		int i,j,k;
		i = j = k = 0;
		while( i < left.length && j < right.length) {
			if( left[i] < right[j]){
				sortedArr[k] = left[i];
				i++;
			} else {
				sortedArr[k] = right[j];
				j++;
			}
			k++;
		}
		if ( i < left.length ) {
			System.arraycopy(left, i, sortedArr, k, left.length - i);
		} else {
			System.arraycopy(right, j, sortedArr, k, right.length - j);
		}
		return sortedArr;
	}
}
