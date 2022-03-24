package com.demo.S502.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.S502.dto.PlayerResponseDto;


public interface IDiceRepository extends JpaRepository<PlayerResponseDto, Integer> {

}
