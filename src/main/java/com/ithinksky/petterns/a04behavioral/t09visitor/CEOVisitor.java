package com.ithinksky.petterns.a04behavioral.t09visitor;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * @author tengpeng.gao
 */
@Slf4j
public class CEOVisitor implements Visitor {
    @Override
    public void visit(ProjectElement element) {
        log.info("CEO Visitor Element");
        element.signature("CEO", new Date());
        log.info("element === {}", new Gson().toJson(element));
    }
}
