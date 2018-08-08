public class ZeroMatrix {

	public static void main(String[] args) {
		int[][] a = {{1,0,3},{0,2,9},{6,7,8}};

		print2DArray(a);

		setZerosTwo(a);

		System.out.println("After zero substitution");

		print2DArray(a);
	}



	public static void setZerosOne(int[][] a) {
		boolean[] row = new boolean[a.length];
		boolean[] col = new boolean[a[0].length];

		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				if(a[i][j] == 0) {
					row[i] = true;
					col[j] = true;
				}
			}
		}

		//nullify rows
		for (int i=0; i<row.length; i++) {
			if (row[i])
				nullifyRow(a, i);
		}

		//nullify cols
		for (int i=0; i<col.length; i++) {
			if (col[i])
				nullifyCol(a, i);
		}

	}

	public static void nullifyRow(int[][] a, int row) {
		//nullify row
		for (int i=0; i<a[row].length; i++) {
			a[row][i] = 0;
		}

	}

	public static void nullifyCol(int[][] a, int col) {
		//nullify col
		for (int i=0; i<a.length; i++) {
			a[i][col] = 0;
		}
	}

	public static void print2DArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void setZerosTwo(int[][] a) {

		boolean firstRowHasZero = false;
		boolean firstColHasZero = false;


		//check if first row has any zeros
		for (int i=0; i<a[0].length; i++) {
			if(a[0][i] == 0) {
				firstRowHasZero = true;
				break;
			}

		}

		//check if first column has any zeros
		for (int i=0; i<a.length; i++) {
			if(a[i][0] == 0) {
				firstColHasZero = true;
				break;
			}

		}

		//when there is a zero set the first row and column to zero
		for (int i=1; i<a.length; i++) {
			for (int j=1; j<a[i].length; j++) {
				if (a[i][j] == 0) {
					a[0][j] = 0;
					a[i][0] = 0;
				} 
			}
		}

		for (int i=0; i<a[0].length; i++) {
			if (a[0][i] == 0) {
				nullifyCol(a, i);
			}
		}

		for (int i=0; i<a.length; i++) {
			if (a[i][0] == 0) {
				nullifyRow(a, i);
			}
		}

		if (firstRowHasZero) {
			nullifyRow(a, 0);
		}

		if (firstColHasZero) {
			nullifyCol(a, 0);
		}

	}

}