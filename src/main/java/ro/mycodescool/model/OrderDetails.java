package ro.mycodescool.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderDetails {

    private int id;
    private int order_id;
    private int product_id;
    private int price;
    private int quantity;


    public OrderDetails(int order_id, int product_id, int price, int quantity) {
        this.order_id = order_id;
        this.product_id = product_id;
        this.price = price;
        this.quantity = quantity;
    }
}
