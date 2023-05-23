package com.vsm.lib.dto.seldb;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class HuCatalogoBancoDto {
	private long numeroCompania;
	private String claveBanco;
	private String sucursal;
	private BigDecimal aValidar;
	private String claveBancoSat;
	private String descripcion;
	private LocalDateTime fechaMov;
	private BigDecimal longitudCuenta;
	private String status;
	private String userId;
	/**
	 * @return the numeroCompania
	 */
	public long getNumeroCompania() {
		return numeroCompania;
	}
	/**
	 * @param numeroCompania the numeroCompania to set
	 */
	public void setNumeroCompania(long numeroCompania) {
		this.numeroCompania = numeroCompania;
	}
	/**
	 * @return the claveBanco
	 */
	public String getClaveBanco() {
		return claveBanco;
	}
	/**
	 * @param claveBanco the claveBanco to set
	 */
	public void setClaveBanco(String claveBanco) {
		this.claveBanco = claveBanco;
	}
	/**
	 * @return the sucursal
	 */
	public String getSucursal() {
		return sucursal;
	}
	/**
	 * @param sucursal the sucursal to set
	 */
	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}
	/**
	 * @return the aValidar
	 */
	public BigDecimal getaValidar() {
		return aValidar;
	}
	/**
	 * @param aValidar the aValidar to set
	 */
	public void setaValidar(BigDecimal aValidar) {
		this.aValidar = aValidar;
	}
	/**
	 * @return the claveBancoSat
	 */
	public String getClaveBancoSat() {
		return claveBancoSat;
	}
	/**
	 * @param claveBancoSat the claveBancoSat to set
	 */
	public void setClaveBancoSat(String claveBancoSat) {
		this.claveBancoSat = claveBancoSat;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
	 * @return the longitudCuenta
	 */
	public BigDecimal getLongitudCuenta() {
		return longitudCuenta;
	}
	/**
	 * @param longitudCuenta the longitudCuenta to set
	 */
	public void setLongitudCuenta(BigDecimal longitudCuenta) {
		this.longitudCuenta = longitudCuenta;
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
