package com.microsoft.algorithm.combinatorics;

import java.util.LinkedList;
import java.util.List;

public class Node {
	private List<Node> neighbors = null;
	
	public Node() {
		neighbors = new LinkedList<Node>();
	}
	
	public void addNeighbor(Node neighbor) {
		if (neighbors.contains(neighbor)) {
			throw new IllegalArgumentException("This node is already a neighbor");
		}
		
		neighbors.add(neighbor);
	}

	/**
	 * @return the neighbors
	 */
	public List<Node> getNeighbors() {
		return neighbors;
	}
	
	
}
