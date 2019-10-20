package com.skyedu.common.domain.cms.response;

import com.skyedu.common.model.response.ResponseResult;
import com.skyedu.common.model.response.ResultCode;
import lombok.Data;

/**
 * 自动将world转化成html
 */
@Data
public class GenerateHtmlResult extends ResponseResult {
    String html;
    public GenerateHtmlResult(ResultCode resultCode, String html) {
        super(resultCode);
        this.html = html;
    }
}
