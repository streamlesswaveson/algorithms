package balazs.breadthfirstsearch;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Vertex {

    private int data;
    private boolean visited;
    private List<Vertex> neighbourList;

    public Vertex(int data) {
        this.data = data;
        this.neighbourList = new ArrayList<>();
    }

    public void addVertex(Vertex v) {
        this.neighbourList.add(v);
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "data=" + data +
                '}';
    }
}
