package cn.com.rx.resp.user;

import java.io.Serializable;

public class UserInfo implements Serializable {
    private String userName;
    private String bid;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

}
