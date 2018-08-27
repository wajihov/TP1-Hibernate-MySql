package com.mkyong.common;

import java.io.Serializable;

public class Stock implements Serializable {

	private static final long serialVersionUID = 7029806795746254329L;

	private Integer stockId;
	private String stockCode;
	private String stockName;

	public Integer getStockId() {
		return stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	public String getStockCode() {
		return stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public Stock() {
		super();
	}

	public Stock(String stockCode, String stockName) {
		super();
		this.stockCode = stockCode;
		this.stockName = stockName;
	}

}