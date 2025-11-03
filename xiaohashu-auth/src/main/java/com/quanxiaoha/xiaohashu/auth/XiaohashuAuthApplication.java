package com.quanxiaoha.xiaohashu.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//@MapperScan("com.quanxiaoha.xiaohashu.auth.domain.mapper")
// 开启 FeignClients 支持, 声明式调用 -- (只在 com.quanxiaoha.xiaohashu 包及其子包下扫描 Feign 客户端接口)
@EnableFeignClients(basePackages = "com.quanxiaoha.xiaohashu")
public class XiaohashuAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaohashuAuthApplication.class, args);
    }

}
