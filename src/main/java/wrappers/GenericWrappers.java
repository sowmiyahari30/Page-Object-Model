package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ReporterType;

import utils.Reporting;

public class GenericWrappers extends Reporting implements Wrappers{
	
	
	public static RemoteWebDriver driver;
	
	public static Properties prop; 
	
	public void loadObjects() {
		
		try {
			
			 prop = new Properties();
			
			prop.load(new FileInputStream("./src/test/java/object.properties"));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void unLoadObjects() {
		prop=null;
	}

	
	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				 driver = new ChromeDriver();
				
			}else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				 driver = new FirefoxDriver();
            }else if(browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
            }
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//System.out.println("The browser "+browser+" is launched succesfully with the given URL "+url);
			reportStep("The browser "+browser+" is launched succesfully with the given URL "+url, "pass");
		   } catch (InvalidArgumentException e) {
			// TODO Auto-generated catch block
		   // System.err.println("The browser "+browser+" is not launched as the url doesnt contain http/https" );	
			reportStep("The browser "+browser+" is not launched as the url doesnt contain http/https" , "fail");
		   }catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
			//System .err.println("The browser "+browser+" is not launched due to session not created error");
			reportStep("The browser "+browser+" is not launched due to session not created error", "fail");
	       }catch(WebDriverException e) {
		// TODO Auto-generated catch block
	    	 //  System.err.println("The browser "+browser+" is not launched due to unknown error");
	    	   reportStep("The browser "+browser+" is not launched due to unknown error", "fail");
	       }
		}
	
	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data);
			//System.out.println("The Element with "+idValue+" has entered with the data "+data);
			reportStep("The element with the "+idValue+" is entered with the data "+data, "pass");
		} catch (NoSuchElementException  e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with id "+idValue+" is not found in the DOM");
			reportStep("The Element with id "+idValue+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.print("The Element with id "+idValue+" is not Visible in the application");
			reportStep("The Element with id "+idValue+" is not Visible in the application", "fail");
					
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with id "+idValue+" is not Interactable in the application");
			reportStep("The Element with id "+idValue+" is not Interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with id "+idValue+" is not stable in the application");
			reportStep("The Element with id "+idValue+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with id "+idValue+" has not  entered   the  data "+data+" due to  unknown error");
			reportStep("The Element with id "+idValue+" has not  entered   the  data "+data+" due to  unknown error", "fail");
		} 
	}

	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			//System.out.println("The Element with name "+nameValue+" has entered with the data "+data);
			reportStep("The Element with name "+nameValue+" has entered with the data "+data, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with the name "+nameValue+" is not found in the DOM");
			reportStep("The Element with the name "+nameValue+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Method with the data "+data+" is not visible in the application");
			reportStep("The element with the data "+data+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with the name "+nameValue+" is not ineractable in the application");
			reportStep("The Element with the name "+nameValue+" is not ineractable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with the name "+nameValue+" is not stable in the application");
			reportStep("The Element with the name "+nameValue+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with the name "+nameValue+" has an unknown error with the data"+data);
			reportStep("The Element with the name "+nameValue+" is not known due to unknown error", "fail");
		} 
		
		
	}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			//System.out.println("The Element with the Xpath "+xpathValue+" is entered with the data"+data);
			reportStep("The element with the xpath "+xpathValue+" is  entered with the data"+data,"pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with the Xpath "+xpathValue+" is not found in the DOM");
			reportStep("The element with the Xpath "+xpathValue+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Method with the data "+data+" is not visible in the application");
			reportStep("The Element with the name "+xpathValue+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with the Xpath "+xpathValue+" is not interatable with the application ");
			reportStep("The Element with the Xpath "+xpathValue+" is not interactable with the application ", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with the Xpath "+xpathValue+" is not stable in the application");
			reportStep("The Element with the Xpath "+xpathValue+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with the Xpath "+xpathValue+" is not entered with the data"+data+" due to unknown error");
			reportStep("The Element with the Xpath "+xpathValue+" is not entered with the data\"+data+\" due to unknown error", "fail");
		} 
	}

	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		try {
			String title1 =driver.getTitle();
			if(title1.equals(title)) {
				//System.out.println("The title of the page "+title1+" is matched with the expected title "+title);
				reportStep("The title of the page "+title+" is matched with the expected title "+title,"pass");
			}else {
			//System.err.println("The title of the page "+title+" is not matched with the expected title "+title);
				reportStep("The title of the page "+title+" is not  matched with the expected title "+title,"fail");
			}
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The title of the page is not verified due to unknown error");
			reportStep("The title of the page is not verified due to unknown error","fail");
		}
	    }

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		String text1 = null;
		try {
		
			 text1 = driver.findElementById(id).getText();
			
			if(text1.equals(text)) {
			//System.out.println("The element with id "+id+" is holding the text "+text1+" is matched with the expected text "+text);
				reportStep("The element with the id "+id+" is holding the text "+text1+" is matched with the expected text "+text,"pass");
			}else {
			//System.err.println("The element with the id "+id+" is holding the text "+text1+" is not matched the expected text "+text);
				reportStep("The element with the id "+id+" is holding the text "+text1+" is not  matched with the expected text "+text,"fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with the id "+id+" is not found in the DOM");
			reportStep("The Element with the id "+id+" is not found in the DOM","fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with the id "+id+" is not visible in the application");
			reportStep("The Element with the id "+id+" is not visible in the application","fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The Element with the id "+id+" is not interactable in the application");
			reportStep("The Element with the id "+id+" is not interactable in the application","fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+id+" is not stable in the application");
			reportStep("The element with the id "+id+" is not stable in the application","fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The text of the page is not verified due to unknown error");
			reportStep("The text of the page is not verified due to unknown error","fail");
		}
		return;
	}
	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
	  try {
		String text2 =	driver.findElementByXPath(xpath).getText();
		  if(text2.equals(text)) {
			//  System.out.println("The element with xpath "+xpath+" is holding the text "+text2+" matched with the expected text "+text);
			  reportStep("The element with the xpath"+xpath+" is holding text "+text2+" is  matched with the expected text "+text, "pass");
		  }else {
			//  System.err.println("the element with xpath "+xpath+" is holding the text "+text2+" not matched with the ecpected text "+text);
			  reportStep("The element with the id "+xpath+" is holding the text "+text2+" is not  matched with the expected text "+text,"fail");
		  }
	} catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		//System.err.println("The Element with the Xpath "+xpath+" is not found in the DOM" );
		  reportStep("The Element with the Xpath "+xpath+" is not found in the DOM","fail");
	} catch (ElementNotVisibleException e) {
		// TODO: handle exception
		//System.err.println("The Element with the Xpath "+xpath+" is not vissible in the application");
		 reportStep("The Element with the Xpath "+xpath+" is not vissible in the application","fail");
	}catch (ElementNotInteractableException e) {
			// TODO: handle exception
		//System.err.println("The Element with the Xpath "+xpath+" is not interactable in the application");
		 reportStep("The Element with the Xpath "+xpath+" is not interactable in the application","fail");
	}catch (StaleElementReferenceException e) {
		// TODO: handle exception
		//System.err.println("The Element with  the Xpath "+xpath+" is not stable in the application");
		 reportStep("The Element with  the Xpath "+xpath+" is not stable in the application","fail");
	}catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("The text of the page is not verified due to unknown error");
		 reportStep("The text of the page is not verified due to unknown error","fail");
	}
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		
		try {
			String actualText =	driver.findElementByXPath(xpath).getText();
			
			if(actualText.contains(text)) {
			//System.out.println("The Element of the xpath "+xpath+" is holding the "+actualText+" is contains the expected text "+text);
				reportStep("The element with the xpath "+xpath+" is holding the "+actualText+" contains the expected text "+text, "pass");
} else  {
			//System.err.println("The Element of the xpath "+xpath+" is holding the "+actualText+" not contains the expected text "+text);
	 reportStep("The element with the  xpath "+xpath+" is not containing the expected text "+text,"fail");
}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with the Xpath "+xpath+" is not vissible in the DOM");
			reportStep("The element with the Xpath "+xpath+" is not vissible in the DOM","fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with the Xpath "+xpath+" is not vissible in the application");
			reportStep("The element with the Xpath "+xpath+" is not vissible in the application","fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with the Xpath"+xpath+" is not interactable in the application");
			reportStep("The element with the Xpath "+xpath+" is not interactable in the application","fail");
		}catch(StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with the Xpath "+xpath+" is not stable in the application");
			reportStep("The Element with the Xpath "+xpath+" is not stable in the application","fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The text  of the page is not verified due to unknown error");
			reportStep("The text  of the page is not verified due to unknown error","fail");
		}
			
		} 
		
	
	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
			//System.out.println("The Element with the id "+id+" is clickable");
			reportStep("The element with the id "+id+" is clickable", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with the id "+id+" is not found in the DOM");
			reportStep("The Element with the id "+id+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with the id "+id+" is not visible in the application");
			reportStep("The Element with the id "+id+" is not visible in the application", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The Element with the id "+id+" is not clickable");
			reportStep("The element with the id "+id+" is not clickable", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with the id "+id+" is not interactable in the application");
			reportStep("The element with the id "+id+" is not interactable in the application", "fail");
		
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with the id "+id+" is not stable in  the application");
			reportStep("The Element with the id "+id+" is not stable in  the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with the "+id+" is not clicked due to unknown error");
			reportStep("The Element with the "+id+" is not clicked due to unknown error", "fail");
		} 
	}
	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			//System.out.println("The Element with the ClassName "+classVal+" is clicked");
			reportStep("The Element with the ClassName "+classVal+" is clicked", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with the ClassName "+classVal+" is not found in the DOM");
			reportStep("The Element with the ClassName "+classVal+" is not found in the DOM", "fail");
		}catch(ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with the ClassName "+classVal+" is not visible in the application");
			reportStep("The Element with the ClassName "+classVal+" is not visible in the application", "fail");
		}catch(ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with the ClassName "+classVal+" is not clickable");
			reportStep("The Element with the ClassName "+classVal+" is not clickable", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
		//System.err.println("The element with the Classname "+classVal+" is not interactable in the application ");	
			reportStep("The element with the Classname "+classVal+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The Element with the ClassName "+classVal+" is not stable in the application");
			reportStep("The Element with the ClassName "+classVal+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with the ClassName "+classVal+" is not known due to unknown error");
			reportStep("The Element with the ClassName "+classVal+" is not known due to unknown error", "fail");
		} 
	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			//System.out.println("The Element with name "+name+" is clicked");
			reportStep("The Element with name "+name+" is clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		//	System.err.println("The Element with the name "+name+" is not found in the DOM");
			reportStep("The Element with the name "+name+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the name "+name+" is not visible in the application");
			reportStep("The Element with the name "+name+" is not visible in the application", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the name "+name+" is not clickable");
			reportStep("The Element with the name "+name+" is not clickable", "fail");
		}catch (ElementNotInteractableException e) {
				// TODO: handle exception
		//	System.err.println("The Element with the name "+name+" is not interactable in the application");
			reportStep("The Element with the name "+name+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the name "+name+" is not stable in the application");
			reportStep("The Element with the name "+name+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the name "+name+" is not known due to unknown error");
			reportStep("The Element with the name "+name+" is not known due to unknown error", "fail");
			}
	}

	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The Element with the LinkText "+name+" is clicked");
			reportStep("The Element with the LinkText "+name+" is clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with the LinkText "+name+" is not found in the DOM");
			reportStep("The Element with the LinkText "+name+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with the LinkText "+name+" is not visible in the application");
			reportStep("The Element with the LinkText "+name+" is not visible in the application", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The Element with the LinkText "+name+" is not clickable");
			reportStep("The Element with the LinkText "+name+" is not clickable", "fail");
		}catch (ElementNotInteractableException e2) {
				// TODO: handle exception
			//System.err.println("The Element with the linkText "+name+" is not interactable in the application");
			reportStep("The Element with the linkText "+name+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the LinkText "+name+" is not stable in the application");
			reportStep("The Element with the LinkText "+name+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Element with the LinkText "+name+" is not known due to unknown error");
			reportStep("The Element with the LinkText "+name+" is not known due to unknown error", "fail");
		}
	}
	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The Element with the LinkText "+name+" is clicked");
			reportStep("The element with linktext "+name+" is clicked","pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		  //System.err.println("The Element with the LinkText "+name+"is not found in the DOM");
			reportStep("The Element with the LinkText "+name+"is not found in the DOM","fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the LinkText "+name+" is not visible in the application");
			reportStep("The Element with the LinkText "+name+" is not visible in the application","fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the LinkText "+name+" is not clickable");
			reportStep("The Element with the LinkText "+name+" is not clickable","fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the LinkText "+name+" is not stable in the application");
			reportStep("The Element with the LinkText "+name+" is not stable in the application","fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the LinkText "+name+" is not known due to unknown error");
			reportStep("The Element with the LinkText "+name+" is not known due to unknown error","fail");
		}
	}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The Element with the Xpath "+xpathVal+" is clicked");
			reportStep("The Element with the Xpath "+xpathVal+" is clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with the Xpath "+xpathVal+" is not found in the DOM");
			reportStep("The Element with the Xpath "+xpathVal+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with the Xpath "+xpathVal+" is not visible in the application");
			reportStep("The Element with the Xpath "+xpathVal+" is not visible in the application", "fail");
			
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The Element with the Xpath "+xpathVal+" is not clickable");
			reportStep("The Element with the Xpath "+xpathVal+" is not clickable", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the Xpath "+xpathVal+" is not interactable in the application");
			reportStep("The Element with the Xpath "+xpathVal+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the Xpath "+xpathVal+" is not stable in the application");
			reportStep("The Element with the Xpath "+xpathVal+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the Xpath "+xpathVal+" is not known due to unknown error");
			reportStep("The Element with the Xpath "+xpathVal+" is not known due to unknown error", "fail");
		}
		
	}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
		//	System.out.println("The Element with the Xpath "+xpathVal+" is clicked");
			reportStep("The Element with the Xpath "+xpathVal+" is clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		//	System.err.println("The Element with the Xpath "+xpathVal+" is not found in the DOM");
			reportStep("The Element with the Xpath "+xpathVal+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the Xpath "+xpathVal+" is not visible in the application");
			reportStep("The Element with the Xpath "+xpathVal+" is not visible in the application", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the Xpath "+xpathVal+" is not clickable");
			reportStep("The Element with the Xpath "+xpathVal+" is not clicked", "fail");
		  }catch (ElementNotInteractableException e) {
				// TODO: handle exception
		//	  System.err.println("The Element with the Xpath "+xpathVal+" is not interactable in the application");
			  reportStep("The Element with the Xpath "+xpathVal+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the Xpath "+xpathVal+" is not stable in the application");
			reportStep("The Element with the Xpath "+xpathVal+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The Element with Xpath "+xpathVal+" is not known due to unknown error");
			reportStep("The Element with Xpath "+xpathVal+" is not known due to unknown error", "fail");
		}
		
		
		
	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String text1 = null;
	    try {
			text1 = driver.findElementById(idVal).getText();
		
			//System.out.println("The element with id "+idVal+" is holding the text "+text1);
			reportStep("The element with id "+idVal+" is holding the text "+text1, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		//	System.err.println("The Element with the id "+idVal+" is not found in the DOM");
			reportStep("The Element with the id "+idVal+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the id "+idVal+" is not visible in the application");
			reportStep("The Element with the id "+idVal+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the id "+idVal+" is not interactable in the application");
			reportStep("The Element with the id "+idVal+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the id "+idVal+" is not stable in the application");
			reportStep("The Element with the id "+idVal+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the id "+idVal+" is not successfull due to unknown error");
			reportStep("The Element with the id "+idVal+" is not successfull due to unknown error", "fail");
		}
		
		return text1;
		
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String text1= null;
		 try {
			text1 = driver.findElementByXPath(xpathVal).getText();
			//System.out.println("The Element with Xpath "+xpathVal+" is holding text "+text1);
			reportStep("The Element with Xpath "+xpathVal+" is holding text "+text1, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		//	System.err.println("The Element with the Xpath "+xpathVal+" is not found in the DOM");
			reportStep("The Element with the Xpath "+xpathVal+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with the Xpath "+xpathVal+" is not visible in the application");
			reportStep("The Element with the Xpath "+xpathVal+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
				// TODO: handle exception
		//	System.err.println("The Element with the Xpath "+xpathVal+" is not interactable in the application");
			reportStep("The Element with the Xpath "+xpathVal+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the Xpath "+xpathVal+" is not stable in the application");
			reportStep("The Element with the Xpath "+xpathVal+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
		//	System.out.println("The element with id "+xpathVal+" failed due to unknown error" );
			reportStep("The element with id "+xpathVal+" failed due to unknown error", "fail");
		}
		 
		 return text1;
	}

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement obj = driver.findElementById(id);
			Select sel = new Select(obj);
			sel.selectByVisibleText(value);
		//	System.out.println("The Element with the id "+id+" is selected wtih visible text  "+value);
			reportStep("The Element with the id "+id+" is selected wtih visible text  "+value, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		//	System.out.println("The Element with the id "+id+" is not found in the DOM" );
			reportStep("The Element with the id "+id+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
		//	System.err.println("The Element with the id "+id+" is not visible in the application");
			reportStep("The Element with the id "+id+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the id "+id+" is not interactable in the application");
			reportStep("The Element with the id "+id+" is not interactable in the application", "fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the id "+id+" is not selectable");
			reportStep("The Element with the id "+id+" is not selectable", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the id "+id+" is not known due to unknown error");
			reportStep("The Element with the id "+id+" is not known due to unknown error", "fail");
		}
	}

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement obj = driver.findElementById(id);
			Select sel = new Select(obj);
			sel.selectByIndex(value);
			reportStep("The Element with the id "+id+" is selected wtih the index "+value, "pass");
		//	System.out.println("The Element with the "+id+" is selected using the value"+value);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		//	System.err.println("The Element with the id "+id+" is not found in the DOM");
			reportStep("The Element with the id "+id+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the id "+id+" is not visible in the application");
			reportStep("The Element with the id "+id+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the id "+id+" is not interactable in the application");
			reportStep("The Element with the id "+id+" is not interactable in the application", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the id "+id+" is disabled");
			reportStep("The Element with the id "+id+" is not selectable", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the id "+id+" is not known due to unknown error");
			reportStep("The Element with the id "+id+" is not known due to unknown error", "fail");
		}
		
	}

	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> allwinIds = driver.getWindowHandles();
			for(String eachid :allwinIds) {
				driver.switchTo().window(eachid);
				break;
			}
			//System.out.println("The driver is switched to the parent window successfully");
			reportStep("The driver is switched to the parent window successfully", "pass");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
		//	System.err.println("The driver is not switched parent window due to NoSuchWindow Exception");
			reportStep("The driver is not switched to the parent window successfully", "fail");
		}catch (SessionNotCreatedException e) {
			// TODO: handle exception
			//System.err.println("The driver is not switched  as the session id is not created");
			reportStep("The driver is not switched to the parent window successfully", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The driver is not switched  due to unknnown error");
			reportStep("The driver is not switched  due to unknnown error", "fail");
		}
		
	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		
		try {
			Set<String> allwinIds = driver.getWindowHandles();
			
			for(String eachId:allwinIds) {
				driver.switchTo().window(eachId);
			}
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
		//	System.err.println("The driver is not able to switch as no such window is present");
			reportStep("The driver is not able to switch as no such window is present", "pass");
		}catch (SessionNotCreatedException e) {
			// TODO: handle exception
		//	System.err.println("The driver is not able to switch as the Session Id is not created");
			reportStep("The driver is not able to switch as no such window is present", "fail");	
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The driver is not able to switch due to unknown error");
			reportStep("The driver is not able to switch as no such window is present", "fail");
		}
		
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
		//	System.out.println("The alert is been accepted sucessfully");
			reportStep("The alert is been accepted sucessfully", "pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
		//	System.err.println("The alert is not stable in the application ");
			reportStep("The alert is not stable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
		//	System.err.println("The alert is not handled due to unhandled alert exception");
			reportStep("The alert is not handled due to unhandled alert exception", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The alert is not accepted due to unknown error");
			reportStep("The alert is not accepted due to unknown erro", "fail");
		}
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			//System.out.println("The alert is been dismissed succesfully");
			reportStep("The alert is been dismissed succesfully", "pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("The alert is not stable in the application");
			reportStep("The alert is not stable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
		//	System.err.println("The alert is not dismissed due to unhandled alert exception");
			reportStep("The alert is not dismissed due to unhandled alert exception", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The alert is not dismissed due to unknown error");
			reportStep("The alert is not dismissed due to unknown error", "fail");
		}
		
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		String text1 = null;
		
		 try {
			text1 = driver.switchTo().alert().getText();
			//System.out.println("The alert text "+text1+" is been printed in the console succesfully");
			reportStep("The alert text "+text1+" is been printed in the console succesfully", "pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
		//	System.err.println("The alert text is not printed due to NoAlertPresentException error");
			reportStep("The alert text is not printed due to NoAlertPresentException error", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
		//	System.err.println("The alert is not printed due to UnHandledAlertException error");
			reportStep("The alert is not printed due to UnHandledAlertException error", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The alert is not printed due to unknown error");
			reportStep("The alert is not printed due to unknown error", "fail");
		}
		
		 return text1;
	}

	public long takeSnap()  {
		// TODO Auto-generated method stub

		long number =0;
		
		try {
			
			number = (long) (Math.floor(Math.random()*100000000)+100000);
			
			File tmp = driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("./reports/screenshots/"+number+".png");
			FileUtils.copyFile(tmp, dest);
		//	System.out.println("The Screenshot has been succesfully taken");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
		//	System.err.println("The Screenshot is not taken due to unknown error");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Screenshot is not taken due to IOExpection error");
		}
		
		return number;
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			//System.out.println("The current window is closed succesfully");
			reportStep("The current window is closed succesfully", "pass", false);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The current window is not closed due to unknown error");
			reportStep("The current window is not closed due to unknown error", "fail");
		}
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			//System.out.println("The Browser has been closed succesfully");
			reportStep("The Browser has been closed succesfully", "pass", false);
		} catch (WebDriverException e) {
			
			// TODO Auto-generated catch block
		//	System.err.println("The browser cannot be closed due to an unknown error");
		}
		
	}
	public void waitProperty(long time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void selectValueByXpath(String xpathVal, String value) {
		// TODO Auto-generated method stub
		
		try {
			WebElement obj = driver.findElementByXPath(xpathVal);
			Select sel = new Select(obj);
			sel.selectByValue(value);
			//System.out.println("The Element with the Xpath "+xpathVal+" is selected using the value "+value);
			reportStep("The Element with the Xpath "+xpathVal+" is selected using the value "+value, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with the Xpath "+xpathVal+" is not found in the DOM");
			reportStep("The Element with the Xpath "+xpathVal+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The Element with the Xpath "+xpathVal+" is not visible in the apllication");
			reportStep("The Element with the Xpath "+xpathVal+" is not visible in the apllication", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the Xpath "+xpathVal+" is not interactable in the application");
			reportStep("The Element with the Xpath "+xpathVal+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the Xpath "+xpathVal+" is not stable in the apllication");
			reportStep("The Element with the Xpath "+xpathVal+" is not stable in the apllication", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the xpath "+xpathVal+" is not selectable");
			reportStep("The Element with the xpath "+xpathVal+" is not selectable", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the Xpath "+xpathVal+" is not known due to unknown error");
			reportStep("The Element with the Xpath "+xpathVal+" is not known due to unknown error", "fail");
		}
		
		}
	public void selectValueById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement obj = driver.findElementById(id);
			Select sel = new Select(obj);
			sel.selectByValue(value);
			//System.out.println("The Element with the id "+id+" is selected using the value"+value);
			reportStep("The Element with the id "+id+" is selected using the value"+value, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with the id "+id+" is not found in the DOM");
			reportStep("The Element with the id "+id+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the id "+id+" is not visible in the application");
			reportStep("The Element with the id "+id+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the id "+id+" is not interactable in the application");
			reportStep("The Element with the id "+id+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the id "+id+" is not stable in the application");
			reportStep("The Element with the id "+id+" is not stable in the application", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the id "+id+" is not selectable");
			reportStep("The Element with the id "+id+" is not selectable", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The element with id "+id+" is not known due to unknown error");
			reportStep("The element with id "+id+" is not known due to unknown error", "fail");
		}
			
		}
	public void selectValueByName(String name, String value) {
		// TODO Auto-generated method stub
		
		try {
			WebElement obj = driver.findElementByName(name);
			Select sel = new Select(obj);
			sel.selectByValue(value);
		//	System.out.println("The element with name "+name+" is selected with value "+value);
			reportStep("The element with name "+name+" is selected with value "+value, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			
			//System.err.println("The Element with the name "+name+" is not found in the DOM");
			reportStep("The Element with the name "+name+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the name "+name+" is not visible in the application");
			reportStep("The Element with the name "+name+" is not visible in the application", "fail");	
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the name "+name+" is not interactable in the application");
			reportStep("The Element with the name "+name+" is not interactable in the application", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the name "+name+" is not selectable");
			reportStep("The element with name "+name+" is not selected with value "+value, "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
		//	System.err.println("The element with the name "+name+" is not stable in the application");
			reportStep("The element with the name "+name+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the name "+name+" is not known due to unknown error");
			reportStep("The Element with the name "+name+" is not known due to unknown error", "fail");
			
		}		
	}
	public void scrollDownByXPath() {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
		//	System.out.println("The element with the xpath  is scrolled down");
			reportStep("The element with the xpath  is scrolled down", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		//	System.err.println("the element with the xpath  is not found in the DOM");
			reportStep("The element with the xpath  is not scrolled down", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
		//	System.err.println("The element with the xpath is not visible in the application");
			reportStep("The element with the xpath  is not scrolled down", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
		//	System.err.println("The element with the xpath is not stable in the application");
			reportStep("The element with the xpath  is not scrolled down", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The element with the xpath is found due to unknown error");
			reportStep("The element with the xpath  is not scrolled down", "fail");
		}
		
	}
	
	public void navigateRefresh() {
		// TODO Auto-generated method stub
		try {
			driver.navigate().refresh();
		//	System.out.println("The page is successfully refreshed");
			reportStep("The page is successfully refreshed", "pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
		//	System.err.println("The page is not successfully refreshed");
			reportStep("The page is not successfully refreshed", "fail");
		}
	}
	public void switchToframeByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		
		try {
			WebElement frame = driver.findElementByXPath(xpathVal);
			driver.switchTo().frame(frame);
		//	System.out.println("The element with the xpath "+xpathVal+" is switched to the other frame");
			reportStep("The element with the xpath "+xpathVal+" is switched to the other frame", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		//	System.err.println("The element with the xpath "+xpathVal+" is not found in the DOM");
			reportStep("The element with the xpath "+xpathVal+" is not found in the DOM", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the xpath "+xpathVal+" is not visible in the application");
			reportStep("The Element with the xpath "+xpathVal+" is not visible in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
		//	System.err.println("The element with the xpath "+xpathVal+" is not stable in the application");
			reportStep("The element with the xpath "+xpathVal+" is not stable in the application", "fail");
		}catch(NoSuchFrameException e) {
			// TODO: handle exception
		//	System.err.println("The element with the xpath "+xpathVal+" is not switched to other frame");
			reportStep("The element with the xpath "+xpathVal+" is not switched to other frame", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The element with the xpath "+xpathVal+" is not known due to unknown error");
			reportStep("The element with the xpath "+xpathVal+" is not known due to unknown error", "fail");
		}
		
	}
	public void enterTextIntoAlert(String data) {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().sendKeys(data);
		//	System.out.println("The alert has been entered with the given data "+data);
			reportStep("The alert has been entered with the given data "+data, "pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
		//	System.err.println("The alert is not entered with the data "+data+" due to NoAlertPresent error ");
			reportStep("The alert is not entered with the data "+data+" due to NoAlertPresent error", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
		//	System.err.println("The alert is not entered with the data "+data+" due to unhandledAlert error");
			reportStep("The alert is not entered with the data "+data+" due to unhandledAlert error", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The alert is not entered with the data "+data+" due to unknown error");
			reportStep("The alert is not entered with the data "+data+" due to unknown error", "fail");
		}
	}
	public void switchToDefaultContent() {
		// TODO Auto-generated method stub
		
		try {
			driver.switchTo().defaultContent();
			//System.out.println("The driver is switched to defaultContent");
			reportStep("The driver is switched to defaultContent", "pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
		//	System.err.println("The driver is not switched to defaultContent");
			reportStep("The driver is not switched to defaultContent", "fail");
		}
	}

	public void verifytextContainsById(String idVal,String text) {
		// TODO Auto-generated method stub
		try {
			String alerttext = driver.findElementById(idVal).getText();
			
			if(alerttext.contains(text)) {
				//System.out.println("The element with the id "+idVal+" text contains the expected text"+text);
				reportStep("The element with the id "+idVal+" text contains the expected text"+text, "pass");
			}else {
			//	System.out.println("The element with the id "+idVal+" text does not contains the expected text"+text);
				reportStep("The element with the id "+idVal+" text not contains the expected text"+text, "fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		//	System.err.println("the element with the id "+idVal+" is not found in the DOM");
			reportStep("the element with the id "+idVal+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
		//	System.err.println("the element with the id "+idVal+" is not visible in the application");
			reportStep("the element with the id "+idVal+" is not visible in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
		//	System.err.println("the element with the id "+idVal+" is not stable in the application");
			reportStep("the element with the id "+idVal+" is not stable in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
		//	System.err.println("the element with the id"+idVal+" is not visible in the application");
			reportStep("the element with the id "+idVal+" is not visible in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("the element with the id "+idVal+" is not known due to unknown error");
			reportStep("the element with the id "+idVal+" is not known due to unknown error", "fail");
		}
	}
	public void verifytextNotContainsById(String idVal, String text) {
		// TODO Auto-generated method stub
		
		try {
			String actualText = driver.findElementById(idVal).getText();
			if(!actualText.contains(text)) {
			//	System.out.println("The element with the id "+idVal+" is not matched with the expected text "+text);
				reportStep("The element with the id "+idVal+" is not matched with the expected text "+text, "pass");
			}else {
			//	System.out.println("The element with the id "+idVal+" is matched with the expected text "+text);
				reportStep("The element with the id "+idVal+" is  matched with the expected text "+text, "fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		//	System.err.println("The elment with the id "+idVal+" is not found in the DOM");
			reportStep("The elment with the id "+idVal+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
		//	System.err.println("The element with the id "+idVal+" is not visible in the application");
			reportStep("The element with the id "+idVal+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
		//	System.err.println("The element with the id "+idVal+" is not interactable");
			reportStep("The element with the id "+idVal+" is not interactable", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
		//	System.err.println("The element with the id "+idVal+" is not stable in the application");
			reportStep("The element with the id "+idVal+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
	//		System.err.println("The element with the id "+idVal+" is not found due to unknown error");
			reportStep("The element with the id "+idVal+" is not found due to unknown error", "fail");
		}
	}
	public void mouseHoverByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		
		try {
			WebElement obj = driver.findElementByXPath(xpathVal);
			
			Actions builder = new Actions(driver);
			
			builder.moveToElement(obj).perform();
		reportStep("The mousehover with the xpath "+xpathVal+" is clicked", "pass");	
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with the xpath "+xpathVal+" is not found in the DOM");
			reportStep("The element with the xpath "+xpathVal+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
		//	System.err.println("The Element with the xpath "+xpathVal+" is not visible in the application");
			reportStep("The Element with the xpath "+xpathVal+" is not visible in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
		//	System.err.println("The element with the xpath "+xpathVal+" is not stable");
			reportStep("The element with the xpath "+xpathVal+" is not stable", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The element with the xpath "+xpathVal+" is not found due to unknown error");
			reportStep("The element with the xpath "+xpathVal+" is not found due to unknown error", "fail");
		}
		
		
		
		
	}
	public void verifyTextNotContainsByXpath(String xpathVal, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText = driver.findElementByXPath(xpathVal).getText();
			if(!actualText.contains(text)) {
			//	System.out.println("The element with the xpath"+xpathVal+" is not matched with the expected text"+text);
				reportStep("The element with the xpath "+xpathVal+" is not matched with the expected text"+text, "pass");
			}else {
			//	System.out.println("the element with the xpath"+xpathVal+" is matched with the expected text"+text);
				reportStep("The element with the xpath "+xpathVal+" is  matched with the expected text"+text, "fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with the xpath "+xpathVal+" is not found in the DOM");
			reportStep("The element with the xpath "+xpathVal+" is not found in the DOM", "fail");
			}catch (ElementNotVisibleException e) {
				// TODO: handle exception
			//	System.err.println("The element with the xpath "+xpathVal+" is not visible in the application");
				reportStep("The element with the xpath "+xpathVal+" is not visible in the application", "fail");
			}catch (StaleElementReferenceException e) {
				// TODO: handle exception
			//	System.err.println("The element with the xpath "+xpathVal+" is not stable");
				reportStep("The element with the xpath "+xpathVal+" is not stable", "fail");
			}catch (WebDriverException e) {
				// TODO: handle exception
			//	System.err.println("The elemnt with the xpath "+xpathVal+" is not found due to unknown error");
				reportStep("The elemnt with the xpath "+xpathVal+" is not found due to unknown error", "fail");
			}
	}
	}
	
	


