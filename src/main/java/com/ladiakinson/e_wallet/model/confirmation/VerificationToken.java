package com.ladiakinson.e_wallet.model.confirmation;

import com.ladiakinson.e_wallet.dto.request.TokenRequest;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Document
@Builder
public class VerificationToken {
    @Id
    @Setter(AccessLevel.PRIVATE)
    private String id;
    @NonNull
    private String token;
    @NonNull
    private LocalDateTime expiredAt;
    private LocalDateTime confirmedAt;
    private LocalDateTime createdAt = LocalDateTime.now();
    @NonNull
    private TokenRequest request;
    private String email;

}
