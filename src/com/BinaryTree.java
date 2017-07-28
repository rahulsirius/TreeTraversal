package com;

public class BinaryTree {
	
	Node root;

	public BinaryTree() {
		root = null;
	}
	
	void printPostOrder(Node node){
		if(node == null)
			return;
		
		printPostOrder(node.left);
		printPostOrder(node.right);
		System.out.print(node.key + " ");
	}
	
	void printPreOrder(Node node){
		if(node == null)
			return;
		
		System.out.print(node.key + " ");
		printPreOrder(node.left);
		printPreOrder(node.right);
	}
	
	void printInOrder(Node node){
		if(node == null)
			return;
		
		printInOrder(node.left);
		System.out.print(node.key + " ");
		printInOrder(node.right);
	}
	
	//only wrappers
	void printPostOrder(){
		printPostOrder(root);
	}
	
	void printPreOrder(){
		printPreOrder(root);
	}
	
	void printInOrder(){
		printInOrder(root);
	}

}
