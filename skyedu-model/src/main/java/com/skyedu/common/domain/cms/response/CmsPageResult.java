package com.skyedu.common.domain.cms.response;

import com.skyedu.common.domain.cms.CmsPage;
import com.skyedu.common.model.response.ResponseResult;
import com.skyedu.common.model.response.ResultCode;
import lombok.Data;


@Data
public class CmsPageResult extends ResponseResult {
    CmsPage cmsPage;
    public CmsPageResult(ResultCode resultCode, CmsPage cmsPage) {
        super(resultCode);
        this.cmsPage = cmsPage;
    }
}
