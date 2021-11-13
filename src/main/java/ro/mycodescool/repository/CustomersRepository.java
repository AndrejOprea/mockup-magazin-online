package ro.mycodescool.repository;

import ro.mycodescool.model.Customers;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CustomersRepository extends SQL{

    public CustomersRepository() {
        super();
    }

    public void insertCustomers(Customers c){

        String deInserat = String.format("insert into magazin.customers (email,password,full_name,billing_address,default_shipping_address,country,phone)"+
                "values('%s','%s','%s','%s','%s','%s','%s')",
                c.getEmail(),c.getPassword(),c.getFull_name(),c.getBilling_address(),
                c.getDefault_shipping_address(),c.getCountry(),c.getPhone());

        executeStatement(deInserat);


    }

    public void deleteCustomer(int id){

        String deSters = String.format("delete from magazin.customers where id=%d",id);
        executeStatement(deSters);

    }

    public void updateEmail(int id, String newMail){

        String updateMail = String.format("update magazin.customers set email='%s' where id=%d",newMail,id);
        executeStatement(updateMail);

    }

    public void updatePass(int id, String newPass){

        String updatePass = String.format("update magazin.customers set password='%s' where id=%d",newPass,id);
        executeStatement(updatePass);


    }

    public void updateName(int id, String newName){

        String updateName = String.format("update magazin.customers set full_name='%s' where id=%d",newName,id);
        executeStatement(updateName);
    }

    public void updateBillAddress(int id, String newBillAdrs){

        String updateBillAdrs = String.format("update magazin.customers set billing_address='%s' where id=%d",newBillAdrs,id);
        executeStatement(updateBillAdrs);
    }

    public void updateShipAdrs(int id, String newShipAdrs){

        String updateShipAdrs = String.format("update magazin.customers set default_shipping_address='%s' where id=%d",newShipAdrs,id);
        executeStatement(updateShipAdrs);
    }

    public void updateCountry(int id, String newCountry){

        String updateCountry = String.format("update magazin.customers set country='%s' where id=%d",newCountry,id);
        executeStatement(updateCountry);

    }

    public void updatePhone(int id, String newPhone){

        String updatePhone = String.format("update magazin.customers set phone='%s' where id=%d",newPhone,id);
        executeStatement(updatePhone);
    }

    public ResultSet allCustomers(){

        String s = "select * from magazin.customers";

        executeStatement(s);

        try {

           return statement.getResultSet();

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }


    }

    public Set<Customers> getAllCustomers (){

        ResultSet rs = allCustomers();

        Set<Customers> mySet = new TreeSet<>();

        try {

            while (rs.next()){


                mySet.add(new Customers(rs.getInt(1),rs.getString(2),
                        rs.getString(3),rs.getString(4),
                        rs.getString(5),rs.getString(6),
                        rs.getString(7),rs.getString(8)));
            }



        }catch(Exception e){
            e.printStackTrace();
        }

return mySet;
    }

}
