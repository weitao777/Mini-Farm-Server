package com.cqut.atao.farm.order.web;


import com.cqut.atao.farm.rocketmq.springboot.starter.message.MessageSink;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName OrderApplication.java
 * @Description 订单启动类
 * @createTime 2023年02月04日 14:42:00
 */
@EnableDiscoveryClient
@EnableBinding({Source.class, MessageSink.class})
@EnableFeignClients("com.cqut.atao.farm.order.domain.remote")
@SpringBootApplication(scanBasePackages = "com.cqut.atao.farm.order")
@MapperScan("com.cqut.atao.farm.order.infrastructure.dao")
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class,args);
    }

}
