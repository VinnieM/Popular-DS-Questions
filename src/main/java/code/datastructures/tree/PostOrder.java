package code.datastructures.tree;

import java.util.ArrayList;

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
public class PostOrder {

  public ArrayList<Integer> postOrder(Tree root) {
    return traverseTree(root, new ArrayList<Integer>());
  }

  /**
   * This function prints the contents of the tree in PostOrder fashion. The time complexity is O(n)
   * and the space complexity is O(h + 1) where h is the height of the binary tree.
   */
  public ArrayList<Integer> traverseTree(Tree root, ArrayList<Integer> toReturn) {
    if (root != null) {
      traverseTree(root.left, toReturn);
      traverseTree(root.right, toReturn);
      toReturn.add(root.data);
    }
    return toReturn;
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

    PostOrder traversal = new PostOrder();
    traversal.postOrder(root).forEach(System.out::println);
  }

  static class Tree {

    int data;
    Tree left, right;

    public Tree(int data) {
      this.data = data;
    }
  }
}
