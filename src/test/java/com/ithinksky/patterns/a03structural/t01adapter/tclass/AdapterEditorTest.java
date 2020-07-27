package com.ithinksky.patterns.a03structural.t01adapter.tclass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author tengpeng.gao
 */
class AdapterEditorTest {

    private WordTargetEditor adapterEditor;

    @BeforeEach
    void setUp() {
        adapterEditor = new WordTargetEditor();
    }


    @Test
    void editWordFile() {
        adapterEditor.editWordFile();
    }

    @Test
    void editTextFile() {
        adapterEditor.editTextFile();
    }

}