package cn.com.rx.service.impl;

import cn.com.rx.remote.SupportUserService;
import cn.com.rx.common.DefaultResultResponse;
import cn.com.rx.info.UserRegisterInfo;
import cn.com.rx.resp.user.RegisterInfo;
import cn.com.rx.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    SupportUserService supportUserService;
    @Override
    public DefaultResultResponse register(UserRegisterInfo userInfo) {
        DefaultResultResponse defaultResultResponse =new DefaultResultResponse();
        RegisterInfo info = new RegisterInfo();
        info.setUserName(userInfo.getUserName());
        info.setUserPassWord(userInfo.getUserPassWord());
       return supportUserService.register(info);
    }
}
