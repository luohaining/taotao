package com.taotao.service;

import com.github.pagehelper.PageInfo;
import com.taotao.pojo.User;

/*
 *  @项目名：  taotao-parent
 *  @包名：    com.taotao.service
 *  @文件名:   UserService
 *  @创建者:   luohaining
 *  @创建时间:  2018/9/11 20:27
 *  @描述：    TODO
 */
public interface UserService {

    void save();

    User selectOne(long id);

    PageInfo<User> findBypage(int currentPage , int pageSize);
}
