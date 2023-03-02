package com.xa.xalife.test;

import lombok.Data;

@Data
public class TreeNode {

    public Integer data;

    public TreeNode left;
    public TreeNode right;

    public TreeNode(Integer data) {
        this.data = data;
    }
}
