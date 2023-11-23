package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Emp;

public interface Emprepo extends JpaRepository<Emp , Integer> {

    
} 