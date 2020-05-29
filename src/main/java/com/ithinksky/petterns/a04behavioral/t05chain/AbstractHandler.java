package com.ithinksky.petterns.a04behavioral.t05chain;

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
