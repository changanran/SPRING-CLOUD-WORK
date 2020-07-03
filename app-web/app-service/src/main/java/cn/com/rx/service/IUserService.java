package cn.com.rx.service;

import cn.com.rx.common.DefaultResultResponse;
import cn.com.rx.info.UserRegisterInfo;


public interface IUserService {
    public DefaultResultResponse register(UserRegisterInfo userInfo);
}
