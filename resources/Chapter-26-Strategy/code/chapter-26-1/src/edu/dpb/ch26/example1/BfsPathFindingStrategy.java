package edu.dpb.ch26.example1;

import java.util.List;

public class BfsPathFindingStrategy implements PathFindingStrategy {

	@Override
	public List<Node> findPath(PathFinder context) {
		context.getPath().clear();
		// Code implementing breadth first search which fills the path
		// collection and the visitedNodes collection
		// return the found path
		return context.getPath();

	}

}
