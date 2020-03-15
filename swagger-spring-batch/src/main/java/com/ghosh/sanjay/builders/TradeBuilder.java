package com.ghosh.sanjay.builders;

import org.springframework.batch.item.file.transform.FieldSet;

import com.ghosh.sanjay.domain.Trade;

public class TradeBuilder {

	private Trade trade;
	private FieldSet fieldSet;

	public TradeBuilder(FieldSet fieldSet) {
		this.fieldSet = fieldSet;
	}

	public Trade get() {
		return trade;
	}

	public TradeBuilder withId() {
		trade.setId(fieldSet.readString("Id"));		
		return this;
	}

	public TradeBuilder withRef() {
		trade.setRef(fieldSet.readString("Ref"));		
		return this;
	}

	public TradeBuilder withTrade() {
		trade.setTradeDenom(fieldSet.readString("Trade"));		
		return this;
	}
	
	public TradeBuilder withSomeThing() {
		trade.setSomeThing(fieldSet.readString("SomeThing"));		
		return this;
	}
}