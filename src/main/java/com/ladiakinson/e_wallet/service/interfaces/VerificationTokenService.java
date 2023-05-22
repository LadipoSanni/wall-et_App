package com.ladiakinson.e_wallet.service.interfaces;

import com.ladiakinson.e_wallet.dto.request.TokenRequest;
import com.ladiakinson.e_wallet.exception.WallEtException;
import com.ladiakinson.e_wallet.model.confirmation.VerificationToken;

public interface VerificationTokenService {
    VerificationToken findVerificationTokenObject(String token) throws WallEtException;

    VerificationToken createPasswordResetToken(String email) throws WallEtException;

    VerificationToken verifyToken(String token) throws WallEtException;

    VerificationToken createVerificationToken(TokenRequest request) throws WallEtException;

    VerificationToken createEmailVerificationToken(String email) throws WallEtException;

    VerificationToken verifyAndEnsureValidToken(String token) throws WallEtException;

    void deleteToken(VerificationToken verificationToken);
}

