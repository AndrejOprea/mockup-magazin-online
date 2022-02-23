package ro.mycodescool.model;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Setter
@Getter
public class ProductOptions {

    private int id;
    private int option_id;
    private int product_id;

    public ProductOptions(int option_id, int product_id) {
        this.option_id = option_id;
        this.product_id = product_id;
    }
}
