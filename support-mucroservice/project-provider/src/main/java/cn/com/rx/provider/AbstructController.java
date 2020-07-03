package cn.com.rx.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

public abstract class AbstructController {

    public final Logger logger = LoggerFactory.getLogger(getClass());

    public boolean emptyChecker(String... fields){
        if(fields.length==0){
            return true;
        }
        for(String field:fields){
            if(StringUtils.isEmpty(field)){
                return false;
            }else{
                return true;
            }
        }
        return true;
    }
}
