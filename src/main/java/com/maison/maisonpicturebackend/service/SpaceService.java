package com.maison.maisonpicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.maison.maisonpicturebackend.model.dto.space.SpaceAddRequest;
import com.maison.maisonpicturebackend.model.dto.space.SpaceQueryRequest;
import com.maison.maisonpicturebackend.model.entity.Space;
import com.maison.maisonpicturebackend.model.entity.Space;
import com.maison.maisonpicturebackend.model.entity.User;
import com.maison.maisonpicturebackend.model.vo.SpaceVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author shunhewang
* @description 针对表【space(空间)】的数据库操作Service
* @createDate 2025-09-14 11:21:46
*/
public interface SpaceService extends IService<Space> {

    long addSpace(SpaceAddRequest spaceAddRequest, User loginUser);

    void validSpace(Space space, boolean add);

    SpaceVO getSpaceVO(Space space, HttpServletRequest request);

    Page<SpaceVO> getSpaceVOPage(Page<Space> spacePage, HttpServletRequest request);

    QueryWrapper<Space> getQueryWrapper(SpaceQueryRequest spaceQueryRequest);


    void fillSpaceBySpaceLevel(Space space);
}
