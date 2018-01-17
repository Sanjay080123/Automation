package com.koovs.projectobjectrepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StyleStoriesMenu {
	
		@FindBy(xpath="//div[@id='bodyContent']//div[@class='ssMenu']/ul/li[1]/a")
		private WebElement allMenu;
		
		@FindBy(xpath="//div[@id='bodyContent']//div[@class='ssMenu']/ul/li[2]/a")
		private WebElement womenMenuStyleStories;
		
		@FindBy(xpath="//div[@id='bodyContent']//div[@class='ssMenu']/ul/li[3]/a")
		private WebElement menMenuStyleStories;
		
		@FindBy(xpath="//div[@id='bodyContent']//div[@class='ssMenu']/ul/li[4]/a")
		private WebElement twitterStyleStories;
		
		@FindBy(xpath="//div[@id='bodyContent']//div[@class='ssMenu']/ul/li[5]/a")
		private WebElement instagramStyleStories;
		
		@FindBy(xpath="//div[@id='bodyContent']//div[@class='ssMenu']/ul/li[6]/a")
		private WebElement koovsTVStyleStories;
		
		@FindBy(xpath="//div[@id='bodyContent']//div[@class='ssMenu']/ul/li[7]/a")
		private WebElement yourStories;
		
			/*
			 * Inside Men Women Menu
			 */
		
		@FindBy(xpath="//div[@id='bodyContent']//div[@class='ssInnerPageMenu']/ul/li[1]")
		private WebElement styleSpyDataFilter;
		
		@FindBy(xpath="//div[@id='bodyContent']//div[@class='ssInnerPageMenu']/ul/li[2]")
		private WebElement TrendsDataFilter;
		
		@FindBy(xpath="//div[@id='bodyContent']//div[@class='ssInnerPageMenu']/ul/li[3]")
		private WebElement TheHotListFilter;
		
		@FindBy(xpath="//div[@id='bodyContent']//div[@class='ssInnerPageMenu']/ul/li[4]")
		private WebElement howToWearDataFilter;
		
		@FindBy(xpath="//div[@id='bodyContent']//div[@class='ssInnerPageMenu']/ul/li[5]")
		private WebElement MustHaveMondayDataFilter;
		
		@FindBy(xpath="//div[@id='bodyContent']//div[@class='ssInnerPageMenu']/ul/li[6]")
		private WebElement ToDoListDataFilter;
		
		@FindBy(xpath="//div[@id='bodyContent']//div[@class='ssInnerPageMenu']/ul/li[7]")
		private WebElement TheEditDataFilter;
		
			/*
			 * Inside Instagram menu
			 */
		@FindBy(xpath="//div[@id='bodyContent']//div[@class='ssInsatagrmMenu']/ul/li[1]")
		private WebElement allInInstaMenu;
		
		@FindBy(xpath="//div[@id='bodyContent']//div[@class='ssInsatagrmMenu']/ul/li[2]")
		private WebElement koovsFasionMenu;
		
		@FindBy(xpath="//div[@id='bodyContent']//div[@class='ssInsatagrmMenu']/ul/li[3]")
		private WebElement KoovsManMenu;
		
			/*
			 * Show me more WEB ELEMENT
			 */
		
		@FindBy(xpath="//div[@id='ss_all_more']/div")
		private WebElement StyleStoriesHomePageShowMeMore;
		
		
		@FindBy(xpath="//div[@id='show_allfeatured_posts']/div")
		private WebElement WomenSHOWmeMORWelement;
		
			/*
			 * Women STYLE SPY LIST PAGE
			 */
		@FindBy(xpath="//a[@href='http://www.koovs.com/women/style-stories/style-spy/my-koovs-166']/img")
		private WebElement StyleSpyimage;
		
		@FindBy(xpath="//div[@id='HubContentPopUpdiv_166']/div/a")
		private WebElement readmoreSTYLEspy;
		
		@FindBy(xpath="//div[@id='HubContentPopUpdiv_166']/div/div/div/span")
		private WebElement addToStoriesStyleSpy;
		
			/*
			 * Women TRENDS LIST PAGE
			 */
		@FindBy(xpath="//a[@href='http://www.koovs.com/women/style-stories/trends/modern-vintage-110']/img")
		private WebElement trendsImage;
		
		@FindBy(xpath="//div[@id='HubContentPopUpdiv_110']/div/a")
		private WebElement readmoreTrends;
		
		@FindBy(xpath="//div[@id='HubContentPopUpdiv_110']/div/div/div/span")
		private WebElement addToStoriesTrends;
		
			/*
			 * Women THE HOT LIST PAGE
			 */
		@FindBy(xpath="//a[@href='http://www.koovs.com/women/style-stories/the-hotlist/the-december-hotlist-133']/img")
		private WebElement HOTLISTImage;
		
		@FindBy(xpath="//div[@id='HubContentPopUpdiv_133']/div/a")
		private WebElement readmoreHotList;
		
		@FindBy(xpath="//div[@id='HubContentPopUpdiv_133']/div/div/div/span")
		private WebElement addToStoriesHotList;
		
			/*
			 * Women HOW TO WEAR LIST PAGE
			 */
		@FindBy(xpath="//a[@href='http://www.koovs.com/women/style-stories/how-to-wear/party-153']/img")
		private WebElement HowToWearImage;
		
		@FindBy(xpath="//div[@id='HubContentPopUpdiv_153']/div/a")
		private WebElement readmoreHotToWear;
		
		@FindBy(xpath="//div[@id='HubContentPopUpdiv_153']/div/div/div/span")
		private WebElement addToStoriesHowtoWear;
		
			/*
			 * Women MUST HAVE MONDAY LIST PAGE
			 */
		@FindBy(xpath="//a[@href='http://www.koovs.com/women/style-stories/must-have-monday/gilty-pleasure-160']/img")
		private WebElement MondayListImage;
		
		@FindBy(xpath="//div[@id='HubContentPopUpdiv_160']/div/a")
		private WebElement readmoreMondayList;
		
		@FindBy(xpath="//div[@id='HubContentPopUpdiv_160']/div/div/div/span")
		private WebElement addToStoriesMondayList;
		
			/*
			 * Women To DO LIST PAGE
			 */
		@FindBy(xpath="//a[@href='http://www.koovs.com/women/style-stories/to-do-list/grub-fest-weekend-162']/img")
		private WebElement ToDoListImage;
		
		@FindBy(xpath="//div[@id='HubContentPopUpdiv_162']/div/a")
		private WebElement readmoreToDoList;
		
		@FindBy(xpath="//div[@id='HubContentPopUpdiv_162']/div/div/div/span")
		private WebElement addToStoriesToDoList;
		
			/*
			 * Women THE EDIT PAGE
			 */
		@FindBy(xpath="//a[@href='http://www.koovs.com/women/style-stories/the-edit/all-tied-up-165']/img")
		private WebElement EditImage;
		
		@FindBy(xpath="//div[@id='HubContentPopUpdiv_165']/div/a")
		private WebElement readmoreEditListPage;
		
		@FindBy(xpath="//div[@id='HubContentPopUpdiv_165']/div/div/div/span")
		private WebElement addToStoriesEditListPage;
		
			/*
			 * Men STYLE SPY LIST PAGE
			 */
		@FindBy(xpath="//a[@href='http://www.koovs.com/men/style-stories/style-spy/art-of-layering-164']/img")
		private WebElement MENStyleSpyImage;
		
		@FindBy(xpath="//div[@id='HubContentPopUpdiv_167']/div/a")
		private WebElement MENreadmoreStyleSpyListPage;
		
		@FindBy(xpath="//div[@id='HubContentPopUpdiv_167']/div/div/div/span")
		private WebElement MENaddToStoriesStyleSpyListPage;
		
			/*
			 * Men TRENDS LIST PAGE
			 */
		@FindBy(xpath="//a[@href='http://www.koovs.com/men/style-stories/trends/ice-blast-152']/img")
		private WebElement menTRENDSImage;
		
		@FindBy(xpath="//div[@id='HubContentPopUpdiv_152']/div/a")
		private WebElement menreadmoreTRENDSListPage;
		
		@FindBy(xpath="//div[@id='HubContentPopUpdiv_152']/div/div/div/span")
		private WebElement menaddToStoriesTRENDSListPage;	
		
			/*
			 * Men THE HOT LIST PAGE
			 */
		@FindBy(xpath="//a[@href='http://www.koovs.com/men/style-stories/the-hotlist/the-december-hotlist-141']/img")
		private WebElement menHotListImage;
		
		@FindBy(xpath="//div[@id='HubContentPopUpdiv_141']/div/a")
		private WebElement menreadmoreHotListPage;
		
		@FindBy(xpath="//div[@id='HubContentPopUpdiv_141']/div/div/div/span")
		private WebElement menaddToStoriesHotListPage;	
		
			/*
			 * Men HOW TO WEAR LIST PAGE
			 */
		
		@FindBy(xpath="//a[@href='http://www.koovs.com/men/style-stories/how-to-wear/green-97']/img")
		private WebElement menHowToWearImage;
		
		@FindBy(xpath="//div[@id='HubContentPopUpdiv_97']/div/a")
		private WebElement menreadmoreHowToWearListPage;
		
		@FindBy(xpath="//div[@id='HubContentPopUpdiv_97']/div/div/div/span")
		private WebElement menaddToStoriesHowToWearListPage;
		
			/*
			 * Men NEED IT NOW
			 */
		@FindBy(xpath="//a[@href='http://www.koovs.com/men/style-stories/need-it-now/add-that-shine-156']/img")
		private WebElement menNeedItNowImage;
		
		@FindBy(xpath="//div[@id='HubContentPopUpdiv_156']/div/a")
		private WebElement menreadmoreNeedItNowListPage;
		
		@FindBy(xpath="//div[@id='HubContentPopUpdiv_156']/div/div/div/span")
		private WebElement menaddToStoriesNeedItNowListPage;
		
			/*
			 * Men TO DO LIST Page
			 */
		@FindBy(xpath="//a[@href='http://www.koovs.com/men/style-stories/to-do-list/enchanted-valley-carnival-161']/img")
		private WebElement menToDoListImage;
		
		@FindBy(xpath="//div[@id='HubContentPopUpdiv_161']/div/a")
		private WebElement menreadmoreToDoListPage;
		
		@FindBy(xpath="//div[@id='HubContentPopUpdiv_161']/div/div/div/span")
		private WebElement menaddToStoriesToDoListPage;
		
			/*
			 * Men THE EDIT PAGE
			 */
		@FindBy(xpath="//a[@href='http://www.koovs.com/men/style-stories/the-edit/distressed-effect-167']/img")
		private WebElement menEditListImage;
		
		@FindBy(xpath="//div[@id='HubContentPopUpdiv_167']/div/a")
		private WebElement menreadmoreEditListPage;
		
		@FindBy(xpath="//div[@id='HubContentPopUpdiv_167']/div/div/div/span")
		private WebElement menaddToStoriesEditListPage;
		
			/*
			 * Twitter LIST page IMAGE
			 */
		@FindBy(xpath="//div[@id='twitter_ss_page']/div[2]/div[1]/div[1]/div/p/a")
		private WebElement twitterProductImage;
		
			/*
			 * Take ME BACK TO STYLE STORIES PAGE LINK
			 */
		@FindBy(xpath="//div[@id='bodyContent']/div/div[5]/a")
		private WebElement TakemeBackToStyleStories;
		
			/*
			 * DETAILED PAGE SOCIAL TOTAL FOOTER
			 */
		@FindBy(xpath="//div[@id='ssContentWrapper_166']/div[3]/div[2]/div/div/div")
		private WebElement DetailedPageTotalSocialFooter;
		
			
		

		/**
		 * @return the detailedPageTotalSocialFooter
		 */
		public WebElement getDetailedPageTotalSocialFooter() {
			return DetailedPageTotalSocialFooter;
		}

		/**
		 * @return the allMenu
		 */
		public WebElement getAllMenu() {
			return allMenu;
		}

		/**
		 * @return the womenMenuStyleStories
		 */
		public WebElement getWomenMenuStyleStories() {
			return womenMenuStyleStories;
		}

		/**
		 * @return the menMenuStyleStories
		 */
		public WebElement getMenMenuStyleStories() {
			return menMenuStyleStories;
		}

		/**
		 * @return the twitterStyleStories
		 */
		public WebElement getTwitterStyleStories() {
			return twitterStyleStories;
		}

		/**
		 * @return the instagramStyleStories
		 */
		public WebElement getInstagramStyleStories() {
			return instagramStyleStories;
		}

		/**
		 * @return the koovsTVStyleStories
		 */
		public WebElement getKoovsTVStyleStories() {
			return koovsTVStyleStories;
		}

		/**
		 * @return the yourStories
		 */
		public WebElement getYourStories() {
			return yourStories;
		}

		/**
		 * @return the styleSpyDataFilter
		 */
		public WebElement getStyleSpyDataFilter() {
			return styleSpyDataFilter;
		}

		/**
		 * @return the trendsDataFilter
		 */
		public WebElement getTrendsDataFilter() {
			return TrendsDataFilter;
		}

		/**
		 * @return the theHotListFilter
		 */
		public WebElement getTheHotListFilter() {
			return TheHotListFilter;
		}

		/**
		 * @return the howToWearDataFilter
		 */
		public WebElement getHowToWearDataFilter() {
			return howToWearDataFilter;
		}

		/**
		 * @return the mustHaveMondayDataFilter
		 */
		public WebElement getMustHaveMondayDataFilter() {
			return MustHaveMondayDataFilter;
		}

		/**
		 * @return the toDoListDataFilter
		 */
		public WebElement getToDoListDataFilter() {
			return ToDoListDataFilter;
		}

		/**
		 * @return the theEditDataFilter
		 */
		public WebElement getTheEditDataFilter() {
			return TheEditDataFilter;
		}

		/**
		 * @return the allInInstaMenu
		 */
		public WebElement getAllInInstaMenu() {
			return allInInstaMenu;
		}

		/**
		 * @return the koovsFasionMenu
		 */
		public WebElement getKoovsFasionMenu() {
			return koovsFasionMenu;
		}

		/**
		 * @return the koovsManMenu
		 */
		public WebElement getKoovsManMenu() {
			return KoovsManMenu;
		}

		
		/**
		 * @return the styleStoriesHomePageShowMeMore
		 */
		public WebElement getStyleStoriesHomePageShowMeMore() {
			return StyleStoriesHomePageShowMeMore;
		}

		/**
		 * @return the sHOWmeMORWelement
		 */
		public WebElement getSHOWmeMORWelement() {
			return WomenSHOWmeMORWelement;
		}

		/**
		 * @return the styleSpyimage
		 */
		public WebElement getStyleSpyimage() {
			return StyleSpyimage;
		}

		/**
		 * @return the readmoreSTYLEspy
		 */
		public WebElement getReadmoreSTYLEspy() {
			return readmoreSTYLEspy;
		}

		/**
		 * @return the addToStoriesStyleSpy
		 */
		public WebElement getAddToStoriesStyleSpy() {
			return addToStoriesStyleSpy;
		}

		/**
		 * @return the trendsImage
		 */
		public WebElement getTrendsImage() {
			return trendsImage;
		}

		/**
		 * @return the readmoreTrends
		 */
		public WebElement getReadmoreTrends() {
			return readmoreTrends;
		}

		/**
		 * @return the addToStoriesTrends
		 */
		public WebElement getAddToStoriesTrends() {
			return addToStoriesTrends;
		}

		/**
		 * @return the hOTLISTImage
		 */
		public WebElement getHOTLISTImage() {
			return HOTLISTImage;
		}

		/**
		 * @return the readmoreHotList
		 */
		public WebElement getReadmoreHotList() {
			return readmoreHotList;
		}

		/**
		 * @return the addToStoriesHotList
		 */
		public WebElement getAddToStoriesHotList() {
			return addToStoriesHotList;
		}

		/**
		 * @return the howToWearImage
		 */
		public WebElement getHowToWearImage() {
			return HowToWearImage;
		}

		/**
		 * @return the readmoreHotToWear
		 */
		public WebElement getReadmoreHotToWear() {
			return readmoreHotToWear;
		}

		/**
		 * @return the addToStoriesHowtoWear
		 */
		public WebElement getAddToStoriesHowtoWear() {
			return addToStoriesHowtoWear;
		}

		/**
		 * @return the mondayListImage
		 */
		public WebElement getMondayListImage() {
			return MondayListImage;
		}

		/**
		 * @return the readmoreMondayList
		 */
		public WebElement getReadmoreMondayList() {
			return readmoreMondayList;
		}

		/**
		 * @return the addToStoriesMondayList
		 */
		public WebElement getAddToStoriesMondayList() {
			return addToStoriesMondayList;
		}

		/**
		 * @return the toDoListImage
		 */
		public WebElement getToDoListImage() {
			return ToDoListImage;
		}

		/**
		 * @return the readmoreToDoList
		 */
		public WebElement getReadmoreToDoList() {
			return readmoreToDoList;
		}

		/**
		 * @return the addToStoriesToDoList
		 */
		public WebElement getAddToStoriesToDoList() {
			return addToStoriesToDoList;
		}

		/**
		 * @return the editImage
		 */
		public WebElement getEditImage() {
			return EditImage;
		}

		/**
		 * @return the readmoreEditListPage
		 */
		public WebElement getReadmoreEditListPage() {
			return readmoreEditListPage;
		}

		/**
		 * @return the addToStoriesEditListPage
		 */
		public WebElement getAddToStoriesEditListPage() {
			return addToStoriesEditListPage;
		}

		/**
		 * @return the mENStyleSpyImage
		 */
		public WebElement getMENStyleSpyImage() {
			return MENStyleSpyImage;
		}

		/**
		 * @return the mENreadmoreStyleSpyListPage
		 */
		public WebElement getMENreadmoreStyleSpyListPage() {
			return MENreadmoreStyleSpyListPage;
		}

		/**
		 * @return the mENaddToStoriesStyleSpyListPage
		 */
		public WebElement getMENaddToStoriesStyleSpyListPage() {
			return MENaddToStoriesStyleSpyListPage;
		}

		/**
		 * @return the menTRENDSImage
		 */
		public WebElement getMenTRENDSImage() {
			return menTRENDSImage;
		}

		/**
		 * @return the menreadmoreTRENDSListPage
		 */
		public WebElement getMenreadmoreTRENDSListPage() {
			return menreadmoreTRENDSListPage;
		}

		/**
		 * @return the menaddToStoriesTRENDSListPage
		 */
		public WebElement getMenaddToStoriesTRENDSListPage() {
			return menaddToStoriesTRENDSListPage;
		}

		/**
		 * @return the menHotListImage
		 */
		public WebElement getMenHotListImage() {
			return menHotListImage;
		}

		/**
		 * @return the menreadmoreHotListPage
		 */
		public WebElement getMenreadmoreHotListPage() {
			return menreadmoreHotListPage;
		}

		/**
		 * @return the menaddToStoriesHotListPage
		 */
		public WebElement getMenaddToStoriesHotListPage() {
			return menaddToStoriesHotListPage;
		}

		/**
		 * @return the menHowToWearImage
		 */
		public WebElement getMenHowToWearImage() {
			return menHowToWearImage;
		}

		/**
		 * @return the menreadmoreHowToWearListPage
		 */
		public WebElement getMenreadmoreHowToWearListPage() {
			return menreadmoreHowToWearListPage;
		}

		/**
		 * @return the menaddToStoriesHowToWearListPage
		 */
		public WebElement getMenaddToStoriesHowToWearListPage() {
			return menaddToStoriesHowToWearListPage;
		}

		/**
		 * @return the menNeedItNowImage
		 */
		public WebElement getMenNeedItNowImage() {
			return menNeedItNowImage;
		}

		/**
		 * @return the menreadmoreNeedItNowListPage
		 */
		public WebElement getMenreadmoreNeedItNowListPage() {
			return menreadmoreNeedItNowListPage;
		}

		/**
		 * @return the menaddToStoriesNeedItNowListPage
		 */
		public WebElement getMenaddToStoriesNeedItNowListPage() {
			return menaddToStoriesNeedItNowListPage;
		}

		/**
		 * @return the menToDoListImage
		 */
		public WebElement getMenToDoListImage() {
			return menToDoListImage;
		}

		/**
		 * @return the menreadmoreToDoListPage
		 */
		public WebElement getMenreadmoreToDoListPage() {
			return menreadmoreToDoListPage;
		}

		/**
		 * @return the menaddToStoriesToDoListPage
		 */
		public WebElement getMenaddToStoriesToDoListPage() {
			return menaddToStoriesToDoListPage;
		}

		/**
		 * @return the menEditListImage
		 */
		public WebElement getMenEditListImage() {
			return menEditListImage;
		}

		/**
		 * @return the menreadmoreEditListPage
		 */
		public WebElement getMenreadmoreEditListPage() {
			return menreadmoreEditListPage;
		}

		/**
		 * @return the menaddToStoriesEditListPage
		 */
		public WebElement getMenaddToStoriesEditListPage() {
			return menaddToStoriesEditListPage;
		}

		/**
		 * @return the twitterProductImage
		 */
		public WebElement getTwitterProductImage() {
			return twitterProductImage;
		}

		/**
		 * @return the takemeBackToStyleStories
		 */
		public WebElement getTakemeBackToStyleStories() {
			return TakemeBackToStyleStories;
		}
		
		
		

}
