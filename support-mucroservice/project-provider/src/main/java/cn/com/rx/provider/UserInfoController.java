package cn.com.rx.provider;

import cn.com.rx.common.DefaultResultResponse;
import cn.com.rx.common.enums.ResultCodeEnum;
import cn.com.rx.resp.user.RegisterInfo;
import cn.com.rx.user.IUserService;
import cn.com.rx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("info")
public class UserInfoController extends AbstructController implements IUserService {

    @Autowired
    UserService userService;

    @Override
    public DefaultResultResponse register(@RequestBody RegisterInfo registerInfo){
        DefaultResultResponse defaultResultDTO = new DefaultResultResponse();

        //参数校验
        if(emptyChecker(registerInfo.getUserName(),registerInfo.getUserPassWord())){
            defaultResultDTO.setResultCode(ResultCodeEnum.PARAM_ERROR_EMPTY.getCode());
            defaultResultDTO.setDesc(ResultCodeEnum.PARAM_ERROR_EMPTY.getDes());
            return defaultResultDTO;
        }
        logger.info("登录信息 用户名{}",registerInfo.getUserName());
        defaultResultDTO.setData(userService.register(registerInfo));
        return defaultResultDTO;
    }

}
