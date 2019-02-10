package org.fireweb.web2.metadata;

public class ForwardMetadata {
	protected String forwardName;
	protected String page;

	public ForwardMetadata(String forwardName, String page) {
		super();
		this.forwardName = forwardName;
		this.page = page;
	}

	public String getForwardName() {
		return forwardName;
	}

	public void setForwardName(String forwardName) {
		this.forwardName = forwardName;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

}
