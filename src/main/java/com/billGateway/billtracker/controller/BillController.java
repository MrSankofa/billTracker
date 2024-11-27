package com.billGateway.billtracker.controller;

import com.billGateway.billtracker.model.Bill;
import com.billGateway.billtracker.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bills")
public class BillController {

  @Autowired
  private BillRepository billRepository;

  @GetMapping
  public List<Bill> getAllBills() {
    return billRepository.findAll();
  }

  @PostMapping
  public Bill createBill(@RequestBody Bill bill) {
    return billRepository.save(bill);
  }
}

