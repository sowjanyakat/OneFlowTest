package PageObjects;

import Selectors.WebElements;
import Support.Driver;
import Support.Waits;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SearchPage extends Driver {
    public static void searchProduct() throws InterruptedException {

        driver.findElement(By.xpath(WebElements.searchfield)).sendKeys(WebElements.searchTerm);
        Thread.sleep(2000);
        Actions act = new Actions(driver);
        act.sendKeys(WebElements.searchfield, Keys.ENTER);
        Waits.implicitWait();


    }
    public static void  displayMessage() throws InterruptedException {
        if (WebElements.getText.contains(WebElements.searchTerm))
            System.out.println("Item found");
        else
        {
            Waits.implicitWait();
            System.out.println("Item not found  .....\n");
            Thread.sleep(2000);
            getCurrentUrl();}
    }
    public static void getCurrentUrl()
    {
        driver.navigate().to(driver.getCurrentUrl());
    }
    public static void addproductToCart()
    {
        driver.findElement(By.xpath(WebElements.addProduct)).click();
        System.out.println("Item added to the cart\n");
    }
   public static void displayMessagewhenadditemtocart()
   {
       if(driver.findElement(By.xpath(WebElements.iteminthecart)).isDisplayed())
           System.out.println("The item added to the cart successfully \n");
   }
   public static void updateItem() throws InterruptedException {
       int quantity_before_update=Integer.parseInt(driver.findElement(By.xpath(WebElements.quantity)).getText());
       System.out.println("Quantity before update   "+ quantity_before_update+"\n");
       driver.findElement(By.xpath(WebElements.increaseQuantity)).click();
       Thread.sleep(2000);
       int quantity_After_update=Integer.parseInt(driver.findElement(By.xpath(WebElements.quantity)).getText());
       System.out.println("Quantity After update   "+quantity_After_update+"\n");
       driver.findElement(By.xpath(WebElements.decreaseQuantity)).click();
       Thread.sleep(2000);



   }
   public static void checkPrice()
   {

        String pricebeforeUpdate=driver.findElement(By.xpath(WebElements.price)).getText();
       System.out.println("Price before update   "+pricebeforeUpdate+"\n");
       driver.findElement(By.xpath(WebElements.increaseQuantity)).click();
       Waits.implicitWait();
       String priceAfterUpdate=driver.findElement(By.xpath(WebElements.price)).getText();
       System.out.println("Price after update  "+priceAfterUpdate+"\n");
       if(pricebeforeUpdate!=priceAfterUpdate)
           System.out.println("Item get updated\n");

   }
   public static void removeItem()
   {
       driver.findElement(By.xpath(WebElements.removecartitem)).click();

   }
   public static void removeitemDisplayMessage()
   {
       if(driver.findElement(By.xpath(WebElements.iteminthecart)).isDisplayed())
           System.out.println("Cart item should be removed from the list....\n");
   }
    }

