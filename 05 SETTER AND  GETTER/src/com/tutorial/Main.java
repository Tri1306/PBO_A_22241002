package com.tutorial;

class User{
    private String username;
    private String password;

    // membuat konstruktor
    User(String username, String password){
        this.username = username;
        this.password = password;
    }

    // method getter
    public String getusername() {
        return this.username;
    }

    public String getpassword() {
        return this.password;
    }

    public void setpassword(String password){
        this.password = password;
    }

    }



public class Main{
    public static void main(String[] args) {
        // instransiasi objek
        User person_1 = new User("zoro", "11111111");

        // panggil method getter
        System.out.println(person_1.getusername());
        System.out.println(person_1.getpassword());
     
        person_1.setpassword("12345678");
        System.out.println("new password" +person_1.getpassword());
    }
}

    

    