package com.taotao.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageInfo;
import com.taotao.pojo.User;
import com.taotao.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *  @项目名：  taotao-parent
 *  @包名：    com.taotao.controller
 *  @文件名:   UserController
 *  @创建者:   luohaining
 *  @创建时间:  2018/9/11 17:17
 *  @描述：    TODO
 */

@Service
@RestController //=@Controller + @ResponseBody(表示方法的返回值都是json字符串）
public class UserController {

    //这个注解的意思是：自动注入，在当前项目的Spring容器里面寻找UserService这个接口的实现类对象
    //找到之后，给这个UserSercice赋值进来。Userservice的实现类是UserServiceImpl
    //@Autowired
    @Reference
    private UserService userService;

    @RequestMapping("save")
    private String save(){
        System.out.println("调用了UserController的save方法~！");
        userService.save();
        return "save success~!";
    }

    @RequestMapping("selectOne")
    private User selectOne(){

        User user = userService.selectOne(7);
        return user;
    }

    @RequestMapping("findByPage")
    private PageInfo<User> findByPage(int currentPage , int pageSize){


        return userService.findBypage(currentPage , pageSize);
    }


}
