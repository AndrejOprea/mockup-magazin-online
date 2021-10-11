package ro.mycodescool.repository;

import org.junit.jupiter.api.Test;
import ro.mycodescool.model.Categories;

import static org.junit.jupiter.api.Assertions.*;

class CatRepoTest {

    @Test
    void test_insert(){


        CatRepo catRepo = new CatRepo();

        Categories categories = new Categories("testCat", "descriptionCat");

        catRepo.inserCat(categories);
    }

    @Test
    void test_stergere(){

        CatRepo catRepo = new CatRepo();

        catRepo.deleteCat(3);

    }

    @Test
    void test_updateNume(){


        CatRepo catRepo = new CatRepo();

        catRepo.updateName(4,"newname");
    }

    @Test
    void test_updateDesc(){

        CatRepo catRepo = new CatRepo();
        catRepo.updateDesc(4, "newdesc");
    }

}