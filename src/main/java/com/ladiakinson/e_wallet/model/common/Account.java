package com.ladiakinson.e_wallet.model.common;

import com.ladiakinson.e_wallet.model.common.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.List;

@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Data
public class Account {
    @Id
    private String id;
    private String userId;
    private  String pin;
    private String accountNumber;
    private String accountName;
    private String bankName;
    private String phoneNumber;
    private String email;
    private Address address;
    private String bvn;
    private AccountType accountType;
    private List<TransactionHistory> transactionHistories;
}
