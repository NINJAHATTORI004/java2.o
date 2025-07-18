import java.util.*;

class dfsmatrix {
    int vertices;
    int[][] matrix;
    
    dfsmatrix(int v) {
        vertices = v;
        matrix = new int[v][v];
    }
    
    void addEdge(int src, int dest) {
        matrix[src][dest] = 1;
        matrix[dest][src] = 1; 
    }
    
    void startDFS(int start) {
        boolean[] visited = new boolean[vertices];
        Stack<Integer> stack = new Stack<>();
        
        stack.push(start);
        
        while (!stack.isEmpty()) {
            int current = stack.pop();
            
            if (!visited[current]) {
                visited[current] = true;
                System.out.print(current + " ");
                
                
                for (int i = vertices - 1; i >= 0; i--) {
                    if (matrix[current][i] == 1 && !visited[i]) {
                        stack.push(i);
                    }
                }
            }
        }
    }
    
    void displayMatrix() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        dfsmatrix graph = new dfsmatrix(5);
        
        
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        
        graph.displayMatrix();
        
        System.out.println("\nDFS Traversal starting from vertex 0:");
        graph.startDFS(0);
    }
}