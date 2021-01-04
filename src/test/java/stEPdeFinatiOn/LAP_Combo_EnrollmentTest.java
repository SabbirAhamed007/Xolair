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

public class LAP_Combo_EnrollmentTest {

	public static WebDriver driver;

	@Given("^I open xolair sites for LAP combu$")
	public void i_open_xolair_sites_for_LAP_combu() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+ internet)\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://xolaircopay.com/");

	}

	@Given("^clicks on enrollment button for combo$")
	public void clicks_on_enrollment_button_for_combo() throws Throwable {

		driver.findElement(By.xpath(".//*[@id='container']/div[2]/div/a[1]")).click();

	}

	@Given("^select the LAP as a enroller$")
	public void select_the_LAP_as_a_enroller() throws Throwable {

		driver.findElement(By.xpath("//input[@name='enroll'][@value='lap']")).click();
		driver.findElement(By.id("agree")).click();

	}

	@Given("^select LAP not enrolled a patient before$")
	public void select_LAP_not_enrolled_a_patient_before() throws Throwable {

		driver.findElement(By.id("enroll-no")).click();

	}

	@When("^LAP apply for combo$")
	public void lap_apply_for_combo() throws Throwable {

		driver.findElement(By.xpath(".//*[@id='container']/form/p[3]/input")).click();

		driver.findElement(By.name("apply-step-one-submit")).click();

	}

	@When("^Select eligibility questions for combo$")
	public void select_eligibility_questions_for_combo() throws Throwable {

		driver.findElement(By.name("question-1")).click();

		driver.findElement(By.name("question-2")).click();

		driver.findElement(By.name("question-3")).click();

		driver.findElement(By.name("question-4")).click();

		driver.findElement(By.xpath("//input[@name='question-5'][@value='no']")).click();

		WebElement list_by_state = driver.findElement(By.name("state"));
		Select List_by_State = new Select(list_by_state);

		List_by_State.selectByValue("NJ");

		driver.findElement(By.xpath("//input[@name='question-7'][@value='no']")).click();

		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[8]/td[2]/p[3]/input")).click();

		driver.findElement(By.name("question-9")).click();

		driver.findElement(By.name("question-10")).click();

		driver.findElement(By.name("question-11")).click();

		driver.findElement(By.name("apply-step-one-submit")).click();

	}

	@When("^enter patient info for combo$")
	public void enter_patient_info_for_combo() throws Throwable {

		long currentTime = System.currentTimeMillis();
		driver.findElement(By.id("guardian_first_name")).clear();
		driver.findElement(By.id("guardian_first_name")).sendKeys("Samione" + currentTime);

		driver.findElement(By.id("guardian_last_name")).clear();
		driver.findElement(By.id("guardian_last_name")).sendKeys("Zaza" + currentTime);

		driver.findElement(By.id("guardian_address_1")).clear();
		driver.findElement(By.id("guardian_address_1")).sendKeys("1 Hudson Ave" + currentTime);

		driver.findElement(By.id("guardian_address_2")).clear();
		driver.findElement(By.id("guardian_address_2")).sendKeys("Apt 2" + currentTime);

		driver.findElement(By.id("guardian_city")).clear();
		driver.findElement(By.id("guardian_city")).sendKeys("Clifton" + currentTime);

		WebElement list_by_state = driver.findElement(By.name("guardian_state"));
		Select List_by_State = new Select(list_by_state);

		List_by_State.selectByValue("NJ");

		driver.findElement(By.id("guardian_zip")).sendKeys("07432");

		driver.findElement(By.id("guardian_phone_number")).sendKeys("9874322323");

		driver.findElement(By.id("first_name")).clear();
		driver.findElement(By.id("first_name")).sendKeys("Kelly" + currentTime);

		driver.findElement(By.id("last_name")).clear();
		driver.findElement(By.id("last_name")).sendKeys("Heldon" + currentTime);

		WebElement list_by_gender = driver.findElement(By.name("sex"));
		Select List_by_Gender = new Select(list_by_gender);

		List_by_Gender.selectByValue("F");

		driver.findElement(By.xpath(".//*[@id='container']/form/p[13]/span[1]/div/span/a/span[1]")).click();
		driver.findElement(By.xpath(".//*[@id='container']/form/p[13]/span[1]/select/option[9]")).click();

		driver.findElement(By.xpath(".//*[@id='container']/form/p[13]/span[2]/div/span/a/span[1]")).click();
		driver.findElement(By.xpath(".//*[@id='container']/form/p[13]/span[2]/select/option[17]")).click();

		driver.findElement(By.xpath(".//*[@id='container']/form/p[13]/span[3]/div/span/a/span[1]")).click();
		driver.findElement(By.xpath(".//*[@id='container']/form/p[13]/span[3]/select/option[46]")).click();

		driver.findElement(By.xpath(".//*[@id='same-address']")).click();

		driver.findElement(By.id("SocialSecurityNumber")).sendKeys("4321");

	}

	@When("^enter the insurance information for combo$")
	public void enter_the_insurance_information_for_combo() throws Throwable {

		WebElement list_by_insurance = driver.findElement(By.id("insuranceCompanyName"));
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

	@Then("^I fill in prescriber info for combo$")
	public void i_fill_in_prescriber_info_for_combo() throws Throwable {

	}

	@Then("^I fill the site of care information for combo$")
	public void i_fill_the_site_of_care_information_for_combo() throws Throwable {

	}

	@Then("^I confirm informations$")
	public void i_confirm_informations() throws Throwable {

	}

	@Then("^Clicks on confirm buttons$")
	public void clicks_on_confirm_buttons() throws Throwable {

	}

	@Then("^close Xolair browser for combo enrollment$")
	public void close_Xolair_browser_for_combo_enrollment() throws Throwable {

	}

}
