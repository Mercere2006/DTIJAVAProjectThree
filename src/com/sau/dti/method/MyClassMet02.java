package com.sau.dti.method;

public class MyClassMet02 {
    //ประเภทของ method

    //1. ไม่มี parameter ไม่มี return
    public static void showWow(){
        System.out.println("Wow wow wow");
    }

    //2. มี parameter ไม่มี return
    public static void sunNumber(int num1, int num2){
        System.out.println(num1 + num2);
    }

    //3. ไม่มี parameter แต่มี return /มี return เมื่อไหร่ ไม่ใช้ void แต่เป็น String , Double etc.
    public static String showSawasdee(){
        return "Sawasdee jaaaaaaaaaa..";
    }

    //4. มี parameter มี return
    public static double calPowNumber(int a, int b){
        return Math.pow(a,b);
    }

    public static void main(String[] args) {
    showWow();
    showWow();
    sunNumber(50, 40); //ค่าที่ส่งให้ parameter เรียกว่า argument
    sunNumber(100, 500);

    //----------------------------------
        System.out.println(showSawasdee());
        String data = showSawasdee();
        System.out.println(data + "Oil");

        System.out.println(calPowNumber(5, 2));
        double result = calPowNumber(10, 3);
        System.out.println("10^3 = " + result);
    }
}
