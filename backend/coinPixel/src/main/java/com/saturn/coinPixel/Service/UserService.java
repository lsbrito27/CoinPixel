package com.saturn.coinPixel.Service;

import com.saturn.coinPixel.DTO.UserReqDTO;
import com.saturn.coinPixel.DTO.UserRespDTO;
import com.saturn.coinPixel.Entity.UserEntity;
import com.saturn.coinPixel.Repository.IUserRepository;
import jakarta.transaction.Transactional;
import lombok.*;
import org.springframework.stereotype.Service;

@Service
@Transactional
@Getter
@Setter
public class UserService {

    private final IUserRepository repository;

    public UserService(IUserRepository repository) {
        this.repository = repository;
    }

    public UserEntity createUser(UserReqDTO dto){

        UserEntity user = new UserEntity();
        user.setNameUser(dto.getNameUser());
        user.setLoginUser(dto.getLoginUser());
        user.setPasswordUser(dto.getPasswordUser());
        user.setEmailUser(dto.getEmailUser());

        return repository.save(user);
    }


}
