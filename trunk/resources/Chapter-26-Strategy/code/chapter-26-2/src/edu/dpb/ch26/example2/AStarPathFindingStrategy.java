package edu.dpb.ch26.example2;

import java.util.ArrayList;
import java.util.List;

public class AStarPathFindingStrategy implements PathFindingStrategy {

	@Override
	public List<Node> findPath(List<List<Node>> graph, Node strartingNode,
			Node destinationNode, List<Node> visitedNodes) {
		List<Node> path = new ArrayList<Node>();
		// Code implementing A Star search, using the Manhattan method as
		// heuristic function, which fills the path collection and the
		// visitedNodes collection
		// return the found path
		return path;
	}
}
