package org.esmo.google.datastudio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class GoogleDataStudio {

    private static WebDriver driver;
    private static final String URL = "https://datastudio.google.com/reporting/f1837c75-6dd4-4355-9966-ca1785d14302/page/4OrWB";

    static {
        System.setProperty("webdriver.chrome.driver", "./target/classes/chromedriver.exe");
        System.setProperty("webdriver.edge.driver", "./target/classes/msedgedriver.exe");
    }


    public static void main(String[] args) {
        driver = new EdgeDriver();
        driver.get(URL);
        List<WebElement> elements = driver.findElements(By.className("b157502361"));
        if(elements != null && elements.get(1) != null){
            elements.get(1).click();
        }
    }

}
