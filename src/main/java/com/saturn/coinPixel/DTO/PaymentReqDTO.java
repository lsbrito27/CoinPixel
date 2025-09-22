package com.saturn.coinPixel.DTO;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class PaymentReqDTO {

    private Long idPayment;
    private String descPayment;
    private BigDecimal valuePayment;
    private String typePayment;
    private LocalDateTime datePayment;
    private Long UserPayer;
}
