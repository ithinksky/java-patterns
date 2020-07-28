package com.ithinksky.patterns.a04behavioral.t05chain;

import com.ithinksky.patterns.a04behavioral.t05chain.d01.AuthHandler;
import com.ithinksky.patterns.a04behavioral.t05chain.d01.BusinessHandler;
import com.ithinksky.patterns.a04behavioral.t05chain.d01.ResponseHandler;
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