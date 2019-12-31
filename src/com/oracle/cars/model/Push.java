package com.oracle.cars.model;

import java.io.Serializable;
import java.sql.Blob;

/**
 * Push 儌僨儖僋儔僗.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Push implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** haibao. */
	private String haibao;

	/** guanggao. */
	private String guanggao;

	/** daili. */
	private Blob daili;

	/**
	 * 僐儞僗僩儔僋僞.
	 */
	public Push() {
	}

	/**
	 * haibao 傪愝掕偟傑偡.
	 * 
	 * @param haibao
	 *            haibao
	 */
	public void setHaibao(String haibao) {
		this.haibao = haibao;
	}

	/**
	 * haibao 傪庢摼偟傑偡.
	 * 
	 * @return haibao
	 */
	public String getHaibao() {
		return this.haibao;
	}

	/**
	 * guanggao 傪愝掕偟傑偡.
	 * 
	 * @param guanggao
	 *            guanggao
	 */
	public void setGuanggao(String guanggao) {
		this.guanggao = guanggao;
	}

	/**
	 * guanggao 傪庢摼偟傑偡.
	 * 
	 * @return guanggao
	 */
	public String getGuanggao() {
		return this.guanggao;
	}

	/**
	 * daili 傪愝掕偟傑偡.
	 * 
	 * @param daili
	 *            daili
	 */
	public void setDaili(Blob daili) {
		this.daili = daili;
	}

	/**
	 * daili 傪庢摼偟傑偡.
	 * 
	 * @return daili
	 */
	public Blob getDaili() {
		return this.daili;
	}


}
