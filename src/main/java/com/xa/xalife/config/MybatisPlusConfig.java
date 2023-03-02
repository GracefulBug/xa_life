package com.xa.xalife.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(value = "com.xa.xalife.mapper")
public class MybatisPlusConfig {
}
