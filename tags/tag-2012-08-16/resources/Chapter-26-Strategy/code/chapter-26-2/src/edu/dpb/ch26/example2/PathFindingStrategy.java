package edu.dpb.ch26.example2;

import java.util.List;

public interface PathFindingStrategy {
	
	public List<Node> findPath(List<List<Node>> graph, Node strartingNode,
			Node destinationNode, List<Node> visitedNodes);
}
