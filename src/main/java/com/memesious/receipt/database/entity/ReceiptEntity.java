package com.memesious.receipt.database.entity;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class ReceiptEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;


}
