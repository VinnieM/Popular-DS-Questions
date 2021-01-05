package code.datastructures.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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
public class BreadthFirstSearch {

  public List<Integer> breadthFirstSearch(Tree root) {
    List<Integer> toReturn = new ArrayList<>();
    if (root == null) {
      return toReturn;
    }
    Queue<Tree> queue = new LinkedList<>();
    queue.offer(root);

    while (!queue.isEmpty()) {
      Tree current = queue.poll();
      toReturn.add(current.data);
      if (current.left != null) {
        queue.offer(current.left);
      }
      if (current.right != null) {
        queue.offer(current.right);
      }
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

    BreadthFirstSearch traverseTree = new BreadthFirstSearch();
    for (Integer breadthFirstSearch : traverseTree.breadthFirstSearch(root)) {
      System.out.print(breadthFirstSearch + " ");
    }
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
