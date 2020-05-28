package com.java.practice;
/*
created by ANEK SINGH on 5/6/2020
*/

enum RoleType {


    CHANGE_MANAGEMENT("Change_Management","1"),
    CHANGE_MANAGEMENET_ADMIN("Change_Mangement_Admin","2");


    String name ;
    String value ;

    RoleType(String name,String value){
        this.name = name;
        this.value = value;
    }

    public String toString(){
        return this.name+" "+this.value;
    }

}
