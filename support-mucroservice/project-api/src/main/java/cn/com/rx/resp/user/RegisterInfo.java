package cn.com.rx.resp.user;


import cn.com.rx.common.dto.BaseDto;

public class RegisterInfo extends BaseDto {
   private String userName;
    private String userPassWord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassWord() {
        return userPassWord;
    }

    public void setUserPassWord(String userPassWord) {
        this.userPassWord = userPassWord;
    }
}
