package com.saturn.coinPixel.Service;

import com.saturn.coinPixel.DTO.PaymentReqDTO;
import com.saturn.coinPixel.DTO.PaymentRespDTO;
import com.saturn.coinPixel.Entity.PaymentEntity;
import com.saturn.coinPixel.Mapper.PaymentMapper;
import com.saturn.coinPixel.Repository.IPaymentRepository;
import jakarta.transaction.Transactional;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Transactional
@Service
@Getter
@Setter
public class PaymentService{
    private final IPaymentRepository repository;
    private final PaymentMapper mapper;

    public PaymentService(IPaymentRepository repository, PaymentMapper mapper){
        this.repository = repository;
        this.mapper = mapper;
    }

    public PaymentEntity createPayment(PaymentReqDTO dto){
        if(dto.getValuePayment().equals(new BigDecimal("0.0")) ){
            throw new RuntimeException("valor do pagamento nao pode ser zero");
        }
        var sav = mapper.toEntity(dto);
        return repository.save(sav);
    }

    public PaymentEntity UpdatePayment(Long id, PaymentReqDTO dto){
        PaymentEntity old = findById(id);
        old.setDescPayment(dto.getDescPayment());
        old.setValuePayment(dto.getValuePayment());
        old.setTypePayment(dto.getTypePayment());
        old.setDatePayment(dto.getDatePayment());
        old.setUserPayer(dto.getUserPayer());
        return  repository.save(old);
    }

    public void deletePayment(Long id){
        PaymentEntity del = findById(id);
        repository.delete(del);
    }

    public Page<PaymentRespDTO> findAll(Pageable pageable){
        return repository.findAll(pageable).map(mapper::toDto);
    }

    public PaymentEntity findById(Long id){
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pagamento nao encontrado para esse ID: " + id));
    }

    public Page<PaymentRespDTO> findByValue(BigDecimal value, Pageable pageable){
            return repository.findByValuePayment(value, pageable).map(mapper::toDto);
    }

}
