package cn.com.rx.service;

import cn.com.rx.resp.user.RegisterInfo;
import cn.com.rx.resp.user.UserInfo;

public interface UserService {
    public UserInfo register(RegisterInfo registerInfo);
}
