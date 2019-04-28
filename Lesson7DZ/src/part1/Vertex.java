package part1;

import java.util.ArrayList;

public class Vertex {
    public char label;
    public boolean wasVisited;
    public boolean isFinal;
    public ArrayList<Vertex> previous;

    public Vertex(char label) {
        this.label = label;
        this.wasVisited = false;
        this.isFinal = false;
        previous = new ArrayList<>();
    }
    public Vertex(char label, boolean isFinal) {
        this.label = label;
        this.wasVisited = false;
        this.isFinal = isFinal;
        previous = new ArrayList<>();
    }
}
