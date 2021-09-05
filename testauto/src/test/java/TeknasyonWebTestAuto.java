import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.Rule;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.swing.AccumulativeRunnable;
import org.junit.Assert;
import static org.hamcrest.CoreMatchers.*;
import java.io.File;
import java.io.FileReader;
import org.apache.commons.io.FileUtils;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.io.IOException;

public class TeknasyonWebTestAuto {
	
	static WebDriver driver;
	static String baseUrl = "https://www.google.com.tr/";
	static String expectedTitle = "Google";
	static String actualTitle = "";
	
	
    @BeforeClass
    public static void setUp() throws Exception {

        System.setProperty("webdriver.edge.driver","C:\\SeleniumDrivers\\MicrosoftWebDriver.exe");
        driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    
    }

    @Test
    public void test1() throws Exception {
    	
        driver.get(baseUrl);

        actualTitle = driver.getTitle();
        
        Assert.assertThat("Title did NOT match!", actualTitle, is(containsString(expectedTitle)));

        
        WebElement GoogleTextBox = new WebDriverWait(driver, 15)
				 .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[1]//div[3]//form//div[1]//div[1]//div[1]//div//div[2]//input")));
        
        GoogleTextBox.sendKeys("Teknasyon");
        
        
        WebElement GoogleAraButton = new WebDriverWait(driver, 15)
				 .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[1]//div[3]//form//div[1]//div[1]//div[3]//center//input[1]")));
        
        GoogleAraButton.click();
        
        
        WebElement Teknasyon = new WebDriverWait(driver, 15)
				 .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='rso']//div[1]//div//div//div//div//div//div//div[1]//a//h3")));
        
        System.out.println(Teknasyon.getText());
        
        Assert.assertThat("Text did NOT match!", Teknasyon.getText(), is(containsString("Teknasyon")));
      
        Teknasyon.click();
        
        
        actualTitle = driver.getTitle();
        
        Assert.assertThat("Title did NOT match!", actualTitle, is(containsString("Teknasyon")));
        
        
        WebElement KariyerButton = new WebDriverWait(driver, 15)
				 .until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@id='menu-item-128']//a")));
        
        System.out.println(KariyerButton.getText());
        
        Assert.assertThat("Text did NOT match!", KariyerButton.getText(), is(containsString("Kariyer")));
        
        KariyerButton.click();
        
        
        WebElement Aciklama = new WebDriverWait(driver, 15)
				 .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='content']//section[1]//div//div//div//div[1]//div[2]//p")));
        
        System.out.println(Aciklama.getText());
        
        Assert.assertThat("Text did NOT match!", Aciklama.getText(), is(containsString("Kodluyoruz ve dünyaya sunuyoruz! Bizimle birlikte bu dünyayý keþfetmek istersen baþvurunu bekliyoruz. Hemen tanýþalým ve sana Teknasyon’un ayrýcalýklarýndan bahsedelim.")));
             
        
        WebElement TestOtomasyonMuhendisi = new WebDriverWait(driver, 15)
				 .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='content']//section[2]//div//div[2]//div[4]//div[2]//a[2]")));
        
        System.out.println(TestOtomasyonMuhendisi.getText());
        
        Assert.assertThat("Text did NOT match!", TestOtomasyonMuhendisi.getText(), is(containsString("Test Otomasyon Mühendisi")));
        
        
        TestOtomasyonMuhendisi.click();
        
        actualTitle = driver.getTitle();
        
        Assert.assertThat("Title did NOT match!", actualTitle, is(containsString("Test Otomasyon Mühendisi - Teknasyon")));
        
        
        WebElement BasvurButton1 = new WebDriverWait(driver, 15)
				 .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='content']//section[2]//div//div//div[2]//a")));
        
        BasvurButton1.click();
      
        
        WebElement BasvurButton2Dogrula = new WebDriverWait(driver, 15)
				 .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='content']//section[2]//div//div[2]//form//div[9]//button//span")));
        
        System.out.println(BasvurButton2Dogrula.getText());
        
        Assert.assertThat("Text did NOT match!", BasvurButton2Dogrula.getText(), is(containsString("Baþvur")));
        
        BasvurButton2Dogrula.click();
        
        
        WebElement AdSoyadHata = new WebDriverWait(driver, 15)
				 .until(ExpectedConditions.elementToBeClickable(By.id("jobNameSurname-error")));
        
        System.out.println(AdSoyadHata.getText());
        
        Assert.assertThat("Text did NOT match!", AdSoyadHata.getText(), is(containsString("Bu alanýn doldurulmasý zorunludur.")));
        
        
        WebElement EPostaHata = new WebDriverWait(driver, 15)
				 .until(ExpectedConditions.elementToBeClickable(By.id("jobEmail-error")));
        
        System.out.println(EPostaHata.getText());
        
        Assert.assertThat("Text did NOT match!", EPostaHata.getText(), is(containsString("Bu alanýn doldurulmasý zorunludur.")));
        
        
        WebElement EkHata = new WebDriverWait(driver, 15)
				 .until(ExpectedConditions.elementToBeClickable(By.id("jobFile-error")));
        
        System.out.println(EkHata.getText());
        
        Assert.assertThat("Text did NOT match!", EkHata.getText(), is(containsString("Bu alanýn doldurulmasý zorunludur.")));
        
        
        WebElement AydinlatmaMetniHata = new WebDriverWait(driver, 15)
				 .until(ExpectedConditions.elementToBeClickable(By.id("jobLet-error")));
        
        System.out.println(AydinlatmaMetniHata.getText());
        
        Assert.assertThat("Text did NOT match!", AydinlatmaMetniHata.getText(), is(containsString("CV'nizi bizimle paylaþmadan önce, Aydýnlatma Metni’ni okuyup, kutucuðu iþaretlemeniz gerekmektedir.")));
        
        
        WebElement recaptchaHata = new WebDriverWait(driver, 15)
				 .until(ExpectedConditions.elementToBeClickable(By.id("recaptchaControl-error")));
        
        System.out.println(recaptchaHata.getText());
        
        Assert.assertThat("Text did NOT match!", recaptchaHata.getText(), is(containsString("Lütfen recaptcha doðrulamasýný yapýnýz.")));
        
        
        WebElement CVEkleButton = new WebDriverWait(driver, 15)
				 .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='content']//section[2]//div/div[2]//form//div[4]//div//label[2]//span")));
        
        System.out.println(CVEkleButton.getText());
        
        Assert.assertThat("Text did NOT match!", CVEkleButton.getText(), is(containsString("CV Yükle")));
        
        
        WebElement AdSoyadTextBox = new WebDriverWait(driver, 15)
				 .until(ExpectedConditions.elementToBeClickable(By.id("jobNameSurname")));
        
        AdSoyadTextBox.sendKeys("Test Otomasyon");
        
        
        WebElement EPostaTextBox = new WebDriverWait(driver, 15)
				 .until(ExpectedConditions.elementToBeClickable(By.id("jobEmail")));
        
        EPostaTextBox.sendKeys("testautodeneme@gmail.com");
        
        
        CVEkleButton.click();
      
        
        new WebDriverWait(driver, 15)
		 .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//div[@id='content']//section[2]//div//div[2]//form//div[8]//label//div//div//div//iframe")));
		
        WebElement RecapthaDogrulama = new WebDriverWait(driver, 15)
				 .until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@id='recaptcha-anchor-label']//span")));
        
        System.out.println(RecapthaDogrulama.getText());
        
        Assert.assertThat("Text did NOT match!", RecapthaDogrulama.getText(), is(containsString("Ben robot deðilim")));
        
        
        WebElement Recaptha = new WebDriverWait(driver, 15)
				 .until(ExpectedConditions.elementToBeClickable(By.id("rc-anchor-container")));
        
        Recaptha.click();
        
        driver.switchTo().defaultContent();
        
        
        WebElement AydinlatmaMetniCheckbox = new WebDriverWait(driver, 15)
				 .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='content']//section[2]//div//div[2]//form//div[5]//label[2]//span//span[1]")));
        
        AydinlatmaMetniCheckbox.click();
        
        System.out.println(AydinlatmaMetniHata.getText());
        
        Assert.assertThat("Text did NOT match!", AydinlatmaMetniHata.getText(), is(containsString("CV'nizi bizimle paylaþmadan önce, Aydýnlatma Metni’ni okuyup, kutucuðu iþaretlemeniz gerekmektedir.")));
        
        
        WebElement FarkliPozisyonlarCheckbox = new WebDriverWait(driver, 15)
				 .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='content']//section[2]//div//div[2]//form//div[6]//label//span//span[1]")));
        
        FarkliPozisyonlarCheckbox.click();
       
        
        WebElement IsFirsatiCheckbox = new WebDriverWait(driver, 15)
				 .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='content']//section[2]//div//div[2]//form//div[7]//label//span//span[1]")));
        
        IsFirsatiCheckbox.click();
        
        
        WebElement BasvurButton2 = new WebDriverWait(driver, 15)
				 .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='content']//section[2]//div//div[2]//form//div[9]//button")));
        
        BasvurButton2.click();
       
      
        WebElement basarili = new WebDriverWait(driver, 15)
				 .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='content']//section//div//div//p")));
        
        System.out.println(basarili.getText());
        
        Assert.assertThat("Text did NOT match!", basarili.getText(), is(containsString("Baþvurunuz baþarýlý bir þekilde alýnmýþtýr. Ýlgili ekiplerimiz baþvurunuzu deðerlendirip en yakýn zamanda dönüþ saðlayacaktýr.")));  
       
    }
    
    @AfterClass
    public static void tearDown() throws Exception {
    	
        driver.close();
    	
    }

	@Rule
	public ScreenShotOnFailure failure = new ScreenShotOnFailure(driver);
	
}
