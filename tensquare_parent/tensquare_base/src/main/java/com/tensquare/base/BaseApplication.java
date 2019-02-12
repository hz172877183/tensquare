package com.tensquare.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import until.IdWorker;

/**
 * @Description: 启动类
 * @ProjectName: tensquare_parent
 * @Package: com.tensquare.base
 * @Author: hz
 * @Date: 2019/2/12 17:22
 * @Version: 1.0
 */
@SpringBootApplication
public class BaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(BaseApplication.class);
    }

    @Bean
    public IdWorker idWorker(){
        return new IdWorker(1,1);
    }
}
