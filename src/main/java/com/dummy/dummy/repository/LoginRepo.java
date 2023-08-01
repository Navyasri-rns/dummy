package com.dummy.dummy.repository;

import com.dummy.dummy.entity.loginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepo extends JpaRepository<loginEntity,Integer> {
}
