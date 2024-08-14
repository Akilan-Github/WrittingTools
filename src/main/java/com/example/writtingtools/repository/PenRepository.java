package com.example.writtingtools.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.writtingtools.entity.Pen;

public interface PenRepository extends JpaRepository<Pen, Integer> {

}
