package homeWork29;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailPage {
    @FindBy(xpath = "//input[@type=\"email\"]")
    WebElement inputName;
    @FindBy(xpath = "//button[@type=\"submit\"]")
    WebElement checkButton;
    @FindBy(xpath = "//div[@class=\"summary\"]")
    WebElement resultUser;

    public void signIn(String inputName) throws InterruptedException {
        this.inputName.sendKeys(inputName);
        checkButton.click();
        Thread.sleep(3000);}


    public String getUserMessage(){
        return resultUser.getText();
    }


}