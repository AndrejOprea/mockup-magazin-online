package ro.mycodescool.repository;

import ro.mycodescool.model.Options;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OptionsRepo extends SQL{


    public void insertOptions(Options o){

        String deInserat = String.format("insert into magazin.options(option_name) values" +
                "('%s')",o.getOption_name());


        executeStatement(deInserat);



    }

    public void deleteOptions(int id){

        String toDelete = String.format("delete from magazin.options where id=%d",id);

        executeStatement(toDelete);
    }

    public void updateOptions(int id, String newName){

        String toUpdateName = String.format("update magazin.options set option_name='%s' where id=%d", newName,id);

        executeStatement(toUpdateName);


    }

    public ResultSet getAllMyOptions(){

        String getAllO = "select * from magazin.options";

        executeStatement(getAllO);

        try{

            return statement.getResultSet();

        }catch (SQLException e){

            e.printStackTrace();
            return null;
        }

    }

    public List<Options> myOptions(){

        ResultSet resultSet = getAllMyOptions();

        List<Options>myList = new ArrayList<>();

        try{

            while(resultSet.next()){

                myList.add(new Options(resultSet.getInt(1), resultSet.getString(2)));

            }

        }catch (Exception e){

            e.printStackTrace();
        }

        return myList;
    }



}
