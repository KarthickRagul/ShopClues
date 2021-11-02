package com.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ShopCluesPages {

    WebDriver driver;	
    @FindBy(xpath="//*[@id=\"sign-in\"]/a")
    WebElement signIn;
    public WebElement getSignInBtn() {
    	return signIn;
    } 
    @FindBy(xpath="/html/body/div[1]/div/div/div[3]/div[1]/button[1]")
    WebElement popUp;
    public WebElement getPopUp() {
          	return popUp;
    }
    @FindBy(id="login_via_otp")
    WebElement otpBtn;
    public WebElement getOtpBtn()
    {
    	return otpBtn;
    }
    @FindBy(name="user_login")
    WebElement userLoginEmailTxtField;
          public WebElement getUserLoginEmailTxtField() {
            return userLoginEmailTxtField;
    }
    @FindBy(name="password")
    WebElement userPasswordField;
          public WebElement getUserPasswordField() {
             return userPasswordField;
    }
    @FindBy(id="login_button")
    WebElement loginSubmitBtn;
          public WebElement getLoginSubmitBtn() {
             return loginSubmitBtn;
    }    
    @FindBy(xpath="//*[@id=\"loginModelBox\"]/div/div[2]/div[11]/div/form/div[3]/div/a")
    WebElement skipBtn;
          public WebElement getSkipBtn() {
              return skipBtn;
    }   

    @FindBy(xpath="//*[@id=\"sc_uname\"]/a")
    WebElement profile;
    public WebElement getProfile() {
          	return profile;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //Karthick_New
    @FindAll(@FindBy(tagName="a"))
    List<WebElement> links;
    public List<WebElement> getLinks()
    {
    	return links;
    }
    @FindBy(xpath="/html/body/div[4]/div/div/div[4]/div/a")
    WebElement locationBtn;
    public WebElement getLocationBtn() {
          	return locationBtn;
    }
    @FindBy(xpath="//*[@id=\"pin_code_popup\"]")
    WebElement pincodeTextBox;
    public WebElement getPincodeTextBox() {
          	return pincodeTextBox;
    }
    @FindBy(xpath="//*[@id=\"get_pincode_popup\"]")
    WebElement LocationSubmit;
    public WebElement getLocationSubmit() {
          	return LocationSubmit;
    }
    @FindBy(id="cPin")
    WebElement pinCode;
    public WebElement getcPin() {
          	return pinCode;
    }
    @FindBy(xpath="//*[@id=\"common_overlay\"]/div[2]/a")
    WebElement cancel;
    public WebElement getCancel() {
          	return cancel;
    }
    
  
    //Code of Rakshantha_New
    
    
    @FindBy(id = "autocomplete")
	WebElement SearchTextField;
	public WebElement getSearchTextField1() {
		return SearchTextField;

	}

	@FindBy(xpath ="//*[@id=\"search\"]/input[2]")
	WebElement Searchbtn1;
	public WebElement getSearchBtn1() {
		return Searchbtn1;
	}

	
	 @FindAll(@FindBy(id="search-result"))
	 List<WebElement> List;
     public List<WebElement> getSuggestion()
     {		
	    return List;
			 
     }

	  @FindBy(xpath ="//*[@id=\"shopClues_surety_fct\"]/li/label")
	  WebElement Surety;

	  public WebElement getsurety() {
		return Surety;
	  }
      @FindBy(xpath="//*[@id=\"by_combo_fct\"]/li/label")
      WebElement combo;
 	 public WebElement getCombo() {
 		return combo;
 	}
	
      
 	 //Lakshmi Priya_NEW
 	 
        @FindBy(xpath="/html/body/div[1]/div/div/div[3]/div[1]/button[1]")
	    WebElement popUp1;
	    public WebElement getPopUp1() {
	          	return popUp;
	    }
	  
	    @FindAll(@FindBy(xpath="//*[@class='column col3 search_blocks' or @class='no_fnd']" ))
	    List<WebElement> AllItem;
	    public List<WebElement> getAllItem(){
	    	return AllItem;
	    }
 	 
 	 //Code of Praveennandha New
 	 
	 
		@FindAll(@FindBy(className="seaches_sugge"))
		List<WebElement> TrendingSearch1;
		public List<WebElement> getTrendingSearch1()
		{
			return TrendingSearch1;
		}
		@FindAll(@FindBy(id="search-result"))
		List<WebElement> suggestion;
		public List<WebElement> getSuggestions1()
		{
			return suggestion;
		}
		@FindAll(@FindBy(xpath="//*[@id=\"search\"]/input[2]"))
		WebElement searchButton;
		public WebElement getSearchButton()
		{
			return searchButton;
		}
		
		@FindAll(@FindBy(xpath="//*[@id=\"product_list\"]/div[3]"))
		List<WebElement> searchResults;
		public List<WebElement> getSearchResults()
		{
			return searchResults;
		}
		
		@FindBy(xpath="//*[@id=\"product_list\"]/div[3]/div[2]")
		
		WebElement firstProduct;
		public WebElement getProduct(){
			return firstProduct;
		}
		@FindBy(id="add_cart")
		WebElement addToCartButton;
		public WebElement getAddtoCart() {
			return addToCartButton;
		}

		@FindBy(xpath="//*[@id=\"main_data\"]/div[2]/div[2]/h1")              
		WebElement productName;
		public WebElement getProductName()
		{
			return productName;
		}
		@FindBy(className="txt_elipcis")
		WebElement cartProductName;
		public WebElement getCartProductName()
		{
			return cartProductName;
		}
		@FindBy(className="qCart")
		WebElement cart;
		public WebElement getCart()
		{
			return cart;
		}
		@FindBy(className="plus")
		WebElement plus;
		public WebElement getPlus() {
			return plus;
		}
	    
		@FindBy(className="minus")
		WebElement minus;
		public WebElement getMinus() {
			return minus;
		}
		@FindBy(xpath="//*[@id=\"search-result\"]/li[3]")
		WebElement suggestText;
		public WebElement getSuggestText()
		{
			return suggestText;
		}
		
		@FindBy(xpath="/html/body/div[3]/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/span/input")
		WebElement value;
		public WebElement getVal() {
			return value;
		}
		public ArrayList<String> getWindowHandles()
		{
			return new ArrayList<String>(driver.getWindowHandles());
		}
 	 
 	 
 	 
 	 
 	 
 	
 	 
 	 
 	 
 	 
 	 
 	 
 	 //Code of Shobika
   
	@FindBy(xpath="//*[@id=\"sc_uname\"]/a")
	WebElement Profilelink;
	
	public WebElement getProfilelink() {
		return Profilelink;
	}
	@FindBy(xpath="//*[@id=\"sc_uname\"]/div/ul/li[4]/a")
	WebElement MyProfile;
	
	public WebElement getMyProfile() {
		return MyProfile;
	}
	
	@FindBy(id="firstname")
	WebElement firstName;
	
	public WebElement getFirstName() {
		return firstName;
	}
	
	@FindBy(id="lastname")
	WebElement lastName;
	
	public WebElement getLastName() {
		return lastName;
	}
	
	@FindBy(id="phone")
	WebElement Phone;
	
	public WebElement getPhone() {
		return Phone;
	}
	
	@FindBy(id="email")
	WebElement email_id;
	
	public WebElement getEmail_id() {
		return email_id;
	}
	
	@FindBy(id="save_profile_but")
	WebElement submitBtn;
	
	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	@FindBy(id="gnd-radio-1-1")
	WebElement maleRadioBtn;
	
	public WebElement getMaleRadioBtn() {
		return maleRadioBtn;
	}
	
	
	@FindBy(linkText="My Address Book")
	WebElement addressField;
	
	public WebElement getAddressField() {
		return addressField;
	}
	
	@FindBy(linkText="Add New Address")
	WebElement newAddressField;
	
	public WebElement getNewAddressField() 
	{
		return newAddressField;
	}
	
	@FindBy(name="first_name")
	WebElement first_Name;
	
	public WebElement getFirst_Name() {
		return first_Name;
	}
	
	@FindBy(name="last_name")
	WebElement last_Name;
	
	public WebElement getLast_Name() {
		return last_Name;
	}
	
	@FindBy(name="phone")
	WebElement mobileNo;
	
	public WebElement getMobileNo() {
		return mobileNo;
	}
	
	@FindBy(name="zipcode")
	WebElement zipcode;
	
	public WebElement getZipcode() {
		return zipcode;
	}
	
	@FindBy(name="address")
	WebElement plotNo;
	
	public WebElement getPlotNo() {
		return plotNo;
	}
	

	@FindBy(name="address_2")
	WebElement street;
	
	public WebElement getStreet() {
		return street;
	}
	
	@FindBy(name="city")
	WebElement city;
	
	public WebElement getCity() {
		return city;
	}
	
	@FindAll(@FindBy(id="statesTN"))
	WebElement stateName;

	public WebElement getStateName() {
		return stateName;
	}
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[2]/div/div/div[1]/div[5]/div/div/div[2]/div/div/div/div[2]/div[2]/div/form/fieldset/div[5]/ul/li[2]/label")
	WebElement selectHome;
	
	public WebElement getSelectHome() {
		return selectHome;
	}
	
	@FindBy(xpath="//*[@id=\"del_addressbook\"]/div/div[2]/input")
	WebElement saveButton;
	
	public WebElement getSaveButton() {
		return saveButton;
	}
	@FindBy(linkText = "Home")
	WebElement HomeBtn;
	public WebElement getHomeBtn() {
		return HomeBtn;
	}
    @FindBy(xpath="//*[@id=\"sc_uname\"]/a")
    WebElement signOut;
    public WebElement getSignOut() {
          	return signOut;
    }
    //Code of Rakshantha
      
    @FindBy(xpath = "//*[@id=\"autocomplete\"]")
	WebElement SearchTextFields;
	public WebElement getSearchTextField() {
		return SearchTextFields;

	}

	@FindBy(xpath ="//*[@id=\"search\"]/input[2]")
	WebElement Searchbtn;
	public WebElement getSearchBtn() {
		return Searchbtn;
	}

	@FindAll (@FindBy(id="search-result"))
	List<WebElement> sugesstions;
    public List<WebElement> getSugesstions()
    {		
			 return sugesstions;
			 
	}
    
//	@FindBy(xpath="//*[@id=\"product_list\"]/div[3]/div[3]")
//
//	WebElement firstProductWishlist;
//	public WebElement getFirstProductWishlist(){
//	return firstProductWishlist;
//	}
	
	@FindBy(id="pdp_wishlist")
	WebElement Wishlist;

	public WebElement getWishlist() {
		return Wishlist;
	}
	//Code of Praveennandha
	@FindAll(@FindBy(className="seaches_sugge"))
	List<WebElement> TrendingSearch;
	public List<WebElement> getTrendingSearch()
	{
	return TrendingSearch;
	}
	@FindAll(@FindBy(className="seaches_sugge"))
	List<WebElement> suggestions;
	public List<WebElement> getSuggestions()
	{
	return suggestions;
	}
//	@FindAll(@FindBy(xpath="//*[@id=\"search\"]/input[2]"))
//	WebElement searchButton;
//	public WebElement getSearchButton()
//	{
//	return searchButton;
//	}
//
//	@FindAll(@FindBy(xpath="//*[@id=\"product_list\"]/div[3]"))
//	List<WebElement> searchResults;
//	public List<WebElement> getSearchResults()
//	{
//	return searchResults;
//	}
//
	@FindBy(xpath="//*[@id=\"product_list\"]/div[3]/div[3]")

	WebElement firstProduct1;
	public WebElement getFirstProduct(){
	return firstProduct1;
	}
//	@FindBy(id="add_cart")
//	WebElement addToCartButton;
//	public WebElement getAddtoCart() {
//	return addToCartButton;
//	}
//	@FindBy(xpath="//*[@id=\"main_data\"]/div[2]/div[2]/h1")
//	WebElement productName;
//	public WebElement getProductName()
//	{
//	return productName;
//	}
//	@FindBy(xpath="//*[@id=\"97386846_175374236\"]/div[2]/div[1]/h5")
//	WebElement cartProductName;
//	public WebElement getCartProductName()
//	{
//	return cartProductName;
//	}
//	@FindBy(className="cart_ic")
//	WebElement cart;
//	public WebElement getCart()
//	{
//	return cart;
//	}
	public ArrayList<String> getWindowHandlesSearch()
	{
	return new ArrayList<String>(driver.getWindowHandles());
	}
	// Code of Lakshmi Priya
	@FindBy(xpath="//*[@id=\"gt-cart-price\"]/a/div")
	WebElement PlaceOrder;
	public WebElement getPlaceOrder() {
		return PlaceOrder;
	}
	@FindBy(xpath="//*[@id=\"cart_data\"]/h2")
	WebElement TotalItem;
	public WebElement getTotalItem() {
		return TotalItem;
	}
	@FindBy(className="txt_elipcis")
	List<WebElement> Items;
	public List<WebElement> getItems() {
		return Items;
	}
	
	@FindBy(xpath="//*[@id=\"mCSB_2_container\"]/div[1]/div/a")
	WebElement ChangeAddress;
	public WebElement getChangeAddress() {
		return ChangeAddress;
	}
	@FindBy(linkText="New Address")
	WebElement NewAddress;
	public WebElement getNewAddress() {
		return NewAddress;
	}
	@FindBy(xpath="/html/body/div[6]/div[2]/div/div/ul/div/div[1]/li/div/a")
	WebElement EditAddressBtn;
	public WebElement getEditAddressBtn() {
		return EditAddressBtn;
	}
	
	@FindBy(id="s_phone")
	WebElement EditPhNo;
	public WebElement getEditPhNo() {
		return EditPhNo;
	}
	@FindBy(id="s_address")
	WebElement EditPlotNo;
	public WebElement getEditPlotNo() {
		return EditPlotNo;
	}
	@FindBy(id="s_address_2")
	WebElement EditAddress;
	public WebElement getEditAddress() {
		return EditAddress;
	}
	
	@FindBy(id="adrs-radio-1-2")
	WebElement EditAddressType;
	public WebElement getEditAddressType() {
		return EditAddressType;
	}
	
	@FindBy(xpath="//*[@id=\"submit_btn\"]/span/input") 
	WebElement SaveBtn;
	public WebElement getSaveBtn() {
		return SaveBtn;
	}
	@FindBy(xpath="//*[@id=\"get_address_btn\"]") 
	WebElement ContinueBtn;
	public WebElement getContinueBtn() {
		return ContinueBtn;
	}
	@FindBy(id="proceed_to_payment_button")
	WebElement ProceedToPayBtn;
	public WebElement getProceedToPayBtn() {
		return ProceedToPayBtn;
	}
    // Code of Akash
    @FindBy(id="nav_0")
	WebElement globalShoppingLink;
	
	@FindBy(xpath="//*[@id=\"ul_pc_header_setting_info\"]/li/a")
	WebElement createAccountLink;
	
	@FindBy(xpath="//*[@id=\"signInContent\"]/div[2]/div[2]/a[1]")
	WebElement loginPopUpBtn;
	
	@FindBy(id="main_user_login")
	WebElement usernameField;
	
	@FindBy(name="password")
	WebElement passwordField;
	
	@FindBy(id="login_button")
	WebElement loginBtn;
	
	@FindBy(xpath="//*[@id=\"ul_pc_header_setting_info\"]/li[2]/a")
	WebElement signOutLink;
	
	ArrayList<String> windowHandles;

	public WebElement getGlobalShoppingLink() 
	{
		return globalShoppingLink;
	}

	public WebElement getCreateAccountLink() 
	{
		return createAccountLink;
	}
	
//	public ArrayList<String> getWindowHandles()
//	{
//		return new ArrayList<String>(driver.getWindowHandles());
//	}

	public WebElement getLoginPopUpBtn() 
	{
		return loginPopUpBtn;
	}

	public WebElement getUsernameField() 
	{
		return usernameField;
	}
	
	public WebElement getPasswordField() 
	{
		return passwordField;
	}
	
	public WebElement getLoginBtn() 
	{
		return loginBtn;
	}

	public WebElement getSignOutLink() 
	{
		return signOutLink;
	}

	public ShopCluesPages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
