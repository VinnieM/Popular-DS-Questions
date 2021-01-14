package code.datastructures.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * This class implements a binary tree with the below values.
 *                 30
 *                 / \
 *               20   40
 *              / \   / \
 *             10 25 35 50
 *                        \
 *                        55
 *
 */
public class InvertBinaryTree {

  public void invertTreeIterative(Tree root) {
    Queue<Tree> queue = new LinkedList<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
      Tree current = queue.poll();
      swapLeftAndRight(current);
      if (current.left != null) {
        queue.offer(current.left);
      }
      if (current.right != null) {
        queue.offer(current.right);
      }
    }
  }

  private void swapLeftAndRight(Tree root) {
    Tree temp = root.left;
    root.left = root.right;
    root.right = temp;
  }

  private void invertTreeRecursive(Tree root) {
    if (root == null) {
      return;
    }
    swapLeftAndRight(root);
    invertTreeRecursive(root.left);
    invertTreeRecursive(root.right);
  }

  private void inOrderTraversal(Tree root) {
    if (root != null) {
      inOrderTraversal(root.left);
      System.out.print(root.value + " ");
      inOrderTraversal(root.right);
    }
  }

  public static void main(String[] arg) {
    Tree root = new Tree(30);

    root.left = new Tree(20);
    root.left.left = new Tree(10);
    root.left.right = new Tree(25);

    root.right = new Tree(40);
    root.right.left = new Tree(35);
    root.right.right = new Tree(50);
    root.right.right.right = new Tree(55);

    InvertBinaryTree binaryTree = new InvertBinaryTree();
    
    binaryTree.inOrderTraversal(root);
    binaryTree.invertTreeRecursive(root);
    System.out.println();
    binaryTree.inOrderTraversal(root);
  }

  static class Tree {

    private int value;
    private Tree left, right;

    public Tree(int value) {
      this.value = value;
      left = right = null;
    }
  }
}
