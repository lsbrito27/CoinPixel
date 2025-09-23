package com.saturn.coinPixel.Mapper;

import com.saturn.coinPixel.DTO.UserReqDTO;
import com.saturn.coinPixel.DTO.UserRespDTO;
import com.saturn.coinPixel.Entity.UserEntity;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Builder
public class UserMapper {

    public UserEntity toEntity(UserReqDTO dto){
        if(dto ==null){return  null;}
        UserEntity entity = new UserEntity();
        entity.setIdUser(dto.getIdUser());
        entity.setLoginUser(dto.getLoginUser());
        entity.setNameUser(dto.getNameUser());
        entity.setPasswordUser(dto.getPasswordUser());
        entity.setEmailUser(dto.getEmailUser());
        return entity;
    }

    public UserRespDTO toDto(UserEntity entity){
        if(entity == null){return null;}
        UserRespDTO dto = new UserRespDTO();
        dto.setIdUser(entity.getIdUser());
        dto.setLoginUser(entity.getLoginUser());
        dto.setNameUser(entity.getNameUser());
        dto.setPasswordUser(entity.getPasswordUser());
        dto.setEmailUser(entity.getEmailUser());
        return dto;
    }

}
