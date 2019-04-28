package part1;

import java.util.ArrayList;
import java.util.Collections;

public class Graph {
    Vertex[] vertexList;
    int[][] matrix;
    int maxVertex = 32;
    int size;
    int currentPathLength;
    ArrayList<Integer> pathLength;

    Stack stack;
    Queue queue;

    public Graph() {
        queue = new Queue(maxVertex);
        stack = new Stack(maxVertex);
        vertexList = new Vertex[maxVertex];
        matrix = new int[maxVertex][maxVertex];
        size = 0;
        currentPathLength = 0;
        pathLength = new ArrayList<>();
    }

    public void addEdge(int one, int two) {
        matrix[one][two] = 1;
        matrix[two][one] = 1;
        vertexList[two].previous.add(vertexList[one]);
    }

    public void addVertex(char label) {
        vertexList[size++] = new Vertex(label);
    }

    public void addFinalVertex(char label) {
        vertexList[size++] = new Vertex(label,true);
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

    public int getShortestPath() {
        vertexList[0].wasVisited = true;
        //displayVertex(0);
        queue.insert(0);
        int w;
        while (!queue.isEmpty()) {
            int v = queue.remove();
            while ((w = getUnvisitedVertex(v)) != -1) {
                vertexList[w].wasVisited = true;
                //displayVertex(w);
                queue.insert(w);
                if (vertexList[w].isFinal){ ;
                    return calculateShortestPath(vertexList[w]);
                }
            }
        }
        for (int i = 0; i < size; i++) {
            vertexList[i].wasVisited = false;
        }
        return -1;
    }

    private int calculateShortestPath(Vertex ver) {
        Vertex currentVer = ver;
        ArrayList<Integer> sum = new ArrayList<>();
        for (int i = 0; i < ver.previous.size(); i++) {
            int counter = 1;
            while (currentVer.previous.size() != 0){
                currentVer = currentVer.previous.get(0);
                counter++;
            }
            sum.add(counter);
            currentVer = ver;
        }
        return Collections.min(sum);
    }


    private int getUnvisitedVertex(int ver) {
        for (int i = 0; i < size; i++) {
            if (ver == 0){

            }
            if (matrix[ver][i] == 1 && !vertexList[i].wasVisited)
            {
                currentPathLength += 0;
                return i;
            }
        }
        return -1;
    }
}
