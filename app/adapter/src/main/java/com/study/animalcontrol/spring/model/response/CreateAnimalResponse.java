package com.study.animalcontrol.spring.model.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.study.animalcontrol.Animal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Builder
public class CreateAnimalResponse {
    @JsonProperty("nome")
    private String name;

    @JsonProperty("idade_meses")
    private Integer age;

    @JsonProperty("preco_entrada")
    private Double inputPrice;

    @JsonProperty("preco_saida")
    private Double outputPrice;

    @JsonProperty("data_entrada")
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime inputDate;

    public static CreateAnimalResponse fromAnimal(final Animal animal) {
        return CreateAnimalResponse.builder()
                .name(animal.getName())
                .age(animal.getAge())
                .inputPrice(animal.getInputPrice())
                .outputPrice(animal.getOutputPrice())
                .inputDate(animal.getInputDate()).build();
    }
}
