package com.baiyuechu.service;

import com.baiyuechu.domain.ResponseResult;
import com.baiyuechu.domain.User;

public interface LoginService {
    ResponseResult login(User user);

    ResponseResult logout();


}
