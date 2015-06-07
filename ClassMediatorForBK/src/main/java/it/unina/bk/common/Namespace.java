package it.unina.bk.common;

public class Namespace {

	private String prefix;
	private String value;

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "xmlns:" + prefix + "=" + value;
	}

}
