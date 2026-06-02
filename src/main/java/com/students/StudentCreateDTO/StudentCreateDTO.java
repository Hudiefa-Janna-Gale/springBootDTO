package com.students.StudentCreateDTO;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentCreateDTO {

    private UUID id;
    @NotBlank
    private String name;
    @NotBlank
    private String dob;
    @NotBlank
    private String password;
}
