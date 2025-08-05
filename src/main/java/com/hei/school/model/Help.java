package com.hei.school.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
public class Help {
    private Long id;
    private Beneficiary beneficiary;
    private Payment payment;
    private String accidentDescription;
    private LocalDateTime createdAt;
}
