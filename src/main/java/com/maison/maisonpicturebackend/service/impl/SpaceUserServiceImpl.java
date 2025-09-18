package com.maison.maisonpicturebackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.maison.maisonpicturebackend.model.entity.SpaceUser;
import com.maison.maisonpicturebackend.service.SpaceUserService;
import com.maison.maisonpicturebackend.mapper.SpaceUserMapper;
import org.springframework.stereotype.Service;

/**
* @author shunhewang
* @description 针对表【space_user(空间用户关联)】的数据库操作Service实现
* @createDate 2025-09-18 22:10:07
*/
@Service
public class SpaceUserServiceImpl extends ServiceImpl<SpaceUserMapper, SpaceUser>
    implements SpaceUserService{

}




