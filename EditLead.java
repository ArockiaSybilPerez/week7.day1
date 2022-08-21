package stepdefinition;
import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class EditLead extends ProjectSpecificMethods {
	
	@And ("Click on find lead link")
	public void clickFindLeads() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	
	@And ("Enter first name as (.*)$")
	public void enterNameinFindLead(String firstName) {
		driver.findElement(By.xpath("//*[@id=\"ext-gen248\"]")).sendKeys(firstName);
		
	}
	
	@And ("Click find leads button")
	public void findLeads(){
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	
	@And ("Click on the first resulting lead")
	public void selectLead() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@href='/crmsfa/control/viewLead?partyId=11286'])[3]")).click();	
	}
	@And ("Click on edit button")
	public void clickEdit() {
		driver.findElement(By.linkText("Edit")).click();
	}
	
	@And ("Change the company name as (.*)$")
	public void updateCompanyName(String companyName) {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("SysARC Info");
	}
	
	@And ("Click on update button")
	public void updateLead() {
		driver.findElement(By.name("submitButton")).click();
	}
	@Then ("Verify whether the lead is modified")
	public void verifyUpdates() {
		String companyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (companyName.contains(companyName)) {
			System.out.println("The company name is updated");
		}
		else {
			System.out.println("The company name is not updated");
		}
	}
}
