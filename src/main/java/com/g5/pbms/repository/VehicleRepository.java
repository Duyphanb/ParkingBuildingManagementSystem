package com.g5.pbms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.g5.pbms.entity.Vehicle;

// TODO: Tầng giao tiếp DB cho Vehicle - Tìm xe theo biển số
@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}

