package ro.mycodescool.repository;

import ro.mycodescool.model.Categories;

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



}
