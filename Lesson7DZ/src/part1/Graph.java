package part1;

public class Graph {
    Vertex[] vertexList;
    int[][] matrix;
    int maxVertex = 32;
    int size;

    Stack stack;
    Queue queue;

    public Graph() {
        queue = new Queue(maxVertex);
        stack = new Stack(maxVertex);
        vertexList = new Vertex[maxVertex];
        matrix = new int[maxVertex][maxVertex];
        size = 0;
    }

    public void addEdge(int one, int two) {
        matrix[one][two] = 1;
        matrix[two][one] = 1;
    }

    public void addVertex(char label) {
        vertexList[size++] = new Vertex(label);
    }

    public void displayVertex(int vertex) {
        System.out.println(vertexList[vertex].label);
    }

    //depth-first search
    public void dfs() {
        vertexList[0].wasVisited = true;
        displayVertex(0);
        stack.push(0);
        while (!stack.isEmpty()) {
            int v = getUnvisitedVertex(stack.peek());
            if (v == -1)
                stack.pop();
            else {
                vertexList[v].wasVisited = true;
                displayVertex(v);
                stack.push(v);
            }
        }
        for (int i = 0; i < size; i++) {
            vertexList[i].wasVisited = false;
        }
    }

    //breadth-first search
    public void bfs() {
        vertexList[0].wasVisited = true;
        displayVertex(0);
        queue.insert(0);
        int w;
        while (!queue.isEmpty()) {
            int v = queue.remove();
            while ((w = getUnvisitedVertex(v)) != -1) {
                vertexList[w].wasVisited = true;
                displayVertex(w);
                queue.insert(w);
            }
        }
        for (int i = 0; i < size; i++) {
            vertexList[i].wasVisited = false;
        }
    }


    private int getUnvisitedVertex(int ver) {
        for (int i = 0; i < size; i++) {
            if (matrix[ver][i] == 1 && !vertexList[i].wasVisited)
                return i;
        }
        return -1;
    }
}
