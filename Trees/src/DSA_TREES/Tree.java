package DSA_TREES;
class Node{
	Node left,right;
	int data;
	
	public Node(int data) {
		this.data = data;
	}
	
	public void insert(int value) {
		if(value<=data) {
			if(left==null) {
				left = new Node(value);
			}
			else
			{
				left.insert(value);
			}
		}
		else 
		{
			if(right==null) {
				right = new Node(value);
			}else
			{
				right.insert(value);
			}
		}
	}
	
	public boolean contains(int value) {
		if(value==data) {
			return true;
		}
		else if(value<data) {
			if(left == null) {
				return false;
			}
			else
			{
				return left.contains(value);
			}
		}
		else
		{
			if(right== null)
				return false;
			else
				return right.contains(value);
		}
	}
	
	public void printInorder() {
		if(left != null)
			left.printInorder();
		System.out.println(data);
		if(right != null)
			right.printInorder();
	}
}
public class Tree {
	
	public boolean equals(Node a,Node b) {
		if(a==null && b==null) {
			return true;
		}
		else
		{
			if(a!=null && b!=null) {
				return (a.data==b.data && equals(a.left,b.left)&& equals(a.right,b.right));
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		Tree t= new Tree();
        Node n1 = new Node(10);
        n1.insert(8);
        n1.insert(12);
        n1.insert(15);
        n1.insert(11);
        n1.insert(7);
        n1.insert(9);
        Node n2 = new Node(10);
        n2.insert(8);
        n2.insert(12);
        n2.insert(15);
        n2.insert(11);
        n2.insert(7);
        n2.insert(9);
//        n2.printInorder();
//        System.out.println(n1.contains(1));
        System.out.println(t.equals(n1,n2));
	}

}
