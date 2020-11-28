package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

public class CalcPage {

    @FindBy(xpath = "//div[@jsname='j93WEe']")
    public WebElement buttonOpenBracket;
    @FindBy(xpath = "//div[@jsname='N10B9']")
    public WebElement buttonOne;
    @FindBy(xpath = "//div[@jsname='XSr6wc']")
    public WebElement buttonPlus;
    @FindBy(xpath = "//div[@jsname='lVjWed']")
    public WebElement buttonTwo;
    @FindBy(xpath = "//div[@jsname='qCp9A']")
    public WebElement buttonCloseBracket;

    @FindBy(xpath = "//div[@jsname='YovRWb']")
    public WebElement buttonMultiply;

    @FindBy(xpath = "//div[@jsname='KN1kY']")
    public WebElement buttonThree;

    @FindBy(xpath = "//div[@jsname='pPHzQc']")
    public WebElement buttonMinus;

    @FindBy(xpath = "//div[@jsname='xAP7E']")
    public WebElement buttonFour;

    @FindBy(xpath = "//div[@jsname='bkEvMb']")
    public WebElement buttonZero;

    @FindBy(xpath = "//div[@jsname='WxTTNd']")
    public WebElement buttonSplit;

    @FindBy(xpath = "//div[@jsname='Ax5wH']")
    public WebElement buttonFive;

    @FindBy(xpath = "//div[@jsname='Pt8tGc']")
    public WebElement buttonEqually;

    @FindBy(xpath = "//div[@jsname='abcgof']")
    public WebElement buttonSix;

    @FindBy(xpath = "//span[@jsname='ubtiRe']")
    public WebElement formula;

    @FindBy(id = "cwos")
    public WebElement response;

    @FindBy(xpath = "//div[@jsname='aN1RFf']")
    public WebElement buttonSin;


    public CalcPage(WebDriver webDriver) {
        initElements(webDriver, this);
    }

}
