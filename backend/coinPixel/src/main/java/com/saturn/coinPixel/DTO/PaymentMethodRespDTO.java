package com.saturn.coinPixel.DTO;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class PaymentMethodRespDTO {

    private Long idPaymentMethod;
    private String nameType;
    private String methodPayment;
    private String methodUser;
}
