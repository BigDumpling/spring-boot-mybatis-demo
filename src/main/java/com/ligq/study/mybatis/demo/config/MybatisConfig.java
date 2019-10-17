package com.ligq.study.mybatis.demo.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Slf4j
@Configuration
public class MybatisConfig {

    @Bean
    public DataSource dataSource() {
        return DruidDataSourceBuilder.create().build();
    }

//    @Bean
//    @ConditionalOnBean(value = DataSource.class)
//    public SqlSessionFactory sqlSessionFactory() {
//        try {
//            SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//            PathMatchingResourcePatternResolver patternResolver = new PathMatchingResourcePatternResolver();
//            Resource[] mapperLocations = patternResolver.getResources("classpath*:mybatis/**/*.xml");
//
//            sqlSessionFactoryBean.setDataSource(dataSource());
//            sqlSessionFactoryBean.setMapperLocations(mapperLocations);
//            return sqlSessionFactoryBean.getObject();
//        } catch (Exception e) {
//            log.error("配置SqlSessionFactory失败, error == {}", e.getLocalizedMessage());
//        }
//
//        return null;
//    }
}
