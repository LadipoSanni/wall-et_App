package com.ladiakinson.e_wallet.repository;

import com.ladiakinson.e_wallet.model.common.WallEt;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WalletRepository extends MongoRepository<WallEt, Long> {
    boolean existsByEmail(String email);

}
