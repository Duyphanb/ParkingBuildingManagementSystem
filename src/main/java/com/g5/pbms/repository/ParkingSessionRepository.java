package com.g5.pbms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.g5.pbms.entity.ParkingSession;

// TODO: Tầng giao tiếp DB cho ParkingSession - Custom queries cho active sessions, completed sessions, duration
@Repository
public interface ParkingSessionRepository extends JpaRepository<ParkingSession, Long> {
}

