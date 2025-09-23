package com.saturn.coinPixel.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Builder
@Table(name="payment")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idPayment;

    @Column(name = "desc_payment")
    private String descPayment;

    @Column(name ="value_payment")
    private BigDecimal valuePayment;

    @Column(name = "type_payment")
    private String typePayment;

    @Column(name="date_payment")
    private LocalDateTime datePayment;

    @Column(name = "user_payer")
    private Long UserPayer;
}
