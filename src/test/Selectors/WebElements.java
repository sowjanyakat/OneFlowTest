package Selectors;

public class WebElements {
    public static final String webDriverPath="C:/Users/Sreehari/Downloads/chromedriver_win32/";
    public static final String ReferenceUrl="https://vuejs.mikesprague.me/shopping-cart/";
    public static final String searchfield="//input[@type='text']";
    public static final String searchTerm="PenDrive";
    public static final String getText="//div[@class='row'][2]";
    public static final String addProduct="//div[@class='col-sm-12'][3]//button[@title='Add to Cart']";
    public static final String totalprice="//div[@class='col-xs-3 text-right']//small";
    public static final String iteminthecart="//li[1]//div[@class='col-xs-9']//small[2]";
    public static final String removecartitem="//li[1]//div[@class='col-xs-3 text-right']//button[@title='Remove From Cart']";
    public static final String quantity="//li[1]//div[@class='col-xs-9']//small[1]";
    public static final String increaseQuantity="//li[1]//div[@class='col-xs-9']//button[@title='Add One']";
    public static final String price="//li[1]//div[@class='col-xs-3 text-right']//small[1]";
    public static final String decreaseQuantity="//li[1]//div[@class='col-xs-9']//button[@title='Remove One']";
}
