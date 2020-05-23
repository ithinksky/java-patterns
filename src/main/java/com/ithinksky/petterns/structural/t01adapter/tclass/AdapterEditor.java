package com.ithinksky.petterns.structural.t01adapter.tclass;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tengpeng.gao
 */
@Slf4j
public class AdapterEditor extends TextEditor implements IAdapterEditor {

    @Override
    public void editWordFile() {
        log.info("a word file editing");
    }

}