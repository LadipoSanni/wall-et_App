package com.ladiakinson.e_wallet.model.common;

import com.ladiakinson.e_wallet.model.common.enums.CardName;
import com.ladiakinson.e_wallet.model.common.enums.CardType;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class BankCard {
    private String bankCardIssuer;
    private String cardNumber;
    private LocalDate validThru;
    private String cardName;
    private CardName cardVendor;
    private CardType cardType;
    private String cvv;
    private String pin;

}
