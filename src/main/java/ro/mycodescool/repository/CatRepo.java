package ro.mycodescool.repository;

import ro.mycodescool.model.Categories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CatRepo extends SQL{

    public CatRepo(){

        super();
    }

    public void inserCat(Categories c){

        String deInserat = String.format("insert into magazin.categories(name,description) values" +
                "('%s','%s')",c.getName(),c.getDescription());

        executeStatement(deInserat);


    }

    public void deleteCat(int id){

        String deSters = String.format("delete from magazin.categories where id=%d",id);

        executeStatement(deSters);

    }

    public void updateName(int id, String newName){

        String updateNume = String.format("update magazin.categories set name='%s' where id=%d",newName,id);
        executeStatement(updateNume);

    }

    public void updateDesc(int id, String newDesc){

        String updateDescrip = String.format("update magazin.categories set description='%s' where id=%d",newDesc,id);
        executeStatement(updateDescrip);

    }

    public ResultSet getAllCategories(){

        String getCat = "select * from magazin.categories";

        executeStatement(getCat);

        try {

            return statement.getResultSet();
        }catch (SQLException e){

            e.printStackTrace();
            return null;
        }



    }

    public List<Categories> myCat(){


        ResultSet myResSet = getAllCategories();

        List<Categories> myList = new ArrayList<>();

        try {
            while (myResSet.next()){

                myList.add(new Categories(myResSet.getInt(1),myResSet.getString(2),
                        myResSet.getString(3)));

            }
        }catch (Exception e){

            e.printStackTrace();
        }

        return myList;



    }



}
