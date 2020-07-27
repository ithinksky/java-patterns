package com.ithinksky.patterns.a03structural.t01adapter.tclass;

import lombok.extern.slf4j.Slf4j;

/**
 * 适配器类：类的适配器
 * Adapter类，通过继承 src类，实现 dst 类接口，完成src->dst的适配。
 *
 * @author tengpeng.gao
 */
@Slf4j
public class WordTargetEditor extends TextSourceEditor implements ITargetEditor {

    @Override
    public void editWordFile() {
        log.info("适配器开始适配 text --> word。");
        super.editTextFile();
        log.info("a word file editing");
    }

}