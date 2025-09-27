package com.maison.maisonpicture.application.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.maison.maisonpicture.domain.user.entity.User;
import com.maison.maisonpicture.infrastructure.common.DeleteRequest;
import com.maison.maisonpicture.interfaces.dto.user.UserLoginRequest;
import com.maison.maisonpicture.interfaces.dto.user.UserQueryRequest;
import com.maison.maisonpicture.interfaces.dto.user.UserRegisterRequest;
import com.maison.maisonpicture.interfaces.vo.user.LoginUserVO;
import com.maison.maisonpicture.interfaces.vo.user.UserVO;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Set;

/**
* @author shunhewang
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2025-09-06 01:38:02
*/
public interface UserApplicationService {

    long addUser(User user);

    User getUserById(long id);

    UserVO getUserVOById(long id);

    boolean deleteUser(DeleteRequest deleteRequest);

    void updateUser(User user);

    Page<UserVO> listUserVOByPage(UserQueryRequest userQueryRequest);

    List<User> listByIds(Set<Long> userIdSet);

    String getEncryptPassword(String userPassword);


    LoginUserVO getLoginUserVO(User user);

    @Transactional
    long userRegister(UserRegisterRequest userRegisterRequest);

    LoginUserVO userLogin(UserLoginRequest userLoginRequest, HttpServletRequest request);

    /**
     * 获取当前登录用户
     *
     * @param request
     * @return
     */
    User getLoginUser(HttpServletRequest request);

    /**
     * 用户注销
     *
     * @param request
     * @return
     */
    boolean userLogout(HttpServletRequest request);


    UserVO getUserVO(User user);

    List<UserVO> getUserVOList(List<User> userList);

    QueryWrapper<User> getQueryWrapper(UserQueryRequest userQueryRequest);

}
