package com.ithinksky.patterns.a03structural.t01adapter.tinterface;

import org.junit.jupiter.api.Test;

/**
 * @author tengpeng.gao
 */
class TextSourceEditorTest {

    @Test
    void editTextFile() {
        TextEditor textEditor = new TextEditor();
        textEditor.editTextFile();
    }
}