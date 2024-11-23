package com.billGateway.billtracker.repository;

import com.billGateway.billtracker.model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, Long> {
}

