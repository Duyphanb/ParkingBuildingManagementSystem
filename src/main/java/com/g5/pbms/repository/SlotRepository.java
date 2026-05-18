package com.g5.pbms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.g5.pbms.entity.Slot;

// TODO: Tầng giao tiếp DB cho Slot - Kế thừa JpaRepository, tạo custom queries tìm chỗ trống
@Repository
public interface SlotRepository extends JpaRepository<Slot, Long> {
}

