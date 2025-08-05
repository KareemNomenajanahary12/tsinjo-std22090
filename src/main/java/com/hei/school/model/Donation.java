package com.hei.school.model;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Donation {
  private Long id;
  private Donor donor;
  private Payment payment;
  private LocalDateTime createdAt;
}
