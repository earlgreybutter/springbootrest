package com.example.springbootrest.repository;

import java.util.List;

import com.example.springbootrest.model.Emp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends JpaRepository<Emp, Integer> {
    
    List<Emp> findBySalBetween(int sal1, int sal2);
}

// db 데이터 조작을 위한 영속성 계층 클래스 
