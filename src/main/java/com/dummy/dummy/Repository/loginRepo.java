package com.dummy.dummy.Repository;

import com.dummy.dummy.entity.loginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface loginRepo extends JpaRepository<loginEntity, Integer> {
}
