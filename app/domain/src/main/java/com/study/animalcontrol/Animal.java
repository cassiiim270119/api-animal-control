package com.study.animalcontrol;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Builder
public class Animal {
    private String name;
    private Integer age;
    private Double inputPrice;
    private Double outputPrice;
    private LocalDateTime inputDate;
}
