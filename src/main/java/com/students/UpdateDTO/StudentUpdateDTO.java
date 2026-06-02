package com.students.UpdateDTO;

import lombok.*;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentUpdateDTO {
    private UUID id;
    private String name;
    private String dob;
    private String password;
}
