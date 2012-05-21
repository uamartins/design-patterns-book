package edu.dpb.ch26.example1;

import java.util.List;

public class AStarPathFindingStrategy implements PathFindingStrategy {

	@Override
	public List<Node> findPath(PathFinder context) {
		context.getPath().clear();
		// Code implementing A Star search, using the Manhattan method as
		// heuristic function, which fills the path collection and the
		// visitedNodes collection
		// return the found path
		return context.getPath();
	}
}
