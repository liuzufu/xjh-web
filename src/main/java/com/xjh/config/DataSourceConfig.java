package com.xjh.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    private static final String PREFIX = "spring.datasource";

    @Bean
    @ConfigurationProperties(prefix = PREFIX)
    public DataSource dataSource(){
        return new DruidDataSource();
    }

}
