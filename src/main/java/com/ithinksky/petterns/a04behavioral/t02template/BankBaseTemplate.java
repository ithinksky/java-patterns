package com.ithinksky.petterns.a04behavioral.t02template;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tengpeng.gao
 */
@Slf4j
public abstract class BankBaseTemplate {

    public void templateMethod() {
        checkNumber();
        queueUp();
        handleBusiness();
        serviceEvaluation();
    }


    protected void checkNumber() {
        log.info("抽号：……");
    }

    protected void queueUp() {
        log.info("排队：……");
    }

    /**
     * 处理业务
     */
    protected abstract void handleBusiness();

    protected void serviceEvaluation() {
        log.info("服务评价：……");
    }

}
