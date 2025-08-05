package com.hei.school.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
public class Donation {
    private Long id;
    private Donor donor;
    private Payment payment;
    private LocalDateTime createdAt;
}
