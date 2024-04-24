/**
 * This object represents a Vertex within a graph.
 * Each edge to other vertices is kept in the Vertex object as
 * an adjacency list.  
 * 
 * You should CHANGE or SUBCLASS this class for your assignment.
 */
package racetrack;

import java.util.*;

public class Vertex {
	private ArrayList<Vertex> myEdges;
	private String myName;

	public Vertex(String name){
		myName = name;
		myEdges = new ArrayList<Vertex>();
	}

	public String getName(){
		return myName;
	}
	
	// If a vertex is added with no weight, assume its weight is 1.
	public void addEdge(Vertex j){
		myEdges.add(j);
	}
	
	public void removeEdge(Vertex j){
		myEdges.remove(j);
	}
	
	public boolean hasEdge(Vertex j){
		return myEdges.contains(j);
	}
	
	public Collection<Vertex> getAdjacentVertices(){
		return myEdges;
	}
	
	public String toString(){
		return myName;
	}
}
