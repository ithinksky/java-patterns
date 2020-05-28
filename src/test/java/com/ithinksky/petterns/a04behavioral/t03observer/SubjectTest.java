package com.ithinksky.petterns.a04behavioral.t03observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author tengpeng.gao
 */
class SubjectTest {

    @Test
    void notifyObserver() {

        // 创建主题
        Subject subject = new ConcreteSubject();

        // 主题变化订阅
        subject.add(new ConcreteObserver());
        subject.add(new ConcreteObserver());

        // 主题发生变化
        subject.notifyObserver("股票升了");

    }
}