package com.vsm.lib.dto.seldb;

import java.time.LocalDateTime;

public class HuCatProvLocalidadIntDto {
	private long numCia;
	private String clavePais;
	private String claveProvincia;
	private String claveLocalidad;
	private String claveColonia;
	private String abreviatura;
	private String descripcion;
	private LocalDateTime fechaMov;
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
	 * @return the clavePais
	 */
	public String getClavePais() {
		return clavePais;
	}
	/**
	 * @param clavePais the clavePais to set
	 */
	public void setClavePais(String clavePais) {
		this.clavePais = clavePais;
	}
	/**
	 * @return the claveProvincia
	 */
	public String getClaveProvincia() {
		return claveProvincia;
	}
	/**
	 * @param claveProvincia the claveProvincia to set
	 */
	public void setClaveProvincia(String claveProvincia) {
		this.claveProvincia = claveProvincia;
	}
	/**
	 * @return the claveLocalidad
	 */
	public String getClaveLocalidad() {
		return claveLocalidad;
	}
	/**
	 * @param claveLocalidad the claveLocalidad to set
	 */
	public void setClaveLocalidad(String claveLocalidad) {
		this.claveLocalidad = claveLocalidad;
	}
	/**
	 * @return the claveColonia
	 */
	public String getClaveColonia() {
		return claveColonia;
	}
	/**
	 * @param claveColonia the claveColonia to set
	 */
	public void setClaveColonia(String claveColonia) {
		this.claveColonia = claveColonia;
	}
	/**
	 * @return the abreviatura
	 */
	public String getAbreviatura() {
		return abreviatura;
	}
	/**
	 * @param abreviatura the abreviatura to set
	 */
	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
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
