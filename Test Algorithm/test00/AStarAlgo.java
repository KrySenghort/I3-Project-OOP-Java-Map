import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class AStarAlgo {
    public Set<Node> explorNodes = new HashSet<Node>();

    public void aStarSearch(Node sourceNode, Node goalNode) {
        PriorityQueue<Node> unexploredNodesQueue = new PriorityQueue<Node>();
        sourceNode.setgScore(0);
        unexploredNodesQueue.add(sourceNode);
        boolean isFound = false;

        while (!unexploredNodesQueue.isEmpty() && !isFound) {
            Node currNode = unexploredNodesQueue.poll();
            explorNodes.add(currNode);

            if (currNode.getValue().equals(goalNode.getValue()))
                isFound = true;

            for (Edge e : currNode.getAdjList()) {
                Node childNode = e.getTargetNode();
                double cost = e.getCost();
                double tempGScore = currNode.getfScore() + cost;
                double tempFScore = tempGScore + heuristic(childNode, goalNode);

                if (explorNodes.contains(childNode) && tempFScore >= childNode.getfScore())
                    continue;

                else if (!unexploredNodesQueue.contains(childNode) || tempFScore < childNode.getfScore())
                    childNode.setParentNode(currNode);
                childNode.setgScore(tempGScore);
                childNode.setfScore(tempFScore);

                if (unexploredNodesQueue.contains(childNode))
                    unexploredNodesQueue.remove(childNode);

                unexploredNodesQueue.add(childNode);
            }
        }
    }

    public List<Node> printPath(Node targetNode) {
        List<Node> pathList = new ArrayList<Node>();
        for (Node node = targetNode; node != null; node = node.getParentNode()) {
            pathList.add(node);
        }

        Collections.reverse(pathList);
        return pathList;
    }

    private double heuristic(Node childNode, Node goalNode) {
        return Math.abs(childNode.getX() - goalNode.getX()) + Math.abs(childNode.getY() - goalNode.getY());
    }
}
