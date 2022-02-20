package com.truevocation.config;

import java.time.Duration;

import com.truevocation.main.achievement.entity.Achievement;
import com.truevocation.main.answer.entity.Answer;
import com.truevocation.main.answer_user.entity.AnswerUser;
import com.truevocation.main.app_user.entity.AppUser;
import com.truevocation.main.city.entity.City;
import com.truevocation.main.comment_answer.entity.CommentAnswer;
import com.truevocation.main.comments.entity.Comments;
import com.truevocation.main.contact.entity.Contact;
import com.truevocation.main.course.entity.Course;
import com.truevocation.main.demand_profession_city.entity.DemandProfessionCity;
import com.truevocation.main.faculty.entity.Faculty;
import com.truevocation.main.favorite.entity.Favorite;
import com.truevocation.main.language.entity.Language;
import com.truevocation.main.likes.entity.Likes;
import com.truevocation.main.portfolio.entity.Portfolio;
import com.truevocation.main.post.entity.Post;
import com.truevocation.main.prof_test.entity.ProfTest;
import com.truevocation.main.profession.entity.Profession;
import com.truevocation.main.question.entity.Question;
import com.truevocation.main.recommendation.entity.Recommendation;
import com.truevocation.main.school.entity.School;
import com.truevocation.main.specialty.entity.Specialty;
import com.truevocation.main.subject.entity.Subject;
import com.truevocation.main.test_result.entity.TestResult;
import com.truevocation.main.translation.entity.Translation;
import com.truevocation.main.university.entity.University;
import org.ehcache.config.builders.*;
import org.ehcache.jsr107.Eh107Configuration;
import org.hibernate.cache.jcache.ConfigSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cache.JCacheManagerCustomizer;
import org.springframework.boot.autoconfigure.orm.jpa.HibernatePropertiesCustomizer;
import org.springframework.boot.info.BuildProperties;
import org.springframework.boot.info.GitProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.*;
import tech.jhipster.config.JHipsterProperties;
import tech.jhipster.config.cache.PrefixedKeyGenerator;

@Configuration
@EnableCaching
public class CacheConfiguration {

    private GitProperties gitProperties;
    private BuildProperties buildProperties;
    private final javax.cache.configuration.Configuration<Object, Object> jcacheConfiguration;

    public CacheConfiguration(JHipsterProperties jHipsterProperties) {
        JHipsterProperties.Cache.Ehcache ehcache = jHipsterProperties.getCache().getEhcache();

        jcacheConfiguration =
            Eh107Configuration.fromEhcacheCacheConfiguration(
                CacheConfigurationBuilder
                    .newCacheConfigurationBuilder(Object.class, Object.class, ResourcePoolsBuilder.heap(ehcache.getMaxEntries()))
                    .withExpiry(ExpiryPolicyBuilder.timeToLiveExpiration(Duration.ofSeconds(ehcache.getTimeToLiveSeconds())))
                    .build()
            );
    }

    @Bean
    public HibernatePropertiesCustomizer hibernatePropertiesCustomizer(javax.cache.CacheManager cacheManager) {
        return hibernateProperties -> hibernateProperties.put(ConfigSettings.CACHE_MANAGER, cacheManager);
    }

    @Bean
    public JCacheManagerCustomizer cacheManagerCustomizer() {
        return cm -> {
            createCache(cm, com.truevocation.repository.UserRepository.USERS_BY_LOGIN_CACHE);
            createCache(cm, com.truevocation.repository.UserRepository.USERS_BY_EMAIL_CACHE);
            createCache(cm, com.truevocation.domain.User.class.getName());
            createCache(cm, com.truevocation.domain.Authority.class.getName());
            createCache(cm, com.truevocation.domain.User.class.getName() + ".authorities");
            createCache(cm, City.class.getName());
            createCache(cm, City.class.getName() + ".demandProfessionCities");
            createCache(cm, City.class.getName() + ".schools");
            createCache(cm, City.class.getName() + ".universities");
            createCache(cm, City.class.getName() + ".courses");
            createCache(cm, Favorite.class.getName());
            createCache(cm, Faculty.class.getName());
            createCache(cm, Faculty.class.getName() + ".specialties");
            createCache(cm, Faculty.class.getName() + ".universities");
            createCache(cm, Specialty.class.getName());
            createCache(cm, Specialty.class.getName() + ".subjects");
            createCache(cm, Specialty.class.getName() + ".professions");
            createCache(cm, University.class.getName());
            createCache(cm, University.class.getName() + ".contacts");
            createCache(cm, University.class.getName() + ".favorites");
            createCache(cm, University.class.getName() + ".comments");
            createCache(cm, University.class.getName() + ".faculties");
            createCache(cm, Translation.class.getName());
            createCache(cm, DemandProfessionCity.class.getName());
            createCache(cm, Profession.class.getName());
            createCache(cm, Profession.class.getName() + ".demandProfessionCities");
            createCache(cm, Profession.class.getName() + ".recommendations");
            createCache(cm, Profession.class.getName() + ".courses");
            createCache(cm, Profession.class.getName() + ".specialties");
            createCache(cm, Contact.class.getName());
            createCache(cm, Subject.class.getName());
            createCache(cm, Subject.class.getName() + ".specialties");
            createCache(cm, Likes.class.getName());
            createCache(cm, Comments.class.getName());
            createCache(cm, Comments.class.getName() + ".likes");
            createCache(cm, Comments.class.getName() + ".commentAnswers");
            createCache(cm, CommentAnswer.class.getName());
            createCache(cm, Post.class.getName());
            createCache(cm, Post.class.getName() + ".likes");
            createCache(cm, Post.class.getName() + ".favorites");
            createCache(cm, Post.class.getName() + ".comments");
            createCache(cm, Course.class.getName());
            createCache(cm, Course.class.getName() + ".contacts");
            createCache(cm, Course.class.getName() + ".professions");
            createCache(cm, School.class.getName());
            createCache(cm, School.class.getName() + ".portfolios");
            createCache(cm, Portfolio.class.getName());
            createCache(cm, Portfolio.class.getName() + ".contacts");
            createCache(cm, Portfolio.class.getName() + ".achievements");
            createCache(cm, Portfolio.class.getName() + ".languages");
            createCache(cm, Portfolio.class.getName() + ".schools");
            createCache(cm, Language.class.getName());
            createCache(cm, Language.class.getName() + ".portfolios");
            createCache(cm, Achievement.class.getName());
            createCache(cm, ProfTest.class.getName());
            createCache(cm, ProfTest.class.getName() + ".questions");
            createCache(cm, ProfTest.class.getName() + ".testResults");
            createCache(cm, Question.class.getName());
            createCache(cm, Question.class.getName() + ".answers");
            createCache(cm, Answer.class.getName());
            createCache(cm, Answer.class.getName() + ".questions");
            createCache(cm, TestResult.class.getName());
            createCache(cm, TestResult.class.getName() + ".answerUsers");
            createCache(cm, Recommendation.class.getName());
            createCache(cm, AnswerUser.class.getName());
            createCache(cm, AppUser.class.getName());
            createCache(cm, AppUser.class.getName() + ".comments");
            createCache(cm, AppUser.class.getName() + ".favorites");
            createCache(cm, AppUser.class.getName() + ".commentAnswers");
            createCache(cm, AppUser.class.getName() + ".likes");
            // jhipster-needle-ehcache-add-entry
        };
    }

    private void createCache(javax.cache.CacheManager cm, String cacheName) {
        javax.cache.Cache<Object, Object> cache = cm.getCache(cacheName);
        if (cache != null) {
            cache.clear();
        } else {
            cm.createCache(cacheName, jcacheConfiguration);
        }
    }

    @Autowired(required = false)
    public void setGitProperties(GitProperties gitProperties) {
        this.gitProperties = gitProperties;
    }

    @Autowired(required = false)
    public void setBuildProperties(BuildProperties buildProperties) {
        this.buildProperties = buildProperties;
    }

    @Bean
    public KeyGenerator keyGenerator() {
        return new PrefixedKeyGenerator(this.gitProperties, this.buildProperties);
    }
}
