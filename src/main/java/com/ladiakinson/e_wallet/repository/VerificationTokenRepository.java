package com.ladiakinson.e_wallet.repository;

import com.ladiakinson.e_wallet.model.confirmation.VerificationToken;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface VerificationTokenRepository extends MongoRepository<VerificationToken, String> {
    Optional<VerificationToken> findVerificationTokenByToken(String token);

}
