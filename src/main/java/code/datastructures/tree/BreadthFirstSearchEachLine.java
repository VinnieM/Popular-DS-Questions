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
 * A BFS traversal is done on the above tree.
 *
 */
public class BreadthFirstSearchEachLine {

  public void breadthFirstSearch(Tree root) {
    if (root == null) {
      return;
    }
    Queue<Tree> queue = new LinkedList<>();
    queue.offer(root);

    while (!queue.isEmpty()) {
      int counter = queue.size();
      for (int i = 0; i < counter; i++) {
        Tree current = queue.poll();
        System.out.print(current.data + " ");
        if (current.left != null) {
          queue.add(current.left);
        }
        if (current.right != null) {
          queue.add(current.right);
        }
      }
      System.out.println();
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

    BreadthFirstSearchEachLine traversal = new BreadthFirstSearchEachLine();
    traversal.breadthFirstSearch(root);
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
