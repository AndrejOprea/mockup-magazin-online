package ro.mycodescool.repository;

import ro.mycodescool.model.Orders;

public class OrdersRepository extends SQL {


    public OrdersRepository() {
        super();
    }


    public void insertOrders(Orders o){

        String deInserat="";

        deInserat+=String.format("insert into magazin.orders (customer_id,amount,shipping_address,order_address,order_email,order_date,order_status) " +
                "values(%d,%d,'%s','%s','%s','%s', %s)",
                o.getCustomer_id(),o.getAmount(),o.getShipping_address(),o.getOrder_address(),
                o.getOrder_mail(),o.getOrder_date(),o.isOrder_status());



        executeStatement(deInserat);


    }

    public void deleteOrders(int id){

        String deSters = String.format("delete from magazin.orders where id=%d",id);


        executeStatement(deSters);


    }

    public void updateAmount(int id,int newAmount){


        String updateA = String.format("update magazin.orders set amount=%d where id=%d", newAmount,id);
        executeStatement(updateA);
    }
}
