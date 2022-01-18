package car.mindtree2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class automation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.edge.driver","C:\\Users\\M1077563\\Desktop\\msedgedriver.exe");
					EdgeDriver driver = new EdgeDriver();
					driver.get("https://www.savaari.com/");
					
			        driver.findElement(By.cssSelector(".bg-airport")).click();
			       driver.findElement(By.id("fromCityList")).sendKeys("Bangalore");
					Thread.sleep(1000);
					driver.findElement(By.id("fromCityList")).sendKeys(Keys.ENTER);
					driver.findElement(By.cssSelector(".form-control.ng-untouched.ng-pristine.ng-invalid.ng-star-inserted")).click();
					driver.findElement(By.cssSelector(".form-control.ng-untouched.ng-pristine.ng-invalid.ng-star-inserted")).sendKeys(Keys.ARROW_DOWN);
					driver.findElement(By.cssSelector(".form-control.ng-untouched.ng-pristine.ng-invalid.ng-star-inserted")).sendKeys(Keys.ENTER);
					driver.findElement(By.id("search_places")).click();
					Thread.sleep(200);
					driver.findElement(By.id("search_places")).sendKeys("Hyderabad");
					Thread.sleep(1000);
				driver.findElement(By.cssSelector(".book-button.btn")).click();
					Thread.sleep(1000);
					driver.findElement(By.id("search_places")).click();
					Thread.sleep(1000);
					driver.findElement(By.id("search_places")).sendKeys(Keys.ARROW_DOWN);
					Thread.sleep(1000);
					driver.findElement(By.id("search_places")).sendKeys(Keys.ENTER);
					Thread.sleep(500);
					driver.findElement(By.cssSelector(".book-button.btn")).click();



					}



				
			



			}

		

	


