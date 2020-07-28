package com.ithinksky.patterns.a04behavioral.t05chain.d02;

/**
 * @author tengpeng.gao
 */
public class LeaveRequest {

    private String userName;

    private int days;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public static class LeaveRequestBuilder {

        private LeaveRequest leaveRequest;

        public LeaveRequestBuilder() {
            leaveRequest = new LeaveRequest();
        }

        public LeaveRequestBuilder userName(String userName) {
            leaveRequest.setUserName(userName);
            return this;
        }

        public LeaveRequestBuilder days(int days) {
            leaveRequest.setDays(days);
            return this;
        }

        public LeaveRequest build() {
            return this.leaveRequest;
        }


    }

}
