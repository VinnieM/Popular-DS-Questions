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
 */
public class HeightOfBinaryTree {

  /**
   * This function gets the height of a binary tree recursively. The time complexity is O(n) and
   * space complexity is O(h + 1), where h is the height.
   */
  public int getHeightRecursive(Tree root) {
    return root == null ? 0
        : 1 + Math.max(getHeightRecursive(root.left), getHeightRecursive(root.right));
  }

  /**
   * This function gets the height of a binary tree iteratively. The time complexity is O(n) and the
   * space complexity is O(w) where w is the width.
   */
  public int getHeightIterative(Tree root) {
    if (root == null) {
      return 0;
    }
    Queue<Tree> queue = new LinkedList<>();
    queue.offer(root);
    int counter = 0;
    while (!queue.isEmpty()) {
      int loopCounter = queue.size();
      for (int i = 0; i < loopCounter; i++) {
        Tree current = queue.poll();
        if (current.left != null) {
          queue.add(current.left);
        }
        if (current.right != null) {
          queue.add(current.right);
        }
      }
      ++counter;
    }
    return counter;
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

    HeightOfBinaryTree tree = new HeightOfBinaryTree();
    System.out.println(tree.getHeightRecursive(root));
    System.out.println(tree.getHeightIterative(root));
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
