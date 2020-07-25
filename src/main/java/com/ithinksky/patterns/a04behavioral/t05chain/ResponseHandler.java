package com.ithinksky.patterns.a04behavioral.t05chain;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tengpeng.gao
 */
@Slf4j
public class ResponseHandler extends AbstractHandler implements Handler {

    @Override
    public void operator() {
        log.info("ResponseHandler …… ");
        if (getHandler() != null) {
            getHandler().operator();
        }
    }
}
