package com.skyedu.cms.controller;

import com.skyedu.api.cms.CmsPageControllerApi;
import com.skyedu.cms.service.PageService;
import com.skyedu.common.domain.cms.CmsPage;
import com.skyedu.common.domain.cms.request.QueryPageRequest;
import com.skyedu.common.domain.cms.response.CmsPageResult;
import com.skyedu.common.model.response.QueryResponseResult;
import com.skyedu.common.model.response.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/cms/page")
public class CmsPageController implements CmsPageControllerApi {

    @Autowired
    PageService pageService;
    @Override
    public QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest) {
        return pageService.findList(page,size,queryPageRequest);
    }

    @Override
    public CmsPageResult add(CmsPage cmsPage) {
        return pageService.add(cmsPage);
    }

    @Override
    public CmsPage findById(String id) {
        return pageService.getById(id);
    }

    @Override
    public CmsPageResult edit(String id, CmsPage cmsPage) {
        return pageService.update(id,cmsPage);
    }

    @Override
    public ResponseResult delete(String id) {
        return pageService.delete(id);
    }

    @Override
    public ResponseResult post(String pageId) {
        return pageService.post(pageId);
    }
}




