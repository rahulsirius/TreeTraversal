package com;

public class Test {

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left = new Node(4);
		tree.root.right = new Node(5);
		
		System.out.println("Preorder... ");
		tree.printPreOrder();
		
		System.out.println("\nInorder... ");
		tree.printInOrder();
		
		System.out.println("\nPostorder... ");
		tree.printPostOrder();
	}

}
