package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelList extends GenericWrappers {

	public SelectedHotelBookingPage selectHotel() {
		clickByXpath(prop.getProperty("IrctcHotelListPage.selectFirstHotelHotel.Xpath"));
		return new SelectedHotelBookingPage();
	}
	public HotelList waitForPageUpload(long time) {
		waitProperty(time);
		return this;
	}
}
