package com.example.Sample.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Sample.entities.Courses;

@Repository
public interface Coursedao  extends JpaRepository<Courses, Long> {

}
