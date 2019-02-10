package com.singleton.li.pattern;

public class DoubleSafeNoCopyAccount extends InstanceStatistics implements Cloneable {
	private static DoubleSafeNoCopyAccount doubleSafeNoCopyAccount;
	private int i;

	private DoubleSafeNoCopyAccount() {
	}

	public static DoubleSafeNoCopyAccount getDoubleSafeNoCopyAccount() {
		if (doubleSafeNoCopyAccount == null) {
			synchronized (DoubleSafeNoCopyAccount.class) {
				if (doubleSafeNoCopyAccount == null) {
					doubleSafeNoCopyAccount = new DoubleSafeNoCopyAccount();
				}
			}
		}

		return doubleSafeNoCopyAccount;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("cloning is not allowed");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + i;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		DoubleSafeNoCopyAccount other = (DoubleSafeNoCopyAccount) obj;
		if (i != other.i)
			return false;
		return true;
	}

	public int superHashCode() {
		return super.hashCode();
	}

}
