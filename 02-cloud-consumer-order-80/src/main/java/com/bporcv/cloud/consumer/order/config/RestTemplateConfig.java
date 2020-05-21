package com.bporcv.cloud.consumer.order.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 主题：
 *
 * <p>
 * 代码解释：
 * <p>
 * 预期结果：
 * <p>
 * 解决方案：
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
