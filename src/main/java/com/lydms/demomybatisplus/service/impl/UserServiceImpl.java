package com.lydms.demomybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lydms.demomybatisplus.service.UserService;
import com.lydms.demomybatisplus.domain.User;
import com.lydms.demomybatisplus.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author liyangda
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-08-11 00:09:09
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

}




