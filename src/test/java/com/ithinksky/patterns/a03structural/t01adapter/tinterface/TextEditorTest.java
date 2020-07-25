package com.ithinksky.patterns.a03structural.t01adapter.tinterface;

import org.junit.jupiter.api.Test;

/**
 * @author tengpeng.gao
 */
class TextEditorTest {

    @Test
    void editTextFile() {
        TextEditor textEditor = new TextEditor();
        textEditor.editTextFile();
    }
}