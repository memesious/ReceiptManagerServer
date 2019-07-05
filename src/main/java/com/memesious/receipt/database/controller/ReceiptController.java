package com.memesious.receipt.database.controller;
import com.memesious.receipt.database.service.ReceiptService;
import lombok.RequiredArgsConstructor;
import com.memesious.receipt.database.entity.ReceiptEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/receipts")
@RequiredArgsConstructor
public class ReceiptController {
  private  final ReceiptService receiptService;
}
