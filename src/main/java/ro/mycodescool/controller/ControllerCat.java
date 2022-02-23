package ro.mycodescool.controller;

import ro.mycodescool.model.Categories;
import ro.mycodescool.repository.CatRepo;

public class ControllerCat {

    CatRepo catRepo;

    public ControllerCat(){

        catRepo = new CatRepo();
    }

    public void addCat(Categories c){

        catRepo.inserCat(c);

    }

    public void deleteCat(int id){

        catRepo.deleteCat(id);
    }

    public void getAllCat(){

        catRepo.myCat();
    }

    public void updateCatname(int id,String newName){

        catRepo.updateName(id,newName);

    }

    public void updateCatDesc(int id, String newDesc){

        catRepo.updateDesc(id,newDesc);

    }

}
