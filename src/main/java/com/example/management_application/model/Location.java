package com.example.management_application.model;

import com.example.management_application.model.dto.res.LocationResDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "locations")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long provinceId;
    private String provinceName;
    private Long districtId;
    private String districtName;

    private Long wardId;
    private String wardName;

    private String address;

    public LocationResDto toLocationResDto() {
        LocationResDto locationResDto = new LocationResDto();
        locationResDto.setId(this.getId());
        locationResDto.setProvinceId(this.getProvinceId());
        locationResDto.setProvinceName(this.getProvinceName());
        locationResDto.setDistrictId(this.getDistrictId());
        locationResDto.setDistrictName(this.getDistrictName());
        locationResDto.setWardId(this.getWardId());
        locationResDto.setWardName(this.getWardName());
        locationResDto.setAddress(this.getAddress());
        return locationResDto;
    }
}
