package cn.com.rx.user;

import cn.com.rx.TestBase;
import cn.com.rx.resp.user.RegisterInfo;
import cn.com.rx.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceTest extends TestBase {
    @Autowired
    UserService userService;
    @Test
    public void testRegister(){
        RegisterInfo registerInfo = new RegisterInfo();
        registerInfo.setUserName("test");
        registerInfo.setUserPassWord(getPassWord("xxxx"));
        userService.register(registerInfo);
    }
    private String getPassWord(String mingwen){
        return "jiami"+mingwen;
    }
}
