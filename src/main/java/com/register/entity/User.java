package com.register.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_register_form")
public class User {

    @Id
    private String userId;
    private String userName;
    private String email;
    private String phone;
    private String password;
    private String cPassword;
    private String gender;

}
