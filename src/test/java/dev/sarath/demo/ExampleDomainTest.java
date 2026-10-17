package dev.sarath.demo;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExampleDomainTest {
    @Test
    void exampleDomainDisplaysExpectedTitle() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        WebDriver driver = new ChromeDriver(options);
        try {
            driver.get("https://example.com/");
            assertEquals("Example Domain", driver.getTitle());
        } finally {
            driver.quit();
        }
    }
}
