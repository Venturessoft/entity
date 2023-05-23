package com.vsm.lib.dto.seldb;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class HuCatNivelEscolaridadDto {
	private long numCia;
	private long claveNivelEsc;
	private String descripcionEsc;
	private LocalDateTime fechaMov;
	private BigDecimal nivelEscStps;
	private BigDecimal porcSubsidio;
	private String status;
	private String userId;
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
	 * @return the claveNivelEsc
	 */
	public long getClaveNivelEsc() {
		return claveNivelEsc;
	}
	/**
	 * @param claveNivelEsc the claveNivelEsc to set
	 */
	public void setClaveNivelEsc(long claveNivelEsc) {
		this.claveNivelEsc = claveNivelEsc;
	}
	/**
	 * @return the descripcionEsc
	 */
	public String getDescripcionEsc() {
		return descripcionEsc;
	}
	/**
	 * @param descripcionEsc the descripcionEsc to set
	 */
	public void setDescripcionEsc(String descripcionEsc) {
		this.descripcionEsc = descripcionEsc;
	}
	/**
	 * @return the fechaMov
	 */
	public LocalDateTime getFechaMov() {
		return fechaMov;
	}
	/**
	 * @param fechaMov the fechaMov to set
	 */
	public void setFechaMov(LocalDateTime fechaMov) {
		this.fechaMov = fechaMov;
	}
	/**
	 * @return the nivelEscStps
	 */
	public BigDecimal getNivelEscStps() {
		return nivelEscStps;
	}
	/**
	 * @param nivelEscStps the nivelEscStps to set
	 */
	public void setNivelEscStps(BigDecimal nivelEscStps) {
		this.nivelEscStps = nivelEscStps;
	}
	/**
	 * @return the porcSubsidio
	 */
	public BigDecimal getPorcSubsidio() {
		return porcSubsidio;
	}
	/**
	 * @param porcSubsidio the porcSubsidio to set
	 */
	public void setPorcSubsidio(BigDecimal porcSubsidio) {
		this.porcSubsidio = porcSubsidio;
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
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	

}
