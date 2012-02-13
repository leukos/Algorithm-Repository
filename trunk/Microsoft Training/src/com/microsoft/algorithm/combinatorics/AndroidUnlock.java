package com.microsoft.algorithm.combinatorics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AndroidUnlock {

	public long calculate(int rows, int columns) {
		if (rows < 1 || columns < 1)
			throw new IllegalArgumentException(
					"Rows and columns must be larger than 0");
		// create the graph internal structure
		int numberNodes = rows * columns;
		List<Node> nodes = new ArrayList<Node>();
		for (int i = 0; i < numberNodes; i++) {
			nodes.add(new Node());
		}

		// do the linking process
		Iterator<Node> iter = nodes.iterator();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				Node current = iter.next();

				// all the linking cases
				if ((i - 1) >= 0 && (j - 1) >= 0) {
					current.addNeighbor(nodes.get((i - 1) * columns + (j - 1)));
				}
				if ((i - 1) >= 0 && (j + 1) < columns) {
					current.addNeighbor(nodes.get((i - 1) * columns + (j + 1)));
				}
				if ((i + 1) < rows && (j - 1) >= 0) {
					current.addNeighbor(nodes.get((i + 1) * columns + (j - 1)));
				}
				if ((i + 1) < rows && (j + 1) < columns) {
					current.addNeighbor(nodes.get((i + 1) * columns + (j + 1)));
				}
				if ((i - 1) >= 0) {
					current.addNeighbor(nodes.get((i - 1) * columns + (j)));
				}
				if ((i + 1) < rows) {
					current.addNeighbor(nodes.get((i + 1) * columns + (j)));
				}
				if ((j - 1) >= 0) {
					current.addNeighbor(nodes.get((i) * columns + (j - 1)));
				}
				if ((j + 1) < columns) {
					current.addNeighbor(nodes.get((i) * columns + (j + 1)));
				}

			}
		}

		// structure is on lets calculate the possibilites
		long totalNumberOfPaths = 0;
		for (int i = 0; i < numberNodes; i++) {
			for (int j = i+1; j < numberNodes; j++) {
				List<Node> visited = new LinkedList<Node>();
				visited.add(nodes.get(i));
				totalNumberOfPaths += 2 * getPaths(nodes.get(i), nodes.get(j), nodes,
							visited);
			}
		}

		return totalNumberOfPaths;
	}

	public long getPaths(Node source, Node target, List<Node> nodes,
			List<Node> visited) {
		if (source.equals(target))
			return 1;

		long numberOfPaths = 0;
		for (Node neighbor : source.getNeighbors()) {
			if (!visited.contains(neighbor)) {
				List<Node> newVisited = new LinkedList<Node>(visited);
				newVisited.add(neighbor);
				numberOfPaths += getPaths(neighbor, target, nodes, newVisited);
			}
		}

		return numberOfPaths;
	}
}
