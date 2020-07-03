package cn.com.rx.common.enums;

public enum ResultCodeEnum {
    ACTION_SUCCESS("0000","success"),
    PARAM_ERROR_EMPTY("4001","param is null");
    private String code;
    private String des;

    ResultCodeEnum(String code, String des) {
        this.code = code;
        this.des = des;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
