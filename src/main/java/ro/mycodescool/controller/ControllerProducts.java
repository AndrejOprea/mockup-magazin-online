package ro.mycodescool.controller;

import ro.mycodescool.model.ComparatorStoc;
import ro.mycodescool.model.Products;
import ro.mycodescool.repository.ProductsRepository;
import ro.mycodescool.repository.SQL;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ControllerProducts  {


    ProductsRepository productsRepository;

    public ControllerProducts(){

        productsRepository = new ProductsRepository();
        productsRepository.allProducts();

    }

    public void addProduct(Products p){

       productsRepository.insertProducts(p);

    }

    public void deleteProducts(int id){

        productsRepository.deleteProduct(id);

    }

    public void updatePName(int id, String s){

        productsRepository.updateName(2,s);

    }

    //functionalitati

    public boolean productExist(String name){

        Collections.sort(productsRepository.allProducts());

        int x = Collections.binarySearch(
                productsRepository.allProducts(),
                new Products(name,1,1,"","", LocalDate.now(),1));

        return x>0;

    }

    public void seeZeroStock(){

        List<Products>myList = productsRepository.allProducts();

        Collections.sort(myList,new ComparatorStoc());

        for(int i=0; i< myList.size();i++){

            if(myList.get(i).getStock()==0){
                System.out.println(myList.get(i));

            }


        }

       // int x = Collections.binarySearch(myList,new Products("p1",100,150,"d1","c1",LocalDate.now(),0));

      //  return x;


    }











}
