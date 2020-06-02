package com.ithinksky.petterns.a04behavioral.t10mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author tengpeng.gao
 */
class MediatorTest {

    @Test
    void testMediator() {

        Colleague colleagueTenant = new ColleagueTenant();
        Colleague colleagueLandlord = new ColleagueLandlord();
        ConcreteMediator mediator = new ConcreteMediator(colleagueLandlord, colleagueTenant);

        boolean b = mediator.notifyColleagueTenant("有租客出2000元租您的2室1厅，你同意吗？");
        if (b) {
            mediator.notifyColleagueLandlord("价格可以接受，同意。");
        } else {
            mediator.notifyColleagueLandlord("价格太低了，接受不了，不同意。");
        }
    }

}