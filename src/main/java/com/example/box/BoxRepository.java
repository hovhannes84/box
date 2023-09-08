package com.example.box;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BoxRepository extends JpaRepository<BoxEntity,Integer> {
}
