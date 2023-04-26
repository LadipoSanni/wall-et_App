package com.ladiakinson.e_wallet.model.common.data;

import com.ladiakinson.e_wallet.model.common.enums.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class TransactionHistory {
    private TransactionType transactionType;
    private LocalDateTime localDateTime;
    private String description;
}
