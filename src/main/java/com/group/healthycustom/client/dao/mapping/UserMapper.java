package com.group.healthycustom.client.dao.mapping;

import com.group.healthycustom.client.pojo.User;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

@Component
public interface UserMapper extends Mapper<User> {
}