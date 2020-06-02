package com.ithinksky.petterns.a04behavioral.t10mediator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tengpeng.gao
 */
@Slf4j
public class ColleagueLandlord implements Colleague {
    @Override
    public boolean oparation(String message) {
        log.info("租客收到房屋中介传递的房东的消息：{}", message);
        return true;
    }
}
