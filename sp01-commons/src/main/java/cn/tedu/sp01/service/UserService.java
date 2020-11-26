package cn.tedu.sp01.service;

import cn.tedu.sp01.pojo.User;
/**
 * 用户相关的Service接口
 *
 */
public interface UserService {
    //根据用户id查询用户信息接口
    User getUser(Integer id);
    //根据用户id增加用户积分接口
    void addScore(Integer id, Integer score);
}