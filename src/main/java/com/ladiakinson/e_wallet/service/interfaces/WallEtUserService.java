package com.ladiakinson.e_wallet.service.interfaces;

import com.ladiakinson.e_wallet.dto.request.RegisterUserRequest;
import com.ladiakinson.e_wallet.exception.WallEtException;
import com.ladiakinson.e_wallet.model.common.User;

public interface WallEtUserService {
    User createUser(RegisterUserRequest request) throws WallEtException;
    User saveUser(User user);
}
