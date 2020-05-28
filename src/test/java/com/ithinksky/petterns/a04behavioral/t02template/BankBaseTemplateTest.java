package com.ithinksky.petterns.a04behavioral.t02template;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @author tengpeng.gao
 */
@Slf4j
class BankBaseTemplateTest {

    @Test
    void handleBusiness() {

        BankBaseTemplate take = new TakeMoney();
        take.templateMethod();

        log.info("==================");
        BankBaseTemplate save = new SaveMoney();
        save.templateMethod();

    }
}