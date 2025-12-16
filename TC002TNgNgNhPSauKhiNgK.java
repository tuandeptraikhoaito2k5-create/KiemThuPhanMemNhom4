package com.example.DangKy;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class TC002TNgNgNhPSauKhiNgK {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private JavascriptExecutor js;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void testTC002TNgNgNhPSauKhiNgK() throws Exception {
    driver.get("http://hauiproj.somee.com/Dangky.aspx");
    driver.findElement(By.id("LinkDK")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txtTaiKhoan")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txtTaiKhoan")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txtTaiKhoan")).sendKeys("thinh1231w");
    driver.findElement(By.id("ContentPlaceHolder1_txtMatKhau")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txtMatKhau")).sendKeys("iawh");
    driver.findElement(By.id("ContentPlaceHolder1_txtHoTen")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txtHoTen")).sendKeys("thinh");
    driver.findElement(By.id("ContentPlaceHolder1_txtNamSinh")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txtNamSinh")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txtNamSinh")).sendKeys("2025-12-05");
    driver.findElement(By.id("ContentPlaceHolder1_txtEmail")).click();
    driver.findElement(By.id("ContentPlaceHolder1_txtEmail")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txtEmail")).sendKeys("tungthinh23@gmail.com");
    driver.findElement(By.id("ContentPlaceHolder1_txtSdt")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txtSdt")).sendKeys("09123716");
    driver.findElement(By.id("ContentPlaceHolder1_txtDiaChi")).clear();
    driver.findElement(By.id("ContentPlaceHolder1_txtDiaChi")).sendKeys("hai duong");
    driver.findElement(By.id("ContentPlaceHolder1_btDangky")).click();
    driver.get("http://hauiproj.somee.com/Default.aspx");
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
