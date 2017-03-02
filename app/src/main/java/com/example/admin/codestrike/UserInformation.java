package com.example.admin.codestrike;

/**
 * Created by admin on 02/03/2017.
 */
public class UserInformation {

    public String name;
    public String address;
    public String uid;
    public UserInformation(){

    }


    public void setName(String name){
        this.name=name;
    }
    public void setAddress(String address){
        this.address=address;
    }
   public void setuid(String uid){
       this.uid=uid;

   }
    public String getUid(){
        return uid;

    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
}
