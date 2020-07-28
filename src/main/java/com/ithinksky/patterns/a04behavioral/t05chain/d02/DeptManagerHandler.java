package com.ithinksky.patterns.a04behavioral.t05chain.d02;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tengpeng.gao
 */
@Slf4j
public class DeptManagerHandler extends AbstractHandler {
    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        int days = leaveRequest.getDays();
        if (days >= DAYS_3) {
            log.info("部门主管同意：{}, {} 天 请假申请，审批通过！", leaveRequest.getUserName(), days);
        } else {
            log.info("{}天内直接主管有审批权限，无需部门主管审批，审批通过！", DAYS_3);
        }
    }
}
