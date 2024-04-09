import java.util.ArrayList;

public class convertion2 {

	static ArrayList<ArrayList<Integer>> convert(int[][] a) {

		int l = a[0].length;
		ArrayList<ArrayList<Integer>> adjListArray = new ArrayList<ArrayList<Integer>>(l);

		for (int i = 0; i < l; i++) {
			adjListArray.add(new ArrayList<Integer>());
		}

		int i, j;
		for (i = 0; i < a[0].length; i++) {
			for (j = 0; j < a.length; j++) {
				if (a[i][j] != 0) {
					adjListArray.get(i).add(j);
				}
			}

		}

		return adjListArray;
	}

	static void printArrayList(ArrayList<ArrayList<Integer>> adjListArray) {

		for (int v = 0; v < adjListArray.size(); v++) {
			System.out.print(v);
			for (Integer u : adjListArray.get(v)) {
				System.out.print(" -> " + u);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		int[][] a = { { 0, 0, 1 }, { 0, 0, 1 }, { 1, 1, 0 } };

		ArrayList<ArrayList<Integer>> adjListArray = convert(a);
		System.out.println("Adjacency List: ");

		printArrayList(adjListArray);
	}
}
