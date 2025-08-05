package com.hei.school.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Donor {
  private long id;
  private String email;
  private String fullName;
}
