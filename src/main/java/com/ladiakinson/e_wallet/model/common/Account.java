package com.ladiakinson.e_wallet.model.common;

import com.ladiakinson.e_wallet.model.common.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Data
public class Account {
    private String id;
    private String userId;
    private  String pin;
    private String accountNumber;
    private String accountName;
    private String bankName;
    private String phoneNumber;
    private Address address;
    private String bvn;
    private AccountType accountType;
    private List<TransactionHistory> transactionHistories;
}
