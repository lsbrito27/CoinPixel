package com.saturn.coinPixel.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "payment_method")
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
