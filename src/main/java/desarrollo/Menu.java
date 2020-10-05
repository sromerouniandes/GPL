package desarrollo;

import java.io.IOException;

public class Menu {

    static boolean directed;
    static boolean weighted;
    static String searchAlgorithm;

    public static void main(String[] args) throws Exception {
        try {
            Menu.selectDirectedUndirected();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void selectDirectedUndirected() throws Exception {
        boolean exit = false;
        while (!exit) {
            System.out.println("Select graph type");
            System.out.println("1. Directed");
            System.out.println("2. Undirected");
            System.out.println("3. Exit");
            switch (ReadInput.readNumber()) {
                case 1:
                    Menu.directed = true;
                    Menu.selectWeightedUnweighted();
                    break;
                case 2:
                    Menu.directed = false;
                    Menu.selectWeightedUnweighted();
                    break;
                default:
                    exit = true;
                    break;
            }

        }
    }

    private static void selectWeightedUnweighted() throws Exception {
        boolean exit = false;
        while (!exit) {
            System.out.println("Select weighted");
            System.out.println("1. Weighted");
            System.out.println("2. Unweighted");
            System.out.println("3. Exit");
            switch (ReadInput.readNumber()) {
                case 1:
                    Menu.weighted = true;
                    Menu.selectSearchAlgorithm();
                    break;
                case 2:
                    Menu.weighted = false;
                    Menu.selectSearchAlgorithm();
                    break;
                default:
                    exit = true;
                    break;
            }

        }
    }


    private static void selectSearchAlgorithm() throws Exception {
        boolean exit = false;
        while (!exit) {
            System.out.println("Select search algorithm");
            System.out.println("1. DFS");
            System.out.println("2. BFS");
            System.out.println("3. Exit");
            switch (ReadInput.readNumber()) {
                case 1:
                    Menu.searchAlgorithm = "DFS";
                    new GraphFactory(Menu.directed, Menu.weighted, Menu.searchAlgorithm);
                    break;
                case 2:
                    Menu.searchAlgorithm = "BFS";
                    new GraphFactory(Menu.directed, Menu.weighted, Menu.searchAlgorithm);
                    break;
                default:
                    exit = true;
                    break;
            }

        }
    }


}
