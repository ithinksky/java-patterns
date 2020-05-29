package com.ithinksky.petterns.a04behavioral.t05chain;

import org.junit.jupiter.api.Test;

/**
 * @author tengpeng.gao
 */
class HandlerTest {

    @Test
    void operator() {
        AuthHandler authHandler = new AuthHandler();

        BusinessHandler businessHandler = new BusinessHandler();
        ResponseHandler responseHandler = new ResponseHandler();

        authHandler.setHandler(businessHandler);
        businessHandler.setHandler(responseHandler);

        authHandler.operator();

    }
}