package com.soal.step_definitions;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.soal.palindrome.pages.Palindrome;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class TestPalindrome {

    private Palindrome palindrome;
    private String input;

    @Before
    public void setUp() throws Exception {
        input = null;
        palindrome = new Palindrome();

    }

    @When("User memasukkan satu kata")
    public void user_memasukkan_satu_kata() {
        input = "apa";
    }

    @Then("Menampilkan teks palindrome atau bukan")
    public void menampilkan_teks_palindrome_atau_bukan() {
        Assert.assertTrue(palindrome.isPalindrome(input));
    }
}
