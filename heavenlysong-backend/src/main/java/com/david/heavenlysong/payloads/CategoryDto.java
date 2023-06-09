package com.david.heavenlysong.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {

    private Integer CategoryId;

    @NotBlank
    @Size(min = 4, message = "Min size of category tittle is 4")
    private String categoryTitle;

    @NotBlank
    @Size(min = 10, message = "Min size of category tittle is 10")
    private String categoryDescription;
}
