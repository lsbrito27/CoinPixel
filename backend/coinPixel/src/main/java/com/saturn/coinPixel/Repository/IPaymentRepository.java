package com.saturn.coinPixel.Repository;

import com.saturn.coinPixel.Entity.PaymentEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface IPaymentRepository extends JpaRepository<PaymentEntity, Long> {
    Page<PaymentEntity> findByValuePayment(BigDecimal value, Pageable pageable);
    Page<PaymentEntity> findAll(Pageable pageable);
}
