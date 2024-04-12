package com.example.management_application.model.dto.req;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LocationReqDto {
  private Long id;
  private Long provinceId;
  private String provinceName;
  private Long districtId;
  private String districtName;
  private Long wardId;
  private String wardName;
  private String address;

}
