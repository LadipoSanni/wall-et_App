package com.ladiakinson.e_wallet.dto.request;


import com.ladiakinson.e_wallet.model.common.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
@AllArgsConstructor
public class RegisterUserRequest {
    private String email;
    private String password;
}
