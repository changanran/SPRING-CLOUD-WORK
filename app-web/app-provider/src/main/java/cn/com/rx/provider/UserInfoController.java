package cn.com.rx.provider;

import cn.com.rx.common.DefaultResultResponse;
import cn.com.rx.info.UserRegisterInfo;
import cn.com.rx.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserInfoController {
    @Autowired
    IUserService userService;

    @RequestMapping(value = "register", method = RequestMethod.POST)
    public DefaultResultResponse register(@RequestBody UserRegisterInfo userInfo) {
        DefaultResultResponse defaultResultResponse = new DefaultResultResponse();
        defaultResultResponse.setData(userService.register(userInfo));
        return defaultResultResponse;
    }
}
