package com.ladiakinson.e_wallet.service.interfaces;

import com.ladiakinson.e_wallet.dto.request.AddBankCardRequest;
import com.ladiakinson.e_wallet.dto.request.CreateWalletRequest;
import com.ladiakinson.e_wallet.dto.request.FundTransferRequest;
import com.ladiakinson.e_wallet.dto.response.AddBankCardResponse;
import com.ladiakinson.e_wallet.dto.response.CreateWalletResponse;
import com.ladiakinson.e_wallet.dto.response.FundTransferResponse;
import com.ladiakinson.e_wallet.exception.WallEtException;
import com.ladiakinson.e_wallet.model.common.User;

public interface WallEtService {
    CreateWalletResponse createWalletResponse(CreateWalletRequest createWalletRequest)
            throws WallEtException;
    AddBankCardResponse addBankCardResponse(String id, AddBankCardRequest addBankCardRequest)
            throws WallEtException;
    FundTransferResponse fundWallet(FundTransferRequest request)
            throws WallEtException;
    boolean existByEmail(String email);
    void sendRegistrationEmail(User user, String token);

}
