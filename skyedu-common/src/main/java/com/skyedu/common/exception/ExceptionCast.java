package com.skyedu.common.exception;

import com.skyedu.common.model.response.ResultCode;

public class ExceptionCast {

    public static void cast(ResultCode resultCode){
        throw new CustomException(resultCode);
    }
}
