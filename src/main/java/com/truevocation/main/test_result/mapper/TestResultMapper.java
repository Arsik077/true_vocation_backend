package com.truevocation.main.test_result.mapper;

import com.truevocation.main.prof_test.mapper.ProfTestMapper;
import com.truevocation.main.recommendation.mapper.RecommendationMapper;
import com.truevocation.main.test_result.entity.TestResult;
import com.truevocation.main.app_user.mapper.AppUserMapper;
import com.truevocation.main.test_result.dto.TestResultDTO;
import com.truevocation.service.mapper.EntityMapper;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link TestResult} and its DTO {@link TestResultDTO}.
 */
@Mapper(componentModel = "spring", uses = { AppUserMapper.class, RecommendationMapper.class, ProfTestMapper.class })
public interface TestResultMapper extends EntityMapper<TestResultDTO, TestResult> {
    @Mapping(target = "appUser", source = "appUser", qualifiedByName = "id")
    @Mapping(target = "recommendation", source = "recommendation", qualifiedByName = "id")
    @Mapping(target = "profTest", source = "profTest", qualifiedByName = "id")
    TestResultDTO toDto(TestResult s);

    @Named("id")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    TestResultDTO toDtoId(TestResult testResult);
}
