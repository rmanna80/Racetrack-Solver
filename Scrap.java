


import java.util.List;

import graphs.Graph;

 import graphs.Graph;
 import graphs.Vertex;


public class RaceSolver {
    public static void main(String[] args) {
        // read in the racetrack table and construct the graph 
        Graph<Vertex> graph = readRaceTrack(track1);

        // solve the problem using a search algorithm
        List<Vertex> bestPath = solve(graph);

        // print the solution
        printBestPath(bestPath);
    }

    private static Graph<Vertex> readRaceTrack(int[][] track) {
         //implementation to parse the track adn construct the graph
         // use adjlistgraoh to create the graph
     }

     private static List<Vertex> solve(Graph<Vertex> graph) {
         //implementation to solve the problem using a search algorithm
     }

     private static void printBestPath(List<Vertex> bestPath) {
         //implementation to print the solution
     }
     private static parseRacetrack(int[][] tracks){
         Graph<Vertex> graph = new AdjListGraph(Graph.UNDIRECTED);

         int numRows = tracks.length;
         int numCols = tracks[0].length;

         // create vertices for open slots and add them to the graoh 
         for(int row = 0; row < numRows; row++){
             for(int col = 0; col < numCols; col++){
                 if(tracks[row][col] == 0){
                     Vertex v = new Vertex(row, col);
                     graph.addVertex(v);
                 }
             }
         }
         // connect adjacent open spots with edges
         for(int row = 0; row < numRows;row++){
             for(int col = 0; col < numCols; col++){
                 if(tracks[row][col] == 0){
                     // check the adjacent spots 
                     for(int dRow = -1; dRow < numRows; dRow++){
                         for(int dCol = -1; dCol < numCols;dCol++){
                             if(dRow != 0 || dCol != 0){
                                 int newRow = row + dRow;
                                 int newCol = col + dCol;
                                 if(isValidPosition(newRow, newCol, numRows, numCols) && tracks[newRow][newCol] == 0){
                                     Vertex curVertex = new Vertex(row, col);
                                    
                                     Vertex adjVertex = new Vertex(newRow, newCol);
                                     graph.addEdge(curVertex, adjVertex);
                                 }
                             }
                         }
                     }
                 }
             }
         }
         return graph;
                 }
                 private static boolean isValidPosition(int row, int col, int numRows, int numCols){
                     return row >= 0 && row < numRows && col >= 0 && col < numCols;
                 }
    private static Graph<Vertex> parseRacetrack(int[][] tracks) {
        Graph<Vertex> graph = new AdjListGraph<>(Graph.UNDIRECTED);
    
        int numRows = tracks.length;
        int numCols = tracks[0].length;
    
        // Create vertices for open slots and add them to the graph
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                if (tracks[row][col] == 0) {
                    Vertex v = new Vertex(row, col);
                    graph.addVertex(v);
                }
            }
        }
    
        // Connect adjacent open spots with edges
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                if (tracks[row][col] == 0) {
                    // Check the adjacent spots
                    for (int dRow = -1; dRow <= 1; dRow++) {
                        for (int dCol = -1; dCol <= 1; dCol++) {
                            if (dRow != 0 || dCol != 0) {
                                int newRow = row + dRow;
                                int newCol = col + dCol;
                                if (isValidPosition(newRow, newCol, numRows, numCols) && tracks[newRow][newCol] == 0) {
                                    Vertex curVertex = new Vertex(row, col);
                                    Vertex adjVertex = new Vertex(newRow, newCol);
                                    graph.addEdge(curVertex, adjVertex);
                                }
                            }
                        }
                    }
                }
            }
        }
    
        return graph;
    }
    
    private static boolean isValidPosition(int row, int col, int numRows, int numCols) {
        return row >= 0 && row < numRows && col >= 0 && col < numCols;
    }
    
}








//package racetrack;
//
//
//class RaceSolver{
//	public static void main(String args) {
//		return null;
//	}
//}
