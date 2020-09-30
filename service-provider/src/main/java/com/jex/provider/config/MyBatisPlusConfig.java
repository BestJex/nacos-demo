package com.jex.provider.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.jex.provider.mapper")
public class MyBatisPlusConfig {
}
