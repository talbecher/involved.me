package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.LoginPage;
import pageObject.ProjectsPage;

public class RenameWsTest extends BaseTest {
	
	final String workspaceName = "123";
	final String workspaceNewName = "tal new";
	
	@Test
	public void tc01_chooseWorkSpace() {
		ProjectsPage pp = new ProjectsPage(driver);
		pp.chooseWs(workspaceName);
//		String actual = pp.getTextWsName();
//		String expected = "123";
//		Assert.assertEquals(actual, expected);
	
	}
	
//	@Test
//	public void tc02_renameWorkSpace() {
//		ProjectsPage pp = new ProjectsPage(driver);
//		pp.renameWs(workspaceNewName);
//		String actual = pp.getTextWsName();
//		String expected = "tal new";
//		Assert.assertEquals(actual, expected);
//	}
	

}
