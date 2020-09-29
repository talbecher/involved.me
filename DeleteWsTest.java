package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pageObject.ProjectsPage;

public class DeleteWsTest extends BaseTest{
	
	
	
	@Test(description = "check choose WorkSpace")
	public void tc01_chooseWorkSpace() {
		ProjectsPage pp = new ProjectsPage(driver);
		pp.chooseWs("tal2");
	
	}
	@Test(description = "check delete WorkSpace")
	public void tc02_deleteWorkSpace() {
		ProjectsPage pp = new ProjectsPage(driver);
		pp.deleteWs("tal2");
		String actual = pp.getCompletedText();
		String expected = "completed";
		assertEquals(actual, expected);
	
	}
	
	
	
}
