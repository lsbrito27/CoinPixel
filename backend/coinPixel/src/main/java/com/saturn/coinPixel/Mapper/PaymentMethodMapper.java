package com.saturn.coinPixel.Mapper;

import com.saturn.coinPixel.DTO.PaymentMethodReqDTO;
import com.saturn.coinPixel.DTO.PaymentMethodRespDTO;
import com.saturn.coinPixel.DTO.PaymentRespDTO;
import com.saturn.coinPixel.Entity.PaymentEntity;
import com.saturn.coinPixel.Entity.PaymentMethodEntity;
import lombok.Builder;
import org.springframework.stereotype.Component;

@Component
@Builder
public class PaymentMethodMapper {

    public PaymentMethodEntity toEntity(PaymentMethodReqDTO dto){
        if(dto == null){return  null;}
        PaymentMethodEntity entity = PaymentMethodEntity.builder()
                .nameType(dto.getNameType())
                .methodPayment(dto.getMethodPayment())
                .methodUser(dto.getMethodUser())
                .build();

        return entity;
    }

    public PaymentMethodRespDTO toDto(PaymentMethodEntity entity){
        if(entity == null){ return  null;}
        PaymentMethodRespDTO  dto = PaymentMethodRespDTO.builder()
                .nameType(entity.getNameType())
                .methodPayment(entity.getMethodPayment())
                .methodUser(entity.getMethodUser())
                .build();
        return dto;
    }
}
