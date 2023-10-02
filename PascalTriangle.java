
public class PascalTriangle {
	public static void printPascalTriangle(int row) {
	}

	public static int[] getPascalTriangle(int n) {
		return null;
	}

	public static int[] generateNextRow(int[] prevRow) {
		int[] nextRow = new int[prevRow.length + 1];
		nextRow[0] = 1;
		nextRow[nextRow.length - 1] = 1;
		for (int i = 0; i < prevRow.length - 1; i++) {
			nextRow[i + 1] = prevRow[i] + prevRow[i + 1];
		}
		return nextRow;
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 3, 1 };
		print(generateNextRow(arr));
	}
}