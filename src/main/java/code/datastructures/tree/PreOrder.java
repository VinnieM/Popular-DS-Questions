package code.datastructures.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * This class implements a binary tree with the below values.
 *                 30
 *                 / \
 *               20   40
 *              / \   / \
 *             10 25 35 50
 *                        \
 *                        55
 * A PreOrder traversal is done on the above tree.
 *
 */
public class PreOrder {

  public List<Integer> preOrder(Tree root) {
    return getPreOrderResult(root, new ArrayList<>());
  }

  /**
   * This function prints the values of the tree in PreOrder fashion. The time complexity is O(n)
   * and the space complexity is O(h + 1) where h is the height of the binary tree.
   */
  private List<Integer> getPreOrderResult(Tree root, ArrayList<Integer> toReturn) {
    if (root != null) {
      toReturn.add(root.data);
      getPreOrderResult(root.left, toReturn);
      getPreOrderResult(root.right, toReturn);
    }
    return toReturn;
  }

  /**
   * This is the main class. The Tree values are populated here.
   */
  public static void main(String[] arg) {
    Tree root = new Tree(30);

    root.left = new Tree(20);
    root.left.left = new Tree(10);
    root.left.right = new Tree(25);

    root.right = new Tree(40);
    root.right.left = new Tree(35);
    root.right.right = new Tree(50);
    root.right.right.right = new Tree(55);

    PreOrder preOrderTraversal = new PreOrder();
    preOrderTraversal.preOrder(root).forEach(System.out::println);
  }

  static class Tree {

    int data;
    Tree left, right;

    public Tree(int data) {
      this.data = data;
      left = right = null;
    }
  }
}


