import core.Node;
import core.Problem;
import core.SearchAlgorithm;
import core.algorithms.BFS;
import core.algorithms.DFS;
import core.algorithms.UCS;
import core.gui.ContainerVisualizer;
import examples.traveller.GraphProblem;

public class Main {
    public static void main(String[] arg) {
        Problem traveler = new GraphProblem();
        SearchAlgorithm bfs = new BFS(true);
        Node solution = traveler.solve(bfs);
        ContainerVisualizer.visualize(bfs.proccesses, "BFS", true);
        System.out.println(solution);
        bfs.printStates();
        bfs.printSolution(solution);
        System.out.println("BFS Nodes: "+ bfs.developedNodes);
        SearchAlgorithm ucs = new UCS(true);

        Node ucsSolution = traveler.solve(ucs);
        ContainerVisualizer.visualize(ucs.proccesses, "UCS", false);
        System.out.println(ucsSolution);
        ucs.printStates();
        ucs.printSolution(ucsSolution);
        System.out.println("UCS Nodes: "+ ucs.developedNodes);
    }
}
