package cn.com.rx.user;

import cn.com.rx.common.DefaultResultResponse;
import cn.com.rx.resp.user.RegisterInfo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("info")
public interface IUserService {
   @RequestMapping(value="/testFeign", method= RequestMethod.POST)
   public DefaultResultResponse register(@RequestBody RegisterInfo registerInfo);

}
