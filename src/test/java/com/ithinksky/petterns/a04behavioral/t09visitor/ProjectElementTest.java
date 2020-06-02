package com.ithinksky.petterns.a04behavioral.t09visitor;

import org.junit.jupiter.api.Test;

/**
 * @author tengpeng.gao
 */
class ProjectElementTest {

    @Test
    void visit() {
        ProjectElement element = new ProjectElement("mobike", "share bicycle");
        element.accept(new CTOVisitor());
        element.accept(new CEOVisitor());

    }
}