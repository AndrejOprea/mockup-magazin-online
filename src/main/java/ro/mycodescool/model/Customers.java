package ro.mycodescool.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customers {

    private int id;
    private String email;
    private String password;
    private String full_name;
    private String billing_address;
    private String default_shipping_address;
    private String country;
    private String phone;

    public Customers(String email, String password, String full_name, String billing_address, String default_shipping_address, String country, String phone) {
        this.email = email;
        this.password = password;
        this.full_name = full_name;
        this.billing_address = billing_address;
        this.default_shipping_address = default_shipping_address;
        this.country = country;
        this.phone = phone;
    }
}
