package edu.dpb.ch26.example1;

import java.util.List;

public class DfsPathFindingStrategy implements PathFindingStrategy {
	
	@Override
	public List<Node> findPath(PathFinder context) {
		context.getPath().clear();
		// Code implementing depth first search which fills the path collection
		// and the visitedNodes collection
		// return the found path
		return context.getPath();
	}
}
