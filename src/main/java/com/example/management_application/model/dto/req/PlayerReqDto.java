package com.example.management_application.model.dto.req;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlayerReqDto {
    private Long id;
    private String name;
    private LocalDate dob;
    private String experience;
    private String address;
    private Long provinceId;
    private String provinceName;
    private Long districtId;
    private String districtName;
    private Long wardId;
    private String wardName;

    private Long positionId;
}
