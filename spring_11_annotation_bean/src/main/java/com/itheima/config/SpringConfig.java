package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration注解用于设定当前类为配置类
@Configuration
/*@ComponentScan注解用于设定扫描路径，此注解只能添加一次，多个数据用数组格式
@ComponentScan({"com.itheima.dao","com.itheima.service"})*/
@ComponentScan("com.itheima")
public class SpringConfig {
}
