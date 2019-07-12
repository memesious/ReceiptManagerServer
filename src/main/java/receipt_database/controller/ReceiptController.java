package receipt_database.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import receipt_database.service.ReceiptService;

@RestController
@RequestMapping("/receipts")
@RequiredArgsConstructor
public class ReceiptController {
  private  final ReceiptService receiptService;
}
