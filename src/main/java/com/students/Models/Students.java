package com.students.Models;

import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Students {
    private UUID id;
    private String name;
    private String dob;
    private String password;

}
