package com.java.practice;
/*
created by ANEK SINGH on 5/6/2020
*/

public enum EnumTest {;

    public static void main(String[] args) {

/*
values() => you cant see ,since it is associated with the enum keyword
ordinal() => gives order of the enums

*/


        String type = RoleType.CHANGE_MANAGEMENT.toString();

        Enum type2 = RoleType.CHANGE_MANAGEMENET_ADMIN;


        System.out.println(RoleType.CHANGE_MANAGEMENET_ADMIN.ordinal()); //CHANGE_MANAGEMENT  => gives Constant
        System.out.println(type2);//CHANGE_MANAGEMENET_ADMIN  => gives Constant

        System.out.println(type2.getClass().getSuperclass());
        System.out.println(DD.values());


    }
    enum DD{
        a,b,c;
    }
}


