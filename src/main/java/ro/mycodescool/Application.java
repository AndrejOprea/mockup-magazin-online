package ro.mycodescool;

import ro.mycodescool.controller.ControllerOD;
import ro.mycodescool.controller.ControllerOrders;
import ro.mycodescool.controller.ControllerProducts;
import ro.mycodescool.model.*;
import ro.mycodescool.repository.*;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

public class Application {

    public static void main(String[] args) {

       OptionsRepo optionsRepo = new OptionsRepo();

       for(Options o: optionsRepo.myOptions()){

           System.out.println(o);
       }


    }
}
