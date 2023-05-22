package com.ladiakinson.e_wallet.service;

import com.ladiakinson.e_wallet.dto.request.TokenRequest;
import com.ladiakinson.e_wallet.exception.WallEtException;
import com.ladiakinson.e_wallet.model.confirmation.VerificationToken;
import com.ladiakinson.e_wallet.repository.VerificationTokenRepository;
import com.ladiakinson.e_wallet.service.interfaces.VerificationTokenService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@AllArgsConstructor
public class VerificationTokenServicesImpl implements VerificationTokenService {

    private final VerificationTokenRepository verificationTokenRepository;

    @Override
    public VerificationToken findVerificationTokenObject(String token) throws WallEtException{
        return verificationTokenRepository.findVerificationTokenByToken(token).orElseThrow(
                () -> new WallEtException("Verification token does not exist")
        );
    }

    @Override
    public VerificationToken createPasswordResetToken(String email) {
        return generateToken(email);
    }

    @Override
    public VerificationToken verifyToken(String token) throws WallEtException {
        VerificationToken verificationToken = findVerificationTokenObject(token);

        if (verificationToken.getConfirmedAt() != null) {
            throw new WallEtException("This token have been used");
        }
        if (verificationToken.getExpiredAt().isBefore(LocalDateTime.now())) {
            throw new WallEtException("This token has expired!!");
        }
        return verificationToken;
    }




    private VerificationToken generateToken(String email) {

        return verificationTokenRepository.save(
                new VerificationToken(
                        UUID.randomUUID().toString(),
                        LocalDateTime.now().plusHours(1L),
                        TokenRequest.builder()
                                .emailAddress(email)
                                .build()
                )
        );
    }

    @Override
    public VerificationToken createVerificationToken(TokenRequest request) {
        long verificationTokenExpirationInDays = 2L;
        VerificationToken verificationToken = new VerificationToken(
                UUID.randomUUID().toString(),
                LocalDateTime.now().plusDays(verificationTokenExpirationInDays),
                request
        );
        return verificationToken;
    }


    @Override
    public VerificationToken createEmailVerificationToken (String email){
        return generateToken(email);
    }

    @Override
    public VerificationToken verifyAndEnsureValidToken (String token) throws WallEtException {
        VerificationToken verificationToken = findVerificationTokenObject(token);

        if (verificationToken.getConfirmedAt() != null) {
            throw new WallEtException("This token have been used");
        }

        if (verificationToken.getExpiredAt().isBefore(LocalDateTime.now())) {
            throw new WallEtException("This token has expired!!");
        }
        return verificationToken;
    }

    @Override
    public void deleteToken (VerificationToken verificationToken){
        verificationTokenRepository.delete(verificationToken);
    }


}
