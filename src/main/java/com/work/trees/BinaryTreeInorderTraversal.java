package com.work.trees;

import java.util.ArrayList;
import java.util.List;

class treenode {
    int val;
    treenode left;
    treenode right;
    treenode() {}
    treenode(int val) { this.val = val; }
    treenode(int val, treenode left, treenode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class BinaryTreeInorderTraversal {
    List<Integer> ans=new ArrayList<>();
    public List<Integer> preorderTraversal(treenode root) {
        preorder(root);
        return ans;
    }
    public void preorder(treenode root){
        if(root==null){
            return;
        }
        ans.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
}
