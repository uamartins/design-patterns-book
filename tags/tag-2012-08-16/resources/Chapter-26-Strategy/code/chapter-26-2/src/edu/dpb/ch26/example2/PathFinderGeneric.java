package edu.dpb.ch26.example2;

import java.util.List;

public class PathFinderGeneric<T extends PathFindingStrategy> {

	private T strategy;

	public PathFinderGeneric(List<List<Node>> graph, Node startingPoint,
			Node destinationPoint, T strategy) {
		// rest of initialization code
		this.strategy = strategy;
	}

	public T getStrategy() {
		return this.strategy;
	}

	public void setStrategy(T strategy) {
		this.strategy = strategy;
	}
}
