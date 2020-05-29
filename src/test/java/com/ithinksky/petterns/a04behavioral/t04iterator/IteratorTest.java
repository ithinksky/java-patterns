package com.ithinksky.petterns.a04behavioral.t04iterator;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author tengpeng.gao
 */
@Slf4j
class IteratorTest {

    @Test
    void testIterator() {
        Collection collection = new ListCollection();
        collection.add("张三");
        collection.add("李四");

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            log.info("next === {}", next);
        }
    }


}