package com.maison.maisonpicturebackend;

import org.apache.shardingsphere.spring.boot.ShardingSphereAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication(exclude = {ShardingSphereAutoConfiguration.class})
@EnableAspectJAutoProxy(exposeProxy = true)
@MapperScan("com.maison.maisonpicturebackend.mapper")
public class MaisonPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MaisonPictureBackendApplication.class, args);
    }

}


