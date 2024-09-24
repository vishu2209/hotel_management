package com.vishal.service.interfac;

import com.vishal.dto.LoginRequest;
import com.vishal.dto.Response;
import com.vishal.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
