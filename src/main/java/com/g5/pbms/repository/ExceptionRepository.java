package com.g5.pbms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.g5.pbms.entity.ExceptionRecord;

// TODO: Tầng giao tiếp DB cho ExceptionRecord - Queries cho Overstay, exceptions chưa xử lý
@Repository
public interface ExceptionRepository extends JpaRepository<ExceptionRecord, Long> {
}

