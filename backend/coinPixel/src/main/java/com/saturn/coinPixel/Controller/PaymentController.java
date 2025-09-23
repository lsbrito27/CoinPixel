package com.saturn.coinPixel.Controller;

import com.saturn.coinPixel.DTO.PaymentReqDTO;
import com.saturn.coinPixel.DTO.PaymentRespDTO;
import com.saturn.coinPixel.Mapper.PaymentMapper;
import com.saturn.coinPixel.Service.PaymentService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@AllArgsConstructor
@RestController
@RequestMapping("/payment")
public class PaymentController {
    private final PaymentService service;
    private final PaymentMapper mapper;

    @PostMapping
    public ResponseEntity<PaymentRespDTO> createPayment(@RequestBody PaymentReqDTO dto){
        var request = service.createPayment(dto);
        var response = mapper.toDto(request);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PaymentRespDTO> updatePayment(@PathVariable Long id, @RequestBody PaymentReqDTO dto){
        var request = service.UpdatePayment(id,dto);
        var response = mapper.toDto(request);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void>deletePayment(@PathVariable Long id){
        service.deletePayment(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<Page<PaymentRespDTO>>findAll(Pageable pageable){
        var request = service.findAll(pageable);
        return ResponseEntity.ok(request);
    }

    @GetMapping("/find-by-id/{id}")
    public  ResponseEntity<PaymentRespDTO> findById(@PathVariable  Long id){
        var request = service.findById(id);
        var response = mapper.toDto(request);
        return  ResponseEntity.ok(response);
    }

    @GetMapping("/find-by-value/{value}")
    public ResponseEntity<Page<PaymentRespDTO>> findByValue(@PathVariable BigDecimal value, Pageable pageable){
        var request = service.findByValue(value, pageable);
        return ResponseEntity.ok(request);
    }
}
