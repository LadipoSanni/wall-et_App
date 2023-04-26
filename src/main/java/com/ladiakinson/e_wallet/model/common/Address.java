package com.ladiakinson.e_wallet.model.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor

public class Address {
    private String buildingNumber;
    private String streetName;
    private String city;
    private String state;
    private String country;
    private String postalCode;
}
