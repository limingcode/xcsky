package com.skyedu.api.course;

import com.skyedu.common.domain.course.Teachplan;
import com.skyedu.common.domain.course.ext.TeachplanNode;
import com.skyedu.common.model.response.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author MingLi
 * @version X.0
 * @date 2019/10/20 16:35
 * 课程消息管理统一接口
 *
 */
@Api(value="课程管理接口",description = "课程管理接口，提供课程的增、删、改、查")

public interface CourseControllerApi {
    @ApiOperation("课程计划查询")
    public TeachplanNode findTeachplanList(String courseId);

    @ApiOperation("添加课程计划")
    public ResponseResult addTeachplan(Teachplan teachplan);
}
