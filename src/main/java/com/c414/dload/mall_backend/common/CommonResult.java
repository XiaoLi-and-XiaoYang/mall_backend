package com.c414.dload.mall_backend.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult implements Serializable {

    private Boolean success;
    private Integer code;
    private String msg;
    private Object data;

    public static CommonResult success(Object data, String msg) {
        return new CommonResult(true, 200, msg, data);
    }

    public static CommonResult success(Object data) {
        return new CommonResult(true, 200, "success", data);
    }

    public static CommonResult failed() {
        return new CommonResult(false, 403, "failed", null);
    }

    public static CommonResult failed(String msg) {
        return new CommonResult(false, 403, msg, null);
    }

    public static CommonResult forbidden(String message) {
        return new CommonResult(false, 402, message, null);
    }

    public static CommonResult unauthorized(String message) {
        return new CommonResult(false, 402, message, null);
    }

    public static CommonResult validFailed(String msg) {
        return new CommonResult(false, 402, msg, null);
    }
}
