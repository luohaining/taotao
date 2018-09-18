package com.taotao.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.mapper.UserMapper;
import com.taotao.pojo.User;
import com.taotao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/*
 *  @项目名：  taotao-parent
 *  @包名：    com.taotao.service.impl
 *  @文件名:   UserServiceImpl
 *  @创建者:   luohaining
 *  @创建时间:  2018/9/11 20:00
 *  @描述：    TODO
 */

@Service //一定要使用dubbo的这个@Service注解
public class UserServiceImpl implements UserService {

    //要想在service里面使用mapper，那么service模块必须依赖mapper模块
    @Autowired
    private UserMapper userMapper;

    @Override
    public void save() {

        System.out.println("调用了UserServiceimpl的save方法~！");
    }

    @Override
    public User selectOne(long id) {

        Long id2 =7L;

        return userMapper.selectByPrimaryKey(id2);
    }

    @Override
    public PageInfo<User> findBypage(int currentPage, int pageSize) {

        PageHelper.startPage(currentPage , pageSize);

        List<User> list = userMapper.selectAll();

        return new PageInfo<>(list);
    }
}
