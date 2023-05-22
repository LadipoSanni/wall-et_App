package com.ladiakinson.e_wallet.dto.request;

import com.ladiakinson.e_wallet.model.common.enums.Bank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class FundTransferRequest {
    private String userId;
    private BigDecimal amount;
    private Enum<Bank> recipientBank;
    private String accountNumber;
    private String pin;
}
