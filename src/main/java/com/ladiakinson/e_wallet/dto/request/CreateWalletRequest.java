package com.ladiakinson.e_wallet.dto.request;

import com.ladiakinson.e_wallet.model.common.User;
import lombok.*;


@Setter
@Getter
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class CreateWalletRequest {
    private User user;
    @NonNull
    private String email;
    private String phoneNumber;
    private String transactionPin;
    @NonNull
    private String password;
    private String nickname;
}
