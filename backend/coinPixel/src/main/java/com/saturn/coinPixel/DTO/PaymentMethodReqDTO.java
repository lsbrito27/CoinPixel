package com.saturn.coinPixel.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentMethodReqDTO {

    private Long idPaymentMethod;
    private String nameType;
    private String methodPayment;
    private String methodUser;
}
