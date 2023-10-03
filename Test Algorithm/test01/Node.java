import java.util.ArrayList;
import java.util.List;

public class Node implements Comparable<Node> 
{
    private String value;
    private double gScore;
    private double fScore;

    private double x;
    private double y;

    private List<Edge> adjList;
    private Node parentNode;

    public Node(String value)
    {
        this.value = value;
        this.adjList = new ArrayList<Edge>();
    }

    public void addNeighbour(Edge edge) { this.adjList.add(edge); }

    @Override
    public String toString() { return this.value; }

    public int compareTo(Node otherNode){ return Double.compare(this.fScore, otherNode.getfScore()); }
    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }
    public double getgScore() { return gScore; }
    public void setgScore(double gScore) { this.gScore = gScore; }
    public double getfScore() { return fScore; }
    public void setfScore(double fScore) { this.fScore = fScore; }
    public double getX() { return x; }
    public void setX(double x) { this.x = x; }
    public double getY() { return x; }
    public void setY(double y) { this.y = y; }
    public Node getParentNode() { return parentNode; }
    public void setParentNode(Node parentNode) { this.parentNode = parentNode; }
    public List<Edge> getAdjList() { return adjList; } 

}
