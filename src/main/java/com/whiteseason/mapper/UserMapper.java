package com.whiteseason.mapper;

import com.whiteseason.Beans.User;

public interface UserMapper {
    User GetUserByID(Integer id) throws Exception;
}
