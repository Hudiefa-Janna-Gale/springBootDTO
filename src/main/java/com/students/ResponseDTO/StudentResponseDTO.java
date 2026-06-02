package com.students.ResponseDTO;

import java.util.UUID;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentResponseDTO {
    private UUID id;
    private String name;
    private String dob;
}
