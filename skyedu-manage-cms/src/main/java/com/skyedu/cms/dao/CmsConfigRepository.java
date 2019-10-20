package com.skyedu.cms.dao;


import com.skyedu.common.domain.cms.CmsConfig;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CmsConfigRepository extends MongoRepository<CmsConfig,String> {
}
