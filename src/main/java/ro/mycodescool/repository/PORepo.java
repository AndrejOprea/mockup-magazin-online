package ro.mycodescool.repository;

import ro.mycodescool.model.ProductOptions;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PORepo extends SQL{


    public void insertPO(ProductOptions po){

        String deInserat = String.format("insert into magazin.product_options (option_id,product_id) values" +
                "(%d,%d)",po.getOption_id(),po.getProduct_id());

        executeStatement(deInserat);

    }

    public void deletePO(int id){

        String deSters = String.format("delete from magazin.product_options where id=%d",id);

        executeStatement(deSters);
    }

    public void updateIDs(int id,int oid, int pid){

        String updateOID = String.format("update magazin.product_options set option_id=%d where id=%",oid,id);

        executeStatement(updateOID);
    }


    public void updatePID(int id,int pid){

        String updateOID = String.format("update magazin.product_options set product_id=%d where id=%",pid,id);

        executeStatement(updateOID);
    }

    public ResultSet retrieveData(){

        String retreive = "select * from magazin.product_options";

        executeStatement(retreive);

        try{

            return statement.getResultSet();

        }catch(SQLException e){
            e.printStackTrace();

            return null;
        }



    }

    public List<ProductOptions> getPO(){

        ResultSet rs = retrieveData();
        List<ProductOptions>mylist = new ArrayList<>();


        try{

            while (rs.next()){


                mylist.add(new ProductOptions(rs.getInt(1), rs.getInt(2), rs.getInt(3) ));


            }


        }catch(Exception e){

            e.printStackTrace();
        }

        return mylist;


    }


}
