package com.maison.maisonpicture.infrastructure.repository;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.maison.maisonpicture.domain.user.entity.User;
import com.maison.maisonpicture.domain.user.repository.UserRepository;
import com.maison.maisonpicture.infrastructure.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserRepositoryImpl extends ServiceImpl<UserMapper, User> implements UserRepository {
}
