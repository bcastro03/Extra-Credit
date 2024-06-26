import java.util.Vector;

public class convertion {

	static void insert(Vector<Integer> adj[], int u, int v) {
		adj[u].add(v);
		return;
	}


	static void printList(Vector<Integer> adj[], int V) {
		for (int i = 0; i < V; i++) {
			System.out.print(i);

			for (int j : adj[i])
				System.out.print(" --> " + j);

			System.out.println();
		}
		System.out.println();
	}


	static int[][] convert(Vector<Integer> adj[], int V) {

	
		int[][] matrix = new int[V][V];

		for (int i = 0; i < V; i++) {
			for (int j : adj[i])
				matrix[i][j] = 1;
		}
		return matrix;
	}


	static void printMatrix(int[][] adj, int V) {
		for (int i = 0; i < V; i++) {
			for (int j = 0; j < V; j++) {
				System.out.print(adj[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int V = 5;

		@SuppressWarnings("unchecked")
		Vector<Integer>[] adjList = new Vector[V];
		for (int i = 0; i < adjList.length; i++)
			adjList[i] = new Vector<Integer>();

		insert(adjList, 0, 1);
		insert(adjList, 0, 4);
		insert(adjList, 1, 0);
		insert(adjList, 1, 2);
		insert(adjList, 1, 3);
		insert(adjList, 1, 4);
		insert(adjList, 2, 1);
		insert(adjList, 2, 3);
		insert(adjList, 3, 1);
		insert(adjList, 3, 2);
		insert(adjList, 3, 4);
		insert(adjList, 4, 0);
		insert(adjList, 4, 1);
		insert(adjList, 4, 3);

		System.out.print("Adjacency List: \n");
		printList(adjList, V);
	
		int[][] adjMatrix = convert(adjList, V);

		System.out.print("Adjacency Matrix: \n");
		printMatrix(adjMatrix, V);
	}

}
