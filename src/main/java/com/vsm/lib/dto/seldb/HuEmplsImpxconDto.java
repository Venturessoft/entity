package com.vsm.lib.dto.seldb;

import java.math.BigDecimal;

public class HuEmplsImpxconDto{
	private long numCia;
	private long numEmp;
	private long idImporte;
	private BigDecimal concepto;
	private BigDecimal importe;
	private String moneda;
	private String status;
	/**
	 * @return the numCia
	 */
	public long getNumCia() {
		return numCia;
	}
	/**
	 * @param numCia the numCia to set
	 */
	public void setNumCia(long numCia) {
		this.numCia = numCia;
	}
	/**
	 * @return the numEmp
	 */
	public long getNumEmp() {
		return numEmp;
	}
	/**
	 * @param numEmp the numEmp to set
	 */
	public void setNumEmp(long numEmp) {
		this.numEmp = numEmp;
	}
	/**
	 * @return the idImporte
	 */
	public long getIdImporte() {
		return idImporte;
	}
	/**
	 * @param idImporte the idImporte to set
	 */
	public void setIdImporte(long idImporte) {
		this.idImporte = idImporte;
	}
	/**
	 * @return the concepto
	 */
	public BigDecimal getConcepto() {
		return concepto;
	}
	/**
	 * @param concepto the concepto to set
	 */
	public void setConcepto(BigDecimal concepto) {
		this.concepto = concepto;
	}
	/**
	 * @return the importe
	 */
	public BigDecimal getImporte() {
		return importe;
	}
	/**
	 * @param importe the importe to set
	 */
	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}
	/**
	 * @return the moneda
	 */
	public String getMoneda() {
		return moneda;
	}
	/**
	 * @param moneda the moneda to set
	 */
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
