package com.ithinksky.patterns.a04behavioral.t05chain.d02;

/**
 * @author tengpeng.gao
 */
public abstract class AbstractHandler {

    protected static final int DAYS_3 = 3;

    private AbstractHandler handler;


    public AbstractHandler getHandler() {
        return handler;
    }

    public void setHandler(AbstractHandler handler) {
        this.handler = handler;
    }

    /**
     * 处理请假申请
     *
     * @param leaveRequest
     */
    public abstract void handleRequest(LeaveRequest leaveRequest);


}
