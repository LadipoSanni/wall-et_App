package com.ladiakinson.e_wallet.dto.response;


import com.ladiakinson.e_wallet.model.common.TransactionHistory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class FundTransferResponse {
    private String message;
    private TransactionHistory transaction;
}