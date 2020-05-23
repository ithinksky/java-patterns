package com.ithinksky.petterns.structural.t01adapter.tinterface;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tengpeng.gao
 */
@Slf4j
public class WordEditor extends AbstractAdapterEditor {

    @Override
    public void editWordFile() {
        log.info("a word file editing");
    }

}

