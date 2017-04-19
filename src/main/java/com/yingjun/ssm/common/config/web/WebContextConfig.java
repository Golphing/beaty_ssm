package com.yingjun.ssm.common.config.web;

import com.yingjun.ssm.common.config.CommonConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@EnableWebMvc
@Import(CommonConfig.class)
@ComponentScan("com.yingjun.ssm.common.config")
public class WebContextConfig {

}
