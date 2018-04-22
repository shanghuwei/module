package com.honghu.module.repo;

import com.honghu.module.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyRepo extends JpaRepository<User,String> {
}
