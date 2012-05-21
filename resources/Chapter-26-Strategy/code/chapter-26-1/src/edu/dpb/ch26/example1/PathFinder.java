package edu.dpb.ch26.example1;

import java.util.List;

public class PathFinder {

	private List<List<Node>> graph;
	private PathFindingStrategy strategy;
	private List<Node> path;
	private List<Node> visitedNodes;
	private Node startingPoint;
	private Node destinationPoint;

	public PathFinder(List<List<Node>> graph, Node startingPoint,
			Node destinationPoint, PathFindingStrategy strategy) {
		this.graph = graph;
		this.startingPoint = startingPoint;
		this.destinationPoint = destinationPoint;
		this.strategy = strategy;
	}

	public List<List<Node>> getGraph() {
		return graph;
	}

	public PathFindingStrategy getStrategy() {
		return strategy;
	}

	public List<Node> findPath() {
		return strategy.findPath(this);
	}

	public void setStrategy(PathFindingStrategy newStrategy) {
		this.strategy = newStrategy;
	}

	public List<Node> getPath() {
		return path;
	}

	public List<Node> getVisitedNodes() {
		return visitedNodes;
	}

	public Node getStartingPoint() {
		return startingPoint;
	}

	public void setStartingPoint(Node newStartingPoint) {
		this.startingPoint = newStartingPoint;
	}

	public Node getDestinationPoint() {
		return this.destinationPoint;
	}

	public void setDestinationPoint(Node newDestinationPoint) {
		this.destinationPoint = newDestinationPoint;
	}
}
