package com.hei.school.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
public class Payment {
    private Long id;
    private double amount;
    private String paymentMethod;
    private LocalDateTime paymentDate;
    private String volaPaymentId;
    private String status;
}
