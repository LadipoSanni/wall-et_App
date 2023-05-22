package com.ladiakinson.e_wallet.dto.request;

import com.ladiakinson.e_wallet.model.common.enums.Role;
import lombok.*;

import java.util.Map;

@Getter
@AllArgsConstructor
@Builder
@RequiredArgsConstructor
@NoArgsConstructor(force = true)
public class TokenRequest {
    @NonNull
    private String emailAddress;
    private Role role;
    private String firstName;
    private String middleName;
    private String lastName;
    private Map<?,?> info;

    public TokenRequest(@NonNull String emailAddress, Role role){
        this.emailAddress = emailAddress;
        this.role = role;
    }

}
