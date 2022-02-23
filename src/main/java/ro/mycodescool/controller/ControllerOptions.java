package ro.mycodescool.controller;

import ro.mycodescool.model.Options;
import ro.mycodescool.repository.OptionsRepo;

public class ControllerOptions {

    OptionsRepo optionsRepo;

    public ControllerOptions(){

        optionsRepo = new OptionsRepo();
    }

    public void addOption(Options o){

        optionsRepo.insertOptions(o);

    }

    public void deleteOptions(int id){

        optionsRepo.deleteOptions(id);
    }

    public void getAllOptions(){

        optionsRepo.myOptions();
    }

    public void updateOptionName(int id, String newName){

        optionsRepo.updateOptions(id, newName);

    }


}
