package com.ithinksky.patterns.a04behavioral.t10mediator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tengpeng.gao
 */
@Slf4j
public class ColleagueTenant implements Colleague {
    @Override
    public boolean oparation(String message) {
        log.info("房东收到房屋中介传递的租客的消息：{}", message);
        return true;
    }
}
