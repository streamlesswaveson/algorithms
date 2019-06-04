package balazs.breadthfirstsearch;

import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

public class BFSTest {

    @Test
    public void testit() {
        assertThat(true, is(true));
    }

    @Test
    public void testBfs() {
        BFS bfs = new BFS();

        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);
        Vertex v4 = new Vertex(4);
        Vertex v5 = new Vertex(5);

        v1.addVertex(v2);
        v1.addVertex(v4);

        v4.addVertex(v5);

        v2.addVertex(v3);

        bfs.bfs(v1);
    }
}
