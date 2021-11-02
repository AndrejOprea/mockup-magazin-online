package ro.mycodescool.repository;

import ro.mycodescool.model.Orders;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

    public ResultSet seeClientOrders(int id){

        String clientOrders = String.format("select customers.id client_id, customers.email client_mail ,customers.full_name client_name, orders.id order_id\n" +
                "from customers right join\n" +
                "orders on customers.id = orders.customer_id where customers.id=%d",id);

        executeStatement(clientOrders);

        try {

            return statement.getResultSet();

        }catch (Exception e){

            e.printStackTrace();

            return null;
        }

    }

    public List getList(int id){

        ResultSet set = seeClientOrders(id);

        List<String> myList = new ArrayList<>();

      try{

          while(set.next()){

             myList.add(set.getString(1));
             myList.add(set.getString(2));
             myList.add(set.getString(3));
             myList.add(set.getString(4));

          }

      }catch (Exception e){

          e.printStackTrace();
      }

        return myList;

    }

    public ResultSet seeAllOrders(){

        String all = "select * from orders";

        executeStatement(all);

        try {

            return statement.getResultSet();

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }



    }

    public List<Orders>ordersList(){

        ResultSet resultSet = seeAllOrders();
        List<Orders>list = new ArrayList<>();

        try{

            while (resultSet.next()){

                list.add(new Orders(resultSet.getInt(1),resultSet.getInt(2),
                        resultSet.getInt(3),resultSet.getString(4),
                        resultSet.getString(5),resultSet.getString(6),
                        resultSet.getDate(7).toLocalDate(),resultSet.getBoolean(8)));

            }

        }catch (Exception e){

            e.printStackTrace();
        }
        return list;

    }





}
