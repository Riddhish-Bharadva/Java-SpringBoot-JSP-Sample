package com.rab.Java_JB_JSP;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data
{
	@JsonProperty("userId")
	private int userId;
	@JsonProperty("currencyFrom")
	private String currFrom;
	@JsonProperty("currencyTo")
	private String currTo;
	@JsonProperty("amountSell")
	private double amountSell;
	@JsonProperty("amountBuy")
	private double amountBuy;
	@JsonProperty("rate")
	private double rate;
	@JsonProperty("timePlaced")
	private String timePlaced;
	@JsonProperty("originatingCountry")
	private String originCountry;

// Start of Getters.
	public int getUserId() {
		return userId;
	}
	public String getCurrFrom() {
		return currFrom;
	}
	public String getCurrTo() {
		return currTo;
	}
	public double getAmountSell() {
		return amountSell;
	}
	public double getAmountBuy() {
		return amountBuy;
	}
	public double getRate() {
		return rate;
	}
	public String getTimePlaced() {
		return timePlaced;
	}
	public String getOriginCountry() {
		return originCountry;
	}
// End of Getters.

// Start of Setters.
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setCurrFrom(String currFrom) {
		this.currFrom = currFrom;
	}
	public void setCurrTo(String currTo) {
		this.currTo = currTo;
	}
	public void setAmountSell(double amountSell) {
		this.amountSell = amountSell;
	}
	public void setAmountBuy(double amountBuy) {
		this.amountBuy = amountBuy;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public void setTimePlaced(String timePlaced) {
		this.timePlaced = timePlaced;
	}
	public void setOriginCountry(String originCountry) {
		this.originCountry = originCountry;
	}
// End of Setters.
}
