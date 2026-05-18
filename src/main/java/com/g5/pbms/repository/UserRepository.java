package com.g5.pbms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.g5.pbms.entity.User;

// TODO: Tầng giao tiếp DB cho User - Tìm user theo username, email, role
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

