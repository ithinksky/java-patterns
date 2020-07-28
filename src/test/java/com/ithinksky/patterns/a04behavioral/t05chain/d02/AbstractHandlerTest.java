package com.ithinksky.patterns.a04behavioral.t05chain.d02;

import org.junit.jupiter.api.Test;

/**
 * @author tengpeng.gao
 */
class AbstractHandlerTest {

    @Test
    void handleRequest() {
        LeaveRequest leaveRequest = new LeaveRequest.LeaveRequestBuilder().userName("张三").days(4).build();

        DirectManagerHandler directManagerHandler = new DirectManagerHandler();

        DeptManagerHandler deptManagerHandler = new DeptManagerHandler();

        directManagerHandler.setHandler(deptManagerHandler);
        directManagerHandler.handleRequest(leaveRequest);
    }
}