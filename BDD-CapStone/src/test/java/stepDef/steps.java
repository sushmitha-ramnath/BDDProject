package stepDef;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
	public static WebDriver driver;
	SignupClass signup=new SignupClass(driver);
	loginClass login=new loginClass(driver);
	BookingClass booking=new BookingClass(driver);
	ViewBookings views=new ViewBookings(driver);



	@Given("user has opened Application")
	public void user_has_opened_application() {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Installs\\chromedriver_win32 (1)\\chromedriver.exe");
		//	     WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://localhost:8080/FlyAway/");
		driver.manage().window().maximize();
		System.out.println("user has opened Application");
	}
	@When("user opens Home page")
	public void user_opens_home_page() {
		// Write code here that turns the phrase above into concrete action
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		System.out.println("user opens Home page");
	}
	@Then("user should be navigated to home page")
	public void user_should_be_navigated_to_home_page() {
		// Write code here that turns the phrase above into concrete actions

		System.out.println("user should be navigated to home page");

	}

	@Given("user has opened login page")
	public void user_has_opened_login_page() {
		// Write code here that turns the phrase above into concrete actions
		signup.SignUp();
		;
	}
	@Given("user opts to register")
	public void user_opts_to_register() {
		// Write code here that turns the phrase above into concrete actions

	}
	@When("user enters details required")
	public void user_enters_details_required() {
		// Write code here that turns the phrase above into concrete actions

	}
	@Then("user registered successfully")
	public void user_registered_successfully() {

		// Write code here that turns the phrase above into concrete actions
	}
	@Given("user opened login page and enter details")
	public void user_opened_login_page_and_enter_details() {
		login.Login();
		// Write code here that turns the phrase above into concrete actions

	}
	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		// Write code here that turns the phrase above into concrete actions

	}
	@Then("user is on login page")
	public void user_is_on_login_page() {
		// Write code here that turns the phrase above into concrete actions

	}
	@Given("user has logged successfully and clicks on home")
	public void user_has_logged_successfully_and_clicks_on_home() {
	    // Write code here that turns the phrase above into concrete actions
	    booking.Booking();
	}
	@When("Select {string} as source and {string} as destination")
	public void select_as_source_and_as_destination(String str1, String str2) {

	}
	@When("User books flight")
	public void user_books_flight() {
		// Write code here that turns the phrase above into concrete actions

	}
	@Then("User completes booking")
	public void user_completes_booking() {
		// Write code here that turns the phrase above into concrete actions

	}
	@Given("user complete booking")
	public void user_complete_booking() {
		views.Views();
		// Write code here that turns the phrase above into concrete actions

	}
	@Then("user will check booking status")
	public void user_will_check_booking_status() {
		// Write code here that turns the phrase above into concrete actions

	}
	@Then("user logout")
	public void user_logout() {
		// Write code here that turns the phrase above into concrete actions

	}


}
