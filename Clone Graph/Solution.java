import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
		if (node == null) {
			return null;
		}
		HashMap<UndirectedGraphNode, UndirectedGraphNode> nodes = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
		LinkedList<UndirectedGraphNode> nodeHasVisited = new LinkedList<UndirectedGraphNode>();
		UndirectedGraphNode newNode = new UndirectedGraphNode(node.label);

		nodes.put(node, newNode);
		nodeHasVisited.add(node);

		UndirectedGraphNode currentNode = null;
		while (!nodeHasVisited.isEmpty()) {
			currentNode = nodeHasVisited.poll();
			for (UndirectedGraphNode neighbour : currentNode.neighbors) {
				if (!nodes.containsKey(neighbour)) {
					nodeHasVisited.add(neighbour);
					nodes.put(neighbour, new UndirectedGraphNode(
							neighbour.label));
				}
				nodes.get(currentNode).neighbors.add(nodes.get(neighbour));
			}
		}
		return newNode;
	}
}

class UndirectedGraphNode {
	int label;
	List<UndirectedGraphNode> neighbors;

	UndirectedGraphNode(int x) {
		label = x;
		neighbors = new ArrayList<UndirectedGraphNode>();
	}
};
