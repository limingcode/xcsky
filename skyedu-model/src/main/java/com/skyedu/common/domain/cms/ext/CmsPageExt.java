package com.skyedu.common.domain.cms.ext;

import com.skyedu.common.domain.cms.CmsPage;
import lombok.Data;
import lombok.ToString;


@Data
@ToString
public class CmsPageExt extends CmsPage {
    private String htmlValue;

}
