package ro.mycodescool.repository;

import org.junit.jupiter.api.Test;
import ro.mycodescool.model.Options;

import static org.junit.jupiter.api.Assertions.*;

class OptionsRepoTest {

    @Test

    void insertTest(){

        Options options = new Options("option4");

        OptionsRepo optionsRepo = new OptionsRepo();
        optionsRepo.insertOptions(options);

    }

    @Test

    void deleteTest(){


        OptionsRepo optionsRepo = new OptionsRepo();
        optionsRepo.deleteOptions(4);
    }

    @Test

    void updateNameTest(){

        OptionsRepo optionsRepo = new OptionsRepo();
        optionsRepo.updateOptions(5,"option78");
    }



}