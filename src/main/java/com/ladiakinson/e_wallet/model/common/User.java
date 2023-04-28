package com.ladiakinson.e_wallet.model.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ladiakinson.e_wallet.model.common.enums.Gender;
import com.ladiakinson.e_wallet.model.common.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Data
@JsonIgnoreProperties({"password", "passwordResetToken"})
public class User implements Serializable {
    @Id
    private String userId;
    private String firstName;
    private String surname;
    private String email;
    private String phoneNumber;
    private String password;
    private String profileImageUrl;
    private Gender gender;
    private Role role;
    private Address address;
    private boolean profileCompleted;
    private String passwordToken;
    private boolean enabled = true;

    private User(String userId){
        this.userId = userId;
    }
    private User(String email, Role role){
        this.email = email;
        this.role = role;
    }
    private User(String firstName,String surname){
        this.firstName = firstName;
        this.surname = surname;
    }

}
