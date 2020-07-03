package cn.com.rx.remote;

import cn.com.rx.user.IUserService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "support-service")
public interface SupportUserService extends IUserService {

}
