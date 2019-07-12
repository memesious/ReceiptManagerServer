package receipt_database.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class ReceiptEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "storeName", unique = true)
  private String storeName;

  @Column(name = "storeAddress", unique = true)
  private String storeAddress;

  @Column (name = "productName", unique = true)
  private List<String> productName;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "productPrice", referencedColumnName = "productName")
  private List<Float> productPrice;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "productCount", referencedColumnName = "productName")
  private List<Integer> productCount;

  @Column(name = "price", unique = true)
  private Float price;

  @Column(name = "prediction", unique = true)
  private String prediction;



}
