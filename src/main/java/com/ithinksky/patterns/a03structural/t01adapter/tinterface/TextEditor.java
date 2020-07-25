package com.ithinksky.patterns.a03structural.t01adapter.tinterface;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tengpeng.gao
 */
@Slf4j
public class TextEditor extends AbstractAdapterEditor {

    @Override
    public void editTextFile() {
        log.info("a text file editing");
    }

}

