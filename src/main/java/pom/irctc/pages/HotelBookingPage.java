package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelBookingPage extends GenericWrappers {
	
	public HotelBookingPage switchToWindow2() {
		switchToLastWindow();
		return this;
	}
	
	public HotelBookingPage enterCity(String data) {
		enterByXpath(prop.getProperty("IrctcHotelBookingPage.enterCity.Xpath"), data);
		return this;
	}
	public HotelBookingPage clickCity() {
		clickByXpath(prop.getProperty("IrctcHotelBookingPage.clickCity.Xpath"));
		return this;
	}
    public HotelBookingPage clickCheckInDate() {
    	clickByXpath(prop.getProperty("IrctcHotelBookingPage.clickCheckIn.Xpath"));
    	return this;
    }
    public HotelBookingPage selectCheckIndate() {
    	clickByXpath(prop.getProperty("IrctcHotelBookingPage.selectCheckIn.Xpath"));
    	return this;
    }
    public HotelBookingPage clickCheckOutDate() {
    	clickByXpath(prop.getProperty("IrctcHotelBookingPage.checkOut.Xpath"));
    	return this;
    }
    public HotelBookingPage selectCheckOutDate() {
    	clickByXpath(prop.getProperty("IrctcHotelBookingPage.selectCheckOut.Xpath"));
    	return this;
    }
    public HotelBookingPage clickHotelRoom() {
    	clickByXpath(prop.getProperty("IrctcHotelBookingPage.clickHotelRoom.Xpath"));
    	return this;
    }
    public HotelBookingPage selectHotelRoom(String value) {
    	selectValueByXpath(prop.getProperty("IrctcHotelBookingPage.selectHotelRoom.Xpath"), value);
    	return this;
    }
 
    public HotelBookingPage selectValueAdult(String value) {
    	selectValueByXpath(prop.getProperty("IrctcHotelBookingPage.selectValueAdult.Xpath"), value);
    	return this;
    }
    public HotelBookingPage clickDone() {
    	clickByXpath(prop.getProperty("IrctcHotelBookingPage.clickDone.Xpath"));
    	return this;
    }
    public HotelList clickFindHotels() {
    	clickByXpath(prop.getProperty("IrctcHotelBookingPage.clickFindhotels.Xpath"));
    	return new HotelList();
    }
    public HotelBookingPage waitPageUpload(long time) {
    	waitProperty(time);
    	return this;
    }
}
