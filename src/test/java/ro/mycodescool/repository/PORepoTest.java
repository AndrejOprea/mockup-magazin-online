package ro.mycodescool.repository;

import org.junit.jupiter.api.Test;
import ro.mycodescool.model.ProductOptions;

import static org.junit.jupiter.api.Assertions.*;

class PORepoTest {

    @Test
    void insertTest(){

        PORepo poRepo = new PORepo();
        ProductOptions productOptions = new ProductOptions(2,2);
        poRepo.insertPO(productOptions);


    }

    @Test
    void deletePO(){

        PORepo poRepo = new PORepo();
        poRepo.deletePO(5);
    }

    @Test
    void updateOID(){

        PORepo poRepo = new PORepo();
     //????
    }

}