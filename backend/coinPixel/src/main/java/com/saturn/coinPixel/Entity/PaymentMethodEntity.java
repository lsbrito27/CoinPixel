package com.saturn.coinPixel.Entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "payment_method")
@Builder
@Getter @Setter
public class PaymentMethodEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaymentMethod;

    @Column(name = "name_type")
    private String nameType;

    @Column(name = "method_payment")
    private String methodPayment;

    @Column(name = "method_user")
    private String methodUser;
}
