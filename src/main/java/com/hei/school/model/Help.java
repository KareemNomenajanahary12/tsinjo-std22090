package com.hei.school.model;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

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
