package com.ilearning.design;

import com.ilearning.design.annotation.Select;

/**
 * 查询用户信息
 *
 * @author yuwenbo
 * @date 2022/6/20 6:00
 **/
public interface IUserDao {

    /**
     * 查询用户信息
     *
     * @param uId
     * @return
     */
    @Select("SELECT userName FROM t_user WHERE uID = #{uId}")
    String queryUserInfo(String uId);

}
