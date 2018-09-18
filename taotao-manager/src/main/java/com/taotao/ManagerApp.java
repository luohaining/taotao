package com.taotao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/*
 *  @项目名：  taotao-parent
 *  @包名：    com.taotao
 *  @文件名:   ManagerApp
 *  @创建者:   luohaining
 *  @创建时间:  2018/9/11 17:19
 *  @描述：    TODO
 */
//告诉SpringBoot不要检测数据源  exclude不要包含扫描数据源的意思
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)

@SpringBootApplication
public class ManagerApp {
    public static void main(String [] args){
        SpringApplication.run(ManagerApp.class , args);
    }
}
