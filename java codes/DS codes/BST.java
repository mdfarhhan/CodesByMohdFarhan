public class BST {

	NODE  root;
	
	class NODE
	{
		NODE left;
		NODE right;
		int data;
		
		NODE( int data)
		{
			this.data = data;
		}
		
	}
	public void createbinarytree()
	{
	NODE first = new NODE(9);
	NODE second = new NODE(2);
	NODE third= new NODE(3);
	NODE fourth = new NODE(4);

	  root = first;
	  first.left = second;
	  first.right = third;
	  
	  
	  second.left=fourth;
	  
	}
	
	
	public void preOrder(NODE temp)
	{
		if (temp!=null) {
			System.out.print(temp.data);
			preOrder(temp.left);
			preOrder(temp.right);
		}
	}
    
    public void inorder(NODE temp){
        if(temp!=null){
            inorder(temp.left);
            System.out.print(temp.data);
            inorder(temp.right);
        }

    }
    public void postorder(NODE temp){
        if(temp!=null){
            postorder(temp.left);
            postorder(temp.right);
            System.out.print(temp.data);
        }
    }
	
	
	public static void main(String args[])	
	{
		BST bt = new BST();
		bt.createbinarytree();
		System.out.print("preorder ");
		bt.preOrder(bt.root);
		System.out.println("");
		System.out.print("inorder ");
		bt.inorder(bt.root);
		System.out.println("");
		System.out.print("postorder ");
		bt.postorder(bt.root);
	}
}