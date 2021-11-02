package ro.mycodescool.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Orders {

    private int id;
    private int customer_id;
    private int amount;
    private String shipping_address;
    private String order_address;
    private String order_mail;
    private LocalDate order_date;
    private boolean order_status;


    public Orders(int customer_id, int amount, String shipping_address, String order_address, String order_mail, LocalDate order_date, boolean order_status) {
        this.customer_id = customer_id;
        this.amount = amount;
        this.shipping_address = shipping_address;
        this.order_address = order_address;
        this.order_mail = order_mail;
        this.order_date = order_date;
        this.order_status = order_status;
    }

    public Orders(int customer_id, int amount, String shipping_address, String order_address, String order_mail, LocalDate order_date) {
        this.customer_id = customer_id;
        this.amount = amount;
        this.shipping_address = shipping_address;
        this.order_address = order_address;
        this.order_mail = order_mail;
        this.order_date = order_date;

    }





}






