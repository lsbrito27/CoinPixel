package com.saturn.coinPixel.Mapper;

import com.saturn.coinPixel.DTO.PaymentReqDTO;
import com.saturn.coinPixel.DTO.PaymentRespDTO;
import com.saturn.coinPixel.Entity.PaymentEntity;
import lombok.Builder;
import org.springframework.stereotype.Component;

@Component
@Builder
public class PaymentMapper {

    public PaymentEntity toEntity(PaymentReqDTO dto) {
        if (dto == null) {return null;}
        PaymentEntity entity = PaymentEntity.builder()
                .descPayment(dto.getDescPayment())
                .valuePayment(dto.getValuePayment())
                .typePayment(dto.getTypePayment())
                .datePayment(dto.getDatePayment())
                .UserPayer(dto.getUserPayer())
                .build();

        return entity;
    }

    public PaymentRespDTO toDto(PaymentEntity entity) {
        if (entity == null) {return null;}
        PaymentRespDTO dto = PaymentRespDTO.builder()
                .idPayment(entity.getIdPayment())
                .descPayment(entity.getDescPayment())
                .valuePayment(entity.getValuePayment())
                .typePayment(entity.getTypePayment())
                .datePayment(entity.getDatePayment())
                .UserPayer(entity.getUserPayer())
                .build();

        return dto;
    }

}