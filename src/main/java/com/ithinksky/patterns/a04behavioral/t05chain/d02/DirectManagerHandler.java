package com.ithinksky.patterns.a04behavioral.t05chain.d02;

import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

/**
 * @author tengpeng.gao
 */
@Slf4j
public class DirectManagerHandler extends AbstractHandler {

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        int days = leaveRequest.getDays();
        log.info("直接主管同意：{}, {} 天 请假申请！", leaveRequest.getUserName(), days);
        if (days >= DAYS_3) {
            AbstractHandler handler = getHandler();
            if (Objects.nonNull(handler)) {
                handler.handleRequest(leaveRequest);
            }
        } else {
            log.info("{}天内直接主管有审批权限，审批通过！", DAYS_3);
        }
    }
}
