package com.taotao.service;

/*
 *  @项目名：  taotao-parent
 *  @包名：    com.taotao.service
 *  @文件名:   ServiceApp
 *  @创建者:   luohaining
 *  @创建时间:  2018/9/11 21:16
 *  @描述：    TODO
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan(basePackages = "com.taotao.mapper")
public class ServiceApp {
    public static void main(String [] args){
        SpringApplication.run(ServiceApp.class , args);
    }
}
