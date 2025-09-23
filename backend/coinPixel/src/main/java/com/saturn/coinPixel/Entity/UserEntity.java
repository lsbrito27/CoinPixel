package com.saturn.coinPixel.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idUser;

    @Column(name = "usr_name")
    private String nameUser;

    @Column(name = "usr_login")
    private String loginUser;

    @Column(name = "usr_password")
    private String passwordUser;

    @Column(name = "usr_email")
    private String emailUser;
}
