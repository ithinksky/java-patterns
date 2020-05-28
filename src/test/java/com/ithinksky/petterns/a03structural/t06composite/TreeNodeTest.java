package com.ithinksky.petterns.a03structural.t06composite;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @author tengpeng.gao
 */
@Slf4j
class TreeNodeTest {

    @Test
    void add() {

        TreeNode nodeA = new TreeNode("A");
        TreeNode nodeB = new TreeNode("B");
        nodeA.add(nodeB);

        Gson gson = new Gson();
        log.info(" === {}", gson.toJson(nodeA));
    }
}