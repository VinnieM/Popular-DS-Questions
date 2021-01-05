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
 * An InOrder traversal is done on the above tree.
 *
 */
public class InOrder {

  public List<Integer> inOrder(Tree root) {
    return traverseTree(root, new ArrayList<Integer>());
  }

  /**
   * This function prints the contents of the tree in inOrder fashion. The time complexity is O(n)
   * and space complexity is O(h + 1) where h is the height of the binary tree.
   */
  private List<Integer> traverseTree(Tree root, List<Integer> toReturn) {
    if (root != null) {
      traverseTree(root.left, toReturn);
      toReturn.add(root.data);
      traverseTree(root.right, toReturn);
    }
    return toReturn;
  }

  public static void main(String[] args) {
    Tree root = new Tree(30);

    root.left = new Tree(20);
    root.left.left = new Tree(10);
    root.left.right = new Tree(25);

    root.right = new Tree(40);
    root.right.left = new Tree(35);
    root.right.right = new Tree(50);
    root.right.right.right = new Tree(55);

    InOrder traversal = new InOrder();
    traversal.inOrder(root).forEach(System.out::println);
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
