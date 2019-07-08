package com.memesious.receipt.database.dto;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReceiptDto {
  private long id;
  private String storeName;
  private String storeAdress;
  private List<String>  productName;
  private List<Float> productPrice;
  private List<Float> productCount;
  private float price;
  private  String prediction;

}
