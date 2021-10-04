package ro.mycodescool.repository;

import ro.mycodescool.model.Orders;

import java.time.LocalDate;

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

    public void updateSA(int id, String newSA){

        String updateShA = String.format("update magazin.orders set shipping_address='%s' where id=%d",newSA,id);
        executeStatement(updateShA);

    }

    public void updateOA(int id, String newOA){

        String updateOA = String.format("update magazin.orders set order_address='%s' where id=%d",newOA,id);
        executeStatement(updateOA);

    }

    public void updateMail(int id, String newMail){

        String updateMail = String.format("update magazin.orders set order_email='%s' where id=%d",newMail,id);
        executeStatement(updateMail);

    }

    public void updatedate(int id, String date){

        String []p = date.split("-");
        LocalDate localDate = LocalDate.of(Integer.parseInt(p[2]),Integer.parseInt(p[1]), Integer.parseInt(p[0]));
        String updateDate = String.format("update magazin.orders set order_date='%s' where id=%d",localDate,id);
        executeStatement(updateDate);
    }

    public void updateStatus(int id, boolean newStatus){

        String updateS = String.format("update magazin.orders set order_status = %b where id=%d",newStatus, id);
        executeStatement(updateS);

    }


}
