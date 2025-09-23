package com.saturn.coinPixel.Service;

import com.saturn.coinPixel.DTO.PaymentMethodReqDTO;
import com.saturn.coinPixel.DTO.PaymentMethodRespDTO;
import com.saturn.coinPixel.Entity.PaymentEntity;
import com.saturn.coinPixel.Entity.PaymentMethodEntity;
import com.saturn.coinPixel.Mapper.PaymentMethodMapper;
import com.saturn.coinPixel.Repository.IPaymentMethodRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@AllArgsConstructor
public class PaymentMethodService {

    private final IPaymentMethodRepository repository;
    private final PaymentMethodMapper mapper;

    public PaymentMethodEntity createPaymentMethod(PaymentMethodReqDTO dto){
        var sav = mapper.toEntity(dto);
        return repository.save(sav);
    }

    public PaymentMethodEntity updatePaymentMethod(Long id, PaymentMethodReqDTO dto){
        PaymentMethodEntity old = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Metodo de pagamento nao encontrado para esse ID: " + id));

        old.setNameType(dto.getNameType());
        old.setMethodPayment(dto.getMethodPayment());
        old.setMethodUser(dto.getMethodUser());
        return repository.save(old);
    }

    public void deletePaymentMethod(Long id){
        PaymentMethodEntity del = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Metodo de pagamento nao encontrado para esse ID: " + id));
        repository.delete(del);
    }

    public Page<PaymentMethodRespDTO> findAll(Pageable pageable){
        return repository.findAll(pageable).map(mapper::toDto);
    }



}
