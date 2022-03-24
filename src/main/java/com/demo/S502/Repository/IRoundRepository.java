package com.demo.S502.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.S502.dto.RoundResponseDto;

public interface IRoundRepository extends JpaRepository <RoundResponseDto,Integer> {

}
