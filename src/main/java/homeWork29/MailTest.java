package homeWork29;

import config.BaseClass1;
import data.GmailUsers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.ResourceBundle;

@RunWith(Parameterized.class)
public class MailTest extends BaseClass1 {
    public static GmailPage gmailPage;
    public static ResourceBundle bundle;
    @Parameterized.Parameters
    public static Collection options() {return Arrays.asList(GmailUsers.values());
    }


    public MailTest(GmailUsers gmailUsers) throws InterruptedException {
        driver.get("https://email-checker.net/validate");
     bundle = ResourceBundle.getBundle(gmailUsers.getType());
        gmailPage = PageFactory.initElements(driver, GmailPage.class);
    }

//Result : BAD  Result : OK
    @Test
    public void checkUserIsValidOrNot() throws InterruptedException {
        gmailPage.signIn(bundle.getString("name"));
        System.out.println("-------------------");
        System.out.println(gmailPage.getUserMessage());
        System.out.println("-------------------");
        if(Objects.equals(gmailPage.getUserMessage(), "Result : OK")){
            System.out.println("User is valid");
        }else System.out.println("User is invalid");}}
