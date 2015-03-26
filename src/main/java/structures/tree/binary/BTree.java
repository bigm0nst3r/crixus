package structures.tree.binary;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sreejith S
 * @since Feb 24, 2015
 */
public class BTree<E extends Comparable> {

  private Node<E> rootNode;


  BTree(E rootData) {
    this.rootNode = new Node(rootData);
  }


  public void insert(E data) {
    _insert(rootNode, data);
  }

  private void _insert(Node<E> node, E data) {
    if (data.compareTo(node.getData()) > 0) {
      if (node.getRight() != null) {
        _insert(node.getRight(), data);
      } else {
        node.setRight(new Node(data));
      }
    } else if (data.compareTo(node.getData()) < 0) {
      if (node.getLeft() != null) {
        _insert(node.getLeft(), data);
      } else {
        node.setLeft(new Node(data));
      }
    }
  }


  public void delete() {

  }


  public void inorder() {
    _inorder(rootNode);
  }


  public void preorder() {
    _preorder(rootNode);
  }

  private void _inorder(Node<E> node) {
    if (node.getLeft() != null) {
      _inorder(node.getLeft());
    }
    System.out.println(node.getData());
    if (node.getRight() != null) {
      _inorder(node.getRight());
    }
  }


  private void _preorder(Node<E> node) {
    System.out.println(node.getData());
    if (node.getLeft() != null) {
      _preorder(node.getLeft());
    }
    if (node.getRight() != null) {
      _preorder(node.getRight());
    }
  }

  public void postorder() {
    _postorder(rootNode);
  }

  private void _postorder(Node<E> node) {
    if (node.getLeft() != null) {
      _postorder(node.getLeft());
    }
    if (node.getRight() != null) {
      _postorder(node.getRight());
    }
    System.out.println(node.getData());
  }

  public List<List<Node<E>>> findAllPaths() {
    List<List<Node<E>>> paths = new ArrayList<>();
    _findAllPaths(rootNode, new ArrayList<Node<E>>(), paths);
    System.out.println("!!");
    return paths;
  }

  private void _findAllPaths(Node<E> node, List<Node<E>> _path, List<List<Node<E>>> paths) {


    _path.add(node);


    if(node.getLeft()==null && node.getRight()==null){
      paths.add(_path);
    } else {

      if(node.getLeft()!=null){
        _findAllPaths(node.getLeft(), new ArrayList<>(_path), paths);
      }

      if(node.getRight()!=null){
        _findAllPaths(node.getRight(),new ArrayList<>(_path),paths);
      }
    }

  }


}
