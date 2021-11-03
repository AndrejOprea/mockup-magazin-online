package ro.mycodescool.repository;

import ro.mycodescool.model.OrderDetails;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OdRepo extends SQL{

    public OdRepo(){
        super();
    }

    public void insert_od(OrderDetails od){

        String insert = String.format("insert into magazin.order_details (order_id,product_id,price,quantity)" +
                "values(%d,%d,%d,%d)",od.getOrder_id(),od.getProduct_id(),od.getPrice(),od.getQuantity());

        executeStatement(insert);

    }

    public void delete_od(int id){

        String deSters = String.format("delete from magazin.order_details where order_details.id=%d",id);

        executeStatement(deSters);

    }

    public void update_OrderId(int id, int newOID){

        String updateOID = String.format("update magazin.order_details set order_id=%d " +
                "where order_details.id=%d",newOID,id);

        executeStatement(updateOID);
    }

    public void updatePID(int id, int newPID){

        String updatePID = String.format("update magazin.order_details set product_id=%d " +
                "where order_details.id=%d",newPID,id);

        executeStatement(updatePID);

    }


    public void updatePrice(int id, int newPrice){

        String updatePrice = String.format("update magazin.order_details set price=%d " +
                "where order_details.id=%d",newPrice,id);

        executeStatement(updatePrice);

    }

    public void updateQty(int id, int newQty){

        String updateQty = String.format("update magazin.order_details set quantity=%d " +
                "where order_details.id=%d",newQty,id);

        executeStatement(updateQty);

    }









    public ResultSet seeClientPayments(int id){

        String state =String.format("select customers.full_name client_name,po.price\n" +
                "from customers inner join\n" +
                "    (select orders.id ,orders.customer_id,od.price from orders inner join order_details od on orders.id = od.order_id) po\n" +
                "on customers.id = po.customer_id where customer_id=%d",id);

        executeStatement(state);

        try {
           return statement.getResultSet();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    public List<String> getListpayments(int id){

        List<String> myList= new ArrayList<>();
        ResultSet resultSet = seeClientPayments(id);

       try{

           while (resultSet.next()){

               myList.add(resultSet.getString(1));
               myList.add(resultSet.getString(2));
           }

       }catch(Exception e){

           e.printStackTrace();
       }

       return myList;

    }

    public ResultSet allOrderDetails(){

        String allOD = "select * from magazin.order_details";

        executeStatement(allOD);

        try{

           return statement.getResultSet();

        }catch(Exception e){

            e.printStackTrace();
            return null;
        }
    }


    public List<OrderDetails> getAllOd(){

        ResultSet rs = allOrderDetails();

        List<OrderDetails> list = new ArrayList<>();

        try {

            while (rs.next()){

                list.add(new OrderDetails(rs.getInt(1),
                        rs.getInt(2),rs.getInt(3),
                        rs.getInt(4),rs.getInt(5)));

            }

        }catch (Exception e){
            e.printStackTrace();
        }


        return list;
    }



}
