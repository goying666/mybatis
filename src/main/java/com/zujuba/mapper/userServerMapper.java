package com.zujuba.mapper;

import com.zujuba.domain.userLogin;
import com.zujuba.domain.userbasic;

/***********************************
 * 此类说明：用于user相关数据库的维护
 * 开发时间：2018-04-20
 * 作    者：Goying
 ************************************/
public interface userServerMapper {
    //增加用户登录信息
    Integer addUserLogin(userLogin loginInfo);

    //新增用户信息
    Integer adduserbaseic(userbasic user);

    //查询用户信息是否存在
    //当前只能用name进行判断，后续用唯一标识（手机、onlyID）进行判断；
    //    Integer userIsOld(String onlyId);
    Integer userIsOld(String name);
}
