package com.saturn.coinPixel.Repository;

import com.saturn.coinPixel.Entity.PaymentMethodEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPaymentMethodRepository extends JpaRepository<PaymentMethodEntity, Long> {
}
