package com.userregistration;

import com.userregistraion.UserRegistration;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)


    public class EmailTest {
        UserRegistration user=new UserRegistration();
   private String emailTest;
   private boolean expected;

        public EmailTest(String emailTest, boolean expected) {
            this.emailTest=emailTest;
            this.expected=expected;
        }

    @Parameterized.Parameters
    public static Collection<Object> input() {

        return Arrays.asList(new Object[][]{{"abc@yahoo.com", true},
                {"abc-10@yahoo.com", true},
                {"abc.1010@yahoo.com", true},
                {"abc222@abc.com", true},
                {"abc.100@abc.com", true},
                {"abc@1.com", true},
                {"abc123@gamil.a", true},
                {"abc123@yahoo.com", true},
                {"abc@gmail.com", true},
                {"abc404@gamil.com", true},
                {"abc-100@abc.net", true}});
        }

    @Test
    public void emailTest() {
        boolean check=user.mailUniversal(emailTest);
        Assert.assertEquals(expected,check);
    }
}


