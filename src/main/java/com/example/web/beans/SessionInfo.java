package com.example.web.beans;

/**
 * Created by hp on 2018/2/16.
 */
public class SessionInfo {

    private int userId;

    private String userName;

    private String cellphone;

    public SessionInfo() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    @Override
    public String toString() {
        return "SessionInfo{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", cellphone='" + cellphone + '\'' +
                '}';
    }
}
