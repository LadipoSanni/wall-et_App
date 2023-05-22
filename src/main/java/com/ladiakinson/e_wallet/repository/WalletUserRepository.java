package com.ladiakinson.e_wallet.repository;

import com.ladiakinson.e_wallet.exception.WallEtException;
import com.ladiakinson.e_wallet.model.common.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WalletUserRepository extends MongoRepository<User, String> {
    User findUserById(String userId)throws WallEtException;
    boolean existsByEmail(String email) throws WallEtException;

}
