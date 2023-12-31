package com.example.demo.service.impl;

import com.example.demo.domain.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ssx
 * @since 2023-06-17
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
