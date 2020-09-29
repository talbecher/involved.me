package tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.LoginPage;
import pageObject.ProjectsPage;
import pageObject.TemplatesPage;

public class AddAnotherProjectTest extends BaseTest {

	final String chooseWsName = "Tal4";
	final String projectType = "quiz";
	final String templateName = "Shoppable Eyewear Quiz";
	final String projectName = "new tal33";
	
	@Test(description = "check choose workspace")
	public void tc01_chooseWorkSpace() {
		ProjectsPage pp = new ProjectsPage(driver);
		pp.chooseWs(chooseWsName);
		String expected = "Add team members";
		String actual = pp.getAddMembersText();
		assertEquals(actual, expected);
	}


	@Test(description = "check create project button")
	public void tc02_createProject() {
		ProjectsPage pp = new ProjectsPage(driver);
		pp.createProject();
		String expected = "Choose project type";
		String actual = pp.getChooseProjectTitle();
		assertEquals(actual, expected);
	}

	@Test(description = "check choose project type")
	public void tc03_chooseProjectType() {
		ProjectsPage pp = new ProjectsPage(driver);
		pp.chooseProjectType(projectType);
		String expected = "Templates";
		String actual = pp.getTemplatesTitle();
		assertEquals(actual, expected);
	}
	
	@Test(description = "check choose templates")
	public void tc04_choosetemplateName() {
		ProjectsPage pp = new ProjectsPage(driver);
		pp.chooseProject(templateName);
       
	}
	
	@Test(description = "check choose previw button")
	public void tc05_choosePreviewBtn() {
		ProjectsPage pp = new ProjectsPage(driver);
		pp.choosePreviewBtn(templateName);
	}

}
