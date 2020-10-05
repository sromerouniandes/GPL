package desarrollo;
import java.util.List;

public class GraphFactory {

    GraphFactory(boolean directed, boolean weighted, String searchAlgorithm) throws Exception {
        if (directed) {
            if (!weighted) {
                if (searchAlgorithm == "BFS") {
                    this.directedUnweightedBFS();
                }
                if(searchAlgorithm == "DFS"){
                    this.directedUnweightedDFS();
                }
            }
        }
    }

    private void directedUnweightedBFS() throws Exception {
        System.out.println("-------------- DIRECTED UNWEIGHTED BFS");
        ejemplo.grafoDirigidoConBFS.Grafo g = new ejemplo.grafoDirigidoConBFS.Grafo();

        g.addNodo("A");
        g.addNodo("B");
        g.addNodo("C");

        g.addArco("A", "B");
        g.addArco("B", "C");
        g.addArco("A", "C");


        List<ejemplo.grafoDirigidoConBFS.Nodo> camino = g.buscarRuta("A", "C");

        if (camino == null) {
            System.out.println("Camino A -> C no encontrado");
        } else {
            System.out.println("Camino A -> C encontrado");
            for (ejemplo.grafoDirigidoConBFS.Nodo node : camino) {
                System.out.println(node.getNombre());
            }
        }
        System.out.println();
    }

    private void directedUnweightedDFS() throws Exception {
        System.out.println("---------------DIRECTED UNWEIGHTED DFS");
        ejemplo.grafoDirigido.Grafo g = new ejemplo.grafoDirigido.Grafo();


        g.addNodo("A");
        g.addNodo("B");
        g.addNodo("C");
        g.addNodo("D");
        g.addNodo("E");

        g.addArco("A", "B");
        g.addArco("B", "C");
        g.addArco("C", "D");
        g.addArco("E", "D");
        g.addArco("A", "C");

        List<ejemplo.grafoDirigido.Nodo> camino = g.buscarRuta("A", "E");

        if (camino == null) {
            System.out.println("Camino A -> E no encontrado");
        } else {
            System.out.println("Camino A -> E encontrado");
            for (ejemplo.grafoDirigido.Nodo node: camino) {
                System.out.println(node.getNombre());
            }
        }
    }


}
