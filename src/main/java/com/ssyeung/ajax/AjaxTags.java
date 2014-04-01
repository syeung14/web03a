package com.ssyeung.ajax;

import java.util.Date;

public class AjaxTags {
	private Date fromDate;
	private Date toDate;

	private String yourFavFw;

	public AjaxTags() {

	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public String execute() {

		return "success";
	}

	public String getYourFavFw() {
		return yourFavFw;
	}

	public void setYourFavFw(String yourFavFw) {
		this.yourFavFw = yourFavFw;
	}

}
