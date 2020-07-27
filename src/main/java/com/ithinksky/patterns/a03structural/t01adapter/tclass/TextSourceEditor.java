package com.ithinksky.patterns.a03structural.t01adapter.tclass;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tengpeng.gao
 */
@Slf4j
public class TextSourceEditor implements ISourceEditor {

    @Override
    public void editTextFile() {
        log.info("a text file editing");
    }

}
