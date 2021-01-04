package stEPdeFinatiOn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Patient_Injection_EnrollmentTest {

	public static WebDriver driver;

	@Given("^I open xolair sites$")
	public void i_open_xolair_sites() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+ internet)\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://xolaircopay.com/");

	}

	@Given("^click enrollment button$")
	public void click_enrollment_button() throws Throwable {

		driver.findElement(By.xpath(".//*[@id='container']/div[2]/div/a[1]")).click();

	}

	@Given("^select patients$")
	public void select_patients() throws Throwable {

		driver.findElement(By.name("enroll")).click();

		driver.findElement(By.xpath(".//*[@id='agree']")).click();

	}

	@Given("^select patients not enrolled before$")
	public void select_patients_not_enrolled_before() throws Throwable {

		driver.findElement(By.id("enroll-no")).click();

	}

	@When("^I apply for injection$")
	public void i_apply_for_injection() throws Throwable {

		driver.findElement(By.xpath(".//*[@id='container']/form/p[2]/input")).click();

		driver.findElement(By.name("apply-step-one-submit")).click();

	}

	@When("^Select eligibilities question$")
	public void select_eligibilities_question() throws Throwable {

		driver.findElement(By.name("question-1")).click();

		driver.findElement(By.name("question-2")).click();

		driver.findElement(By.name("question-3")).click();

		driver.findElement(By.name("question-4")).click();

		driver.findElement(By.xpath("//input[@name='question-5'][@value='no']")).click();

		WebElement list_by_state = driver.findElement(By.name("state"));
		Select List_by_State = new Select(list_by_state);

		List_by_State.selectByValue("NJ");

		driver.findElement(By.xpath("//input[@name='question-7'][@value='no']")).click();

		driver.findElement(By.name("question-8")).click();

		driver.findElement(By.name("question-9")).click();

		driver.findElement(By.name("apply-step-one-submit")).click();

	}

	@When("^enter patients info$")
	public void enter_patients_info() throws Throwable {

		long currentTime = System.currentTimeMillis();
		driver.findElement(By.id("first_name")).clear();
		driver.findElement(By.id("first_name")).sendKeys("Evana" + currentTime);

		driver.findElement(By.id("last_name")).clear();
		driver.findElement(By.id("last_name")).sendKeys("Thomson" + currentTime);

		WebElement list_by_gender = driver.findElement(By.name("sex"));
		Select List_by_Gender = new Select(list_by_gender);

		List_by_Gender.selectByValue("F");

		driver.findElement(By.xpath(".//*[@id='container']/form/p[5]/span[1]/div/span/a/span[1]")).click();
		driver.findElement(By.xpath(".//*[@id='container']/form/p[5]/span[1]/select/option[6]")).click();

		driver.findElement(By.xpath(".//*[@id='container']/form/p[5]/span[2]/div/span/a/span[1]")).click();
		driver.findElement(By.xpath(".//*[@id='container']/form/p[5]/span[2]/select/option[17]")).click();

		driver.findElement(By.xpath(".//*[@id='container']/form/p[5]/span[3]/div/span/a/span[1]")).click();
		driver.findElement(By.xpath(".//*[@id='container']/form/p[5]/span[3]/select/option[26]")).click();

		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys("23 Clifton Ave" + currentTime);

		driver.findElement(By.id("address2")).clear();
		driver.findElement(By.id("address2")).sendKeys("Fl 5" + currentTime);

		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("Chicago" + currentTime);

		WebElement list_by_state = driver.findElement(By.name("state"));
		Select List_by_State = new Select(list_by_state);

		List_by_State.selectByValue("IL");

		driver.findElement(By.id("zipCode")).clear();
		driver.findElement(By.id("zipCode")).sendKeys("06425");

		driver.findElement(By.id("homePhone")).clear();
		driver.findElement(By.id("homePhone")).sendKeys("8642313434");

		driver.findElement(By.id("SocialSecurityNumber")).clear();
		driver.findElement(By.id("SocialSecurityNumber")).sendKeys("4444");

	}

	@When("^enter insurances info$")
	public void enter_insurances_info() throws Throwable {

		WebElement list_by_insurance = driver.findElement(By.name("insuranceCompanyName"));
		Select List_by_Insurance = new Select(list_by_insurance);

		List_by_Insurance.selectByValue("Cigna");

		WebElement list_by_plan = driver.findElement(By.name("insurancePlanType"));
		Select List_by_Plan = new Select(list_by_plan);

		List_by_Plan.selectByValue("Indemnity");

		driver.findElement(By.id("insuranceGroupNumber")).clear();
		driver.findElement(By.id("insuranceGroupNumber")).sendKeys("111111");

		driver.findElement(By.id("insuranceMemberNumber")).clear();
		driver.findElement(By.id("insuranceMemberNumber")).sendKeys("222222");

		driver.findElement(By.id("insuranceBINNumber")).clear();
		driver.findElement(By.id("insuranceBINNumber")).sendKeys("333333");

		driver.findElement(By.id("insurancePCNNumber")).clear();
		driver.findElement(By.id("insurancePCNNumber")).sendKeys("444444");

		driver.findElement(By.name("apply-step-one-submit")).click();

	}

	@Then("^I fill in the prescriber info$")
	public void i_fill_in_the_prescriber_info() throws Throwable {

		long currentTime = System.currentTimeMillis();
		driver.findElement(By.id("first_name")).clear();
		driver.findElement(By.id("first_name")).sendKeys("Ariana" + currentTime);

		driver.findElement(By.id("last_name")).clear();
		driver.findElement(By.id("last_name")).sendKeys("Miranda" + currentTime);

		driver.findElement(By.id("provider_name")).clear();
		driver.findElement(By.id("provider_name")).sendKeys("Salson" + currentTime);

		driver.findElement(By.id("address_1")).clear();
		driver.findElement(By.id("address_1")).sendKeys("11 Gattty Ave" + currentTime);

		driver.findElement(By.id("address_2")).clear();
		driver.findElement(By.id("address_2")).sendKeys("Fl 3" + currentTime);

		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys("Jackson" + currentTime);

		driver.findElement(By.id("zip")).clear();
		driver.findElement(By.id("zip")).sendKeys("56423");

		driver.findElement(By.id("phone_number")).clear();
		driver.findElement(By.id("phone_number")).sendKeys("9997773434");

		driver.findElement(By.id("physician_npi")).clear();
		driver.findElement(By.id("physician_npi")).sendKeys("1609163716");

	}

	@Then("^I fill in the site of cares information$")
	public void i_fill_in_the_site_of_cares_information() throws Throwable {

		long currentTime = System.currentTimeMillis();
		driver.findElement(By.id("doc_firstName_2")).clear();
		driver.findElement(By.id("doc_firstName_2")).sendKeys("Ariana" + currentTime);

		driver.findElement(By.id("doc_lastName_2")).clear();
		driver.findElement(By.id("doc_lastName_2")).sendKeys("Miranda" + currentTime);

		driver.findElement(By.name("doc_practiceName_2")).clear();
		driver.findElement(By.name("doc_practiceName_2")).sendKeys("Salson" + currentTime);

		driver.findElement(By.name("doc_address_2")).clear();
		driver.findElement(By.name("doc_address_2")).sendKeys("1 Attop Ave" + currentTime);

		driver.findElement(By.id("doc_address2_2")).clear();
		driver.findElement(By.id("doc_address2_2")).sendKeys("Fl 3" + currentTime);

		driver.findElement(By.id("doc_city_2")).clear();
		driver.findElement(By.id("doc_city_2")).sendKeys("Jackson" + currentTime);

		WebElement list_by_state = driver.findElement(By.name("doc_state_2"));
		Select List_by_State = new Select(list_by_state);

		List_by_State.selectByValue("NJ");

		driver.findElement(By.id("doc_zipCode_2")).clear();
		driver.findElement(By.id("doc_zipCode_2")).sendKeys("07423");

		driver.findElement(By.id("doc_phone_2")).clear();
		driver.findElement(By.id("doc_phone_2")).sendKeys("2227973434");

		driver.findElement(By.id("npi_2")).clear();
		driver.findElement(By.id("npi_2")).sendKeys("1366681405");

		driver.findElement(By.name("apply-step-two-submit")).click();

	}

	@Then("^I confirm the information$")
	public void i_confirm_the_information() throws Throwable {

		driver.findElement(By.id("allcorrect")).click();

	}

	@Then("^Click confirm button$")
	public void click_confirm_button() throws Throwable {

		driver.findElement(By.id("submit")).click();

	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {

		driver.quit();

	}

}
