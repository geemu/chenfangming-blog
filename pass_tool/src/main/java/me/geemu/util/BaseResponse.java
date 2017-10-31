package me.geemu.util;


import lombok.Data;
import me.geemu.enumerate.BaseResponseEnum;

import java.io.Serializable;

/**
 * Author: geemu
 * Email: cfmmail@sina.com
 * Date: 2017/9/3 17:21
 * Description:
 */
@Data
public class BaseResponse<T> implements Serializable {
    private static final long serialVersionUID = -8145865776285690954L;

    private Integer code;

    private String message;

    private T content;

    public BaseResponse() {
        this.code = BaseResponseEnum.DEFAULT_OK.getCode();
        this.message = BaseResponseEnum.DEFAULT_OK.getMessage();
    }

    public BaseResponse(BaseResponseEnum baseResponseEnum, T content) {
        this.code = baseResponseEnum.getCode();
        this.message = baseResponseEnum.getMessage();
        this.content = content;
    }

    public BaseResponse(BaseResponseEnum baseResponseEnum) {
        this.code = baseResponseEnum.getCode();
        this.message = baseResponseEnum.getMessage();
    }

    public BaseResponse(Integer code, String message, T content) {
        this.code = code;
        this.message = message;
        this.content = content;
    }

}
