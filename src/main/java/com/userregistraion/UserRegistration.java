package com.userregistraion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {


public boolean checkFirstName(String fname){
    boolean check=Pattern.matches("[a-zA-Z]+\\.?",fname);
    if (check)
        System.out.println("HAPPY");
    else
        System.out.println("SAD");
     return check;
    }
    public boolean checkLastName(String lname){
    boolean check=Pattern.matches("[a-zA-Z]+\\.?",lname);
    if (check)
        System.out.println("HAPPY");
    else
        System.out.println("SAD");
    return  check;
    }


    public boolean email(String email) {
        boolean check = Pattern.matches("[a-zA-Z0-9]+\\.[a-zA-Z0-9]+@gmail\\.com", email);
        if (check)
            System.out.println("Perfect! #Email!");
        else
            System.out.println("Please Enter a Valid Email ");

        return check;
    }


    public boolean mobileNum(String phone) {
        boolean check = Pattern.matches("^91\\s[6789][0-9]{9}", phone);
        if (check)
            System.out.println("Perfect! Mobile #Num");
        else
            System.out.println("Please Enter a Valid Mobile Number");
        return check;
    }

                       //Rule1
    public boolean passWordRule1(String pass) {
        boolean check = Pattern.matches("[a-zA-Z]{8,}", pass);
        if (check)
            System.out.println("Good ");
        else
            System.out.println("Please Enter a Valid password, it should have minimum 8 characters");
        return check;
    }


    // rule2
    public boolean passWordRule2(String str) {
        boolean check = Pattern.matches("[A-Z]{1}[a-z]{7,}", str);
        if (check)
            System.out.println("Perfect! #password");
        else
            System.out.println("Please Enter a Valid password, it should have minimum 8 characters with 1 upper case");
        return check;
    }
    // rule2  minimum 8 characters with, 1 upper case and 1 Numeric
    public boolean passWordRule3(String str) {
        boolean check = Pattern.matches("[A-Z]{1}[a-z]{6,}[0-9]{1}", str);
        if (check)
            System.out.println("Perfect! #password");
        else
            System.out.println("Please Enter a Valid password, it should have minimum 8 characters with, 1 upper case and 1 Numeric ");
        return check;
    }
    // universal mail support
    public boolean mailUniversal(String email) {
        boolean check = Pattern.matches("[a-zA-Z0-9_.]*[-]*[+]*[0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+", email);
        if (check)
            System.out.println("correct");
        else
            System.out.println("Please Enter a Valid Email with Only \"example.abc@bl.co.in\" latter");
        return check;
    }

    public static void main(String[] args) {
        System.out.println("WELCOME TO USER REGISTRATION");
        UserRegistration userRegistration=new UserRegistration();
    }

}
