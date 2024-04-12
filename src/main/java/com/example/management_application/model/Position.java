package com.example.management_application.model;

import com.example.management_application.model.dto.res.PositionResDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "positions")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public PositionResDto toPositionResDto(){
        PositionResDto positionResDto = new PositionResDto();
        positionResDto.setId(this.getId());
        positionResDto.setName(this.getName());
        return positionResDto;
    }
}
