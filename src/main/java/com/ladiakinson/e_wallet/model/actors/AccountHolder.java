package com.ladiakinson.e_wallet.model.actors;

import com.ladiakinson.e_wallet.model.common.Address;
import com.ladiakinson.e_wallet.model.common.enums.UserType;
import com.ladiakinson.e_wallet.model.common.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class AccountHolder {
    private String firstName;
    private String lastName;
    private LocalDateTime dob;
    private String email;
    private String phoneNumber;
    private String password;
    private String profileImageUrl;
    private Gender gender;
    private Address address;
    private UserType userType;
    private boolean profileCompleted;
    private String passwordResetToken;
    private boolean accountOpened = true;
}
