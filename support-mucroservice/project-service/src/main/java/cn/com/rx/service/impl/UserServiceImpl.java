package cn.com.rx.service.impl;

import cn.com.rx.resp.user.RegisterInfo;
import cn.com.rx.resp.user.UserInfo;
import cn.com.rx.service.UserService;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class UserServiceImpl implements UserService {
    /**
     *
     * @param registerInfo
     * @return
     */
    @Override
    public UserInfo register(RegisterInfo registerInfo) {
        UserInfo userInfo = new UserInfo();
        userInfo.setBid(UUID.randomUUID().toString());
        userInfo.setUserName("ranxiang");
        return userInfo;
    }
}
