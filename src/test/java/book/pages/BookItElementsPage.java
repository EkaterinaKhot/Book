package book.pages;


import book.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.XMLFormatter;

public class BookItElementsPage {
    public BookItElementsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "/html/body/app-root/div/app-map-page/app-hero/section/div/nav/div[2]/div/div[1]/a")
    public static WebElement scheduleBtn;

    @FindBy(xpath = "/html/body/app-root/div/app-my-schedule-page/app-hero/section/div/nav/div[2]/div/div[1]/div/a[1]")
    public static WebElement myScheduleBtn;

    @FindBy(xpath = "/html/body/app-root/div/app-my-cluster-schedule-page/app-hero/section/div/nav/div[2]/div/div[1]/div/a[2]")
    public static WebElement generalScheduleBtn;


}