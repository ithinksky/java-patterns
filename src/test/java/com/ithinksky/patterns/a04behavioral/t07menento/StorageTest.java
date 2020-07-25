package com.ithinksky.patterns.a04behavioral.t07menento;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @author tengpeng.gao
 */
@Slf4j
class StorageTest {

    @Test
    void testMemento() {

        // 创建原始数据
        Original original = new Original("张三");

        // 创建备忘录
        Memento memento = original.createMemento();
        Storage storage = new Storage(memento);

        // 修改原始类状态
        log.info("original.value == {}", original.getValue());
        original.setValue("张四");
        log.info("update original.value == {}", original.getValue());

        // 恢复原始类状态
        original.restoreMemento(storage.getMemento());
        log.info("restore original.value == {}", original.getValue());

    }
}