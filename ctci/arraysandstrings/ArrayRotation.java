
public class ArrayRotation {
	public static void main(String[] args) {
		//int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] a = { { 1, 2 }, { 3, 4 } };
		//int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14,15, 16 } };
		//int[][] a = { { 1, 2, 3, 4 ,5}, { 6, 7, 8,9,10 }, { 11, 12,13,14,15 }, {16,17,18,19,20 },{21,22,23,24,25 }};
		//int[][] a = { { 1, 2, 3, 4 ,5,6}, { 7, 8,9,10,11, 12 }, {13,14,15,16,17,18}, {19,20,21,22,23,24},{25,26,27,28,29,30},{31,32,33,34,35,36}};

		print2DArray(a);

		rotate(a);

		System.out.println("After rotation");

		print2DArray(a);
	}

	public static void print2DArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void rotateNew(int[][] a) {
		for (int i=0; i<a.length/2; i++) {
			int l;
			if (i==0)
				l = a.length-1;
			else
				l = a.length-i*2;
			for(int j=0; j < l-i; j++) {
				System.out.println(a[l-j][i] + "-->" + a[i][i+j] + "-->" + a[j+i][l] + "-->" + a[l][l-j] + "-->" + a[l-j][i]);
			}
		}
	}
	
	public static void rotate(int[][] a) {
		for (int i=0; i<a.length/2; i++) {
			int l = a.length-1-i;
			for(int j=0; j < l-i; j++) {
				System.out.println(a[l-j][i] + "-->" + a[i][i+j] + "-->" + a[j+i][l] + "-->" + a[l][l-j] + "-->" + a[l-j][i]);
				int prev = swap(a, a[l-j][i], i, i+j);
				prev = swap(a, prev, j+i, l);
				prev = swap(a, prev, l, l-j);
				prev = swap(a, prev, l-j, i);
			}
		}
	}
	
	public static int swap(int[][] a, int value, int row, int col) {
		int tempReturn = a[row][col];
		a[row][col] = value;
		return tempReturn;
	}

}
