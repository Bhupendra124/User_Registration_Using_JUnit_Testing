package com.userregistration;

import com.userregistraion.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration user=new UserRegistration();

    @Test
    public void firstName() {
        String fName="Bhupendra";
        boolean check=user.checkFirstName(fName);
        Assert.assertTrue(check);

    }
    @Test
    public void lastName(){
        String lName="Wadekar";
        boolean check=user.checkLastName(lName);
        Assert.assertTrue(check);
    }
    @Test
    public void email(){
        String email="wadekar.bhupendra6@gmail.com";
        boolean check=user.email(email);
        Assert.assertTrue(check);
    }
    @Test
    public void PhoneNum(){
        String phone="9893902047";
        boolean check=user.mobileNum(phone);
        Assert.assertTrue(check);
    }
@Test
    public void rule1Pass(){
        String rule1check="bhupendra";
        boolean check=user.passWordRule1(rule1check);
        Assert.assertTrue(check);
}
@Test
    public  void rule2Pass(){
        String rule2check="Bhupendra";
        boolean check=user.passWordRule2(rule2check);
        Assert.assertTrue(check);
}
@Test
    public void rule3Pass(){
        String rule3check="bhupendra1";
        boolean check=user.passWordRule3(rule3check);
        Assert.assertTrue(check);
}
@Test
    public void  universalPass(){
        String Universal="Bhupendrawa425";
        boolean check=user.mailUniversal(Universal);
        Assert.assertTrue(check);
}
}
