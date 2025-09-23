package com.saturn.coinPixel.Repository;

import com.saturn.coinPixel.DTO.UserRespDTO;
import com.saturn.coinPixel.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserEntity, Long> {
}
