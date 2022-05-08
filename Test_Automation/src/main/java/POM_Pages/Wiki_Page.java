package POM_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class Wiki_Page extends BaseClass {

	@FindBy(xpath = "(//div[@class='plainlist'])[4]")
	WebElement releaseDate;

	@FindBy(xpath = "(//td[@class='infobox-data'])[12]")
	WebElement country;

	public Wiki_Page() {
		PageFactory.initElements(driver, this);

	}

	// action methods

	public boolean testcase1() {

		releaseDate.getText();
		System.out.println(releaseDate.getText());
		return releaseDate.getText().toString().contains("January 7, 2022 (United States)");

	}

	public boolean testcase2() {
		country.getText();
		System.out.println(country.getText());
		return country.getText().toString().contains("India");

	}

}
