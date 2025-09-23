package com.saturn.coinPixel.Controller;

import com.saturn.coinPixel.DTO.PaymentMethodReqDTO;
import com.saturn.coinPixel.DTO.PaymentMethodRespDTO;
import com.saturn.coinPixel.Mapper.PaymentMethodMapper;
import com.saturn.coinPixel.Service.PaymentMethodService;
import com.saturn.coinPixel.Service.PaymentService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/payment-method")

public class PaymentMethodController {

    private final PaymentMethodService service;
    private final PaymentMethodMapper mapper;

    @PostMapping
    public ResponseEntity<PaymentMethodRespDTO> createPaymentMethod(@RequestBody PaymentMethodReqDTO dto){
        var request = service.createPaymentMethod(dto);
        var reponse = mapper.toDto(request);
        return ResponseEntity.ok(reponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PaymentMethodRespDTO> updateMethod(@PathVariable Long id, @RequestBody PaymentMethodReqDTO dto){
        var request = service.updatePaymentMethod(id,dto);
        var response = mapper.toDto(request);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePayment(@PathVariable Long id){
        service.deletePaymentMethod(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<Page<PaymentMethodRespDTO>> findAll(Pageable pageable){
        var request = service.findAll(pageable);
        return ResponseEntity.ok(request);
    }
}
