package com.saturn.coinPixel.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserReqDTO {

    private Long idUser;
    private String nameUser;
    private String loginUser;
    private String passwordUser;
    private String emailUser;
}
