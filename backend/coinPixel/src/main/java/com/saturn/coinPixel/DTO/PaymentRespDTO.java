package com.saturn.coinPixel.DTO;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class PaymentRespDTO {

    private Long idPayment;
    private String descPayment;
    private BigDecimal valuePayment;
    private String typePayment;
    private LocalDateTime datePayment;
    private Long UserPayer;
}
