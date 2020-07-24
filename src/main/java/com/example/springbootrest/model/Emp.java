package com.example.springbootrest.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "emp")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp implements Serializable {

    private static final long serialVersionUID = 1L;
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       @Column(name = "empno")
       private Integer empno;
       @Column(name = "ename")
       private String ename;
       @Column(name = "sal")
       private Integer sal;
    
}

// model/entity 클래스 