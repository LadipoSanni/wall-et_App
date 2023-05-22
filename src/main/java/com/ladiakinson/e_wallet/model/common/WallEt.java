package com.ladiakinson.e_wallet.model.common;

import com.ladiakinson.e_wallet.model.common.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class WallEt {
    private String accountName;
    private String email;
    private String transactionPin;
    private List<BankCard> cards;
    private AccountType accountType;
    private BigDecimal accountBalance;
    private List<TransactionHistory> transactionHistoryList;
}
