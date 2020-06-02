package com.ithinksky.petterns.a04behavioral.t11interpreter;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tengpeng.gao
 */
@Slf4j
public class TerminalExpression implements Expression {
    @Override
    public void interpret(Context context) {
        log.info("终结符号");
    }
}
