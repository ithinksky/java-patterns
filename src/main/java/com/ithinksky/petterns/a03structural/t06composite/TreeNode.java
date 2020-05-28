package com.ithinksky.petterns.a03structural.t06composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author tengpeng.gao
 */
public class TreeNode {

    private String name;

    private TreeNode parent;

    private Vector<TreeNode> children = new Vector<>();

    public TreeNode(String name) {
        this.name = name;
    }

    public void add(TreeNode treeNode) {
        children.add(treeNode);
    }

    public void remove(TreeNode treeNode) {
        children.remove(treeNode);
    }

    public Enumeration<TreeNode> getChildren() {
        return children.elements();
    }

}
