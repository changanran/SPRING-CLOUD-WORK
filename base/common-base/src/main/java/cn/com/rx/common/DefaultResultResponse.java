package cn.com.rx.common;

import cn.com.rx.common.dto.BaseDto;
import cn.com.rx.common.enums.ResultCodeEnum;

public class DefaultResultResponse extends BaseDto {
    String resultCode;
    String desc;
    Object data;

    public DefaultResultResponse(){
        resultCode= ResultCodeEnum.ACTION_SUCCESS.getCode();
        desc= ResultCodeEnum.ACTION_SUCCESS.getDes();
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
