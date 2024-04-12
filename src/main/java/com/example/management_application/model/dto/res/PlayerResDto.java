package com.example.management_application.model.dto.res;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlayerResDto {
    private Long id;
    private String name;
    private LocalDate dateofBirth;
    private String experience;
//    private Long positionId;
//    private Long locationId;

    private PositionResDto position;
    private LocationResDto location;
}
