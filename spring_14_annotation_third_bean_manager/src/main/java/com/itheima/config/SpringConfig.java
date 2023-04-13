package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.itheima")
//@Import:导入配置信息，此注解只能添加一次
@Import({JdbcConfig.class})
public class SpringConfig {
}
