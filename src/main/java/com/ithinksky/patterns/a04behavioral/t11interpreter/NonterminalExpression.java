package com.ithinksky.patterns.a04behavioral.t11interpreter;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tengpeng.gao
 */
@Slf4j
public class NonterminalExpression implements Expression {
    @Override
    public void interpret(Context context) {
        log.info("非终结符号");
    }
}
