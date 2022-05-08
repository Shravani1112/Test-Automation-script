import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import Base.BaseClass;
import POM_Pages.IMDB_Page;
import POM_Pages.Wiki_Page;

public class TestClass extends BaseClass {

	@FindBy(xpath = "(//a[@class='ipc-metadata-list-item__list-content-item ipc-metadata-list-item__list-content-item--link'])[24]")
	WebElement releaseDate;

	@FindBy(xpath = "(//a[@class='ipc-metadata-list-item__list-content-item ipc-metadata-list-item__list-content-item--link'])[25]")
	WebElement country;

	@FindBy(xpath = "(//div[@class='plainlist'])[4]")
	WebElement releaseDate1;

	@FindBy(xpath = "(//td[@class='infobox-data'])[12]")
	WebElement country1;

	IMDB_Page imdb_page;
	Wiki_Page wiki_page;

	public TestClass() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initialization();
		imdb_page = new IMDB_Page();
		wiki_page = new Wiki_Page();
	}

	@Test
	public void test1() throws Exception {
		driver.get("https://www.imdb.com/title/tt9389998/");
		assert (imdb_page.testcase1());
		assert (imdb_page.testcase2());

	}

	@Test
	public void test2() throws Exception {

		driver.navigate().to("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
		assert (wiki_page.testcase1());
		assert (wiki_page.testcase2());

	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
