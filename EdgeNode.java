package Graph;

import LinearDataStructures.List;
import LinearDataStructures.Node;

public class EdgeNode implements Node {

	public int user;
    public EdgeNode next;
    
    public EdgeNode(int keynode) {
    	this.user=keynode;
    }
    
    public String toString() {
    	return this.user+" ";
    }
	@Override
	public void setNext(Node node) {
		this.next=(EdgeNode)node;

	}

	@Override
	public Node getNext() {
		// TODO Auto-generated method stub
		return next;
	}

	@Override
	public Node clone() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEqual(Node node) {
		// TODO Auto-generated method stub
		EdgeNode temp = (EdgeNode)node;
		return this.user == temp.user ? true : false;
	}

	@Override
	public boolean isLessThan(Node node) {
		// TODO Auto-generated method stub
		return false;
	}


}
