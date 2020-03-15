package com.ghosh.sanjay.domain;

public class Trade {

	private String Id;
	private String tradeDenom;
	private String ref;
	private String someThing;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getTradeDenom() {
		return tradeDenom;
	}

	public void setTradeDenom(String tradeDenom) {
		this.tradeDenom = tradeDenom;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getSomeThing() {
		return someThing;
	}

	public void setSomeThing(String someThing) {
		this.someThing = someThing;
	}

	@Override
	public String toString() {
		return new StringBuilder("Trade=[ ").append(" id " + Id).append(" tradeDenom " + tradeDenom).append(" ref " + ref)
				.append(" someThing " + someThing).append("] ").toString();
	}

}