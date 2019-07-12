package receipt_database.dto;
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
  private Long id;
  private String storeName;
  private String storeAddress;
  private List<String>  productName;
  private List<Float> productPrice;
  private List<Float> productCount;
  private Float price;
  private  String prediction;

}
