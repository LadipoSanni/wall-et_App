package com.ladiakinson.e_wallet.model.confirmation;


import com.ladiakinson.e_wallet.model.common.enums.Status;
import com.ladiakinson.e_wallet.model.common.enums.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {

    @Id
    private String id;
    private String userId;
    private LocalDateTime dateTime;
    TransactionType transactionType;
    private BigDecimal amount;
    private Status transactionStatus;

    public Transaction(TransactionType transactionType, BigDecimal amount){
        this.dateTime = LocalDateTime.now();
        this.transactionType = transactionType;
        this.amount = amount;
    }
}
