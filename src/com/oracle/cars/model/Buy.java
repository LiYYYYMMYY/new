package com.oracle.cars.model;

import java.io.Serializable;

/**
 * Buy 儌僨儖僋儔僗.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Buy implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** name. */
	private String name;

	/** buyid. */
	private String buyid;

	/** carid. */
	private String carid;

	/** buyprice. */
	private Integer buyprice;

	/**
	 * 僐儞僗僩儔僋僞.
	 */
	public Buy() {
	}

	/**
	 * name 傪愝掕偟傑偡.
	 * 
	 * @param name
	 *            name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * name 傪庢摼偟傑偡.
	 * 
	 * @return name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * buyid 傪愝掕偟傑偡.
	 * 
	 * @param buyid
	 *            buyid
	 */
	public void setBuyid(String buyid) {
		this.buyid = buyid;
	}

	/**
	 * buyid 傪庢摼偟傑偡.
	 * 
	 * @return buyid
	 */
	public String getBuyid() {
		return this.buyid;
	}

	/**
	 * carid 傪愝掕偟傑偡.
	 * 
	 * @param carid
	 *            carid
	 */
	public void setCarid(String carid) {
		this.carid = carid;
	}

	/**
	 * carid 傪庢摼偟傑偡.
	 * 
	 * @return carid
	 */
	public String getCarid() {
		return this.carid;
	}

	/**
	 * buyprice 傪愝掕偟傑偡.
	 * 
	 * @param buyprice
	 *            buyprice
	 */
	public void setBuyprice(Integer buyprice) {
		this.buyprice = buyprice;
	}

	/**
	 * buyprice 傪庢摼偟傑偡.
	 * 
	 * @return buyprice
	 */
	public Integer getBuyprice() {
		return this.buyprice;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((buyid == null) ? 0 : buyid.hashCode());

		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Buy other = (Buy) obj;
		if (buyid == null) {
			if (other.buyid != null) {
				return false;
			}
		} else if (!buyid.equals(other.buyid)) {
			return false;
		}

		return true;
	}

}