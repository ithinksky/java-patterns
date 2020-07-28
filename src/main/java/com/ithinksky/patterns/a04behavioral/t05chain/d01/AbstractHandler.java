package com.ithinksky.patterns.a04behavioral.t05chain.d01;

/**
 * @author tengpeng.gao
 */
public abstract class AbstractHandler {


    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

}
