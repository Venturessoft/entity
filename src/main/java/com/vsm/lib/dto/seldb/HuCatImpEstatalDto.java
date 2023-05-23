package com.vsm.lib.dto.seldb;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class HuCatImpEstatalDto{
	private long numCia;
	private String clavePais;
	private String claveProvincia;
	private String claveLocalidad;
	private BigDecimal conceptoPago;
	private BigDecimal conceptoProvision;
	private String descripcion;
	private LocalDateTime fechaMov;
	private BigDecimal grupoExcentos;
	private BigDecimal grupoTotales;
	private BigDecimal importeExcento;
	private BigDecimal matrizImpuesto;
	private BigDecimal porcentImpuesto;
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
	 * @return the conceptoPago
	 */
	public BigDecimal getConceptoPago() {
		return conceptoPago;
	}
	/**
	 * @param conceptoPago the conceptoPago to set
	 */
	public void setConceptoPago(BigDecimal conceptoPago) {
		this.conceptoPago = conceptoPago;
	}
	/**
	 * @return the conceptoProvision
	 */
	public BigDecimal getConceptoProvision() {
		return conceptoProvision;
	}
	/**
	 * @param conceptoProvision the conceptoProvision to set
	 */
	public void setConceptoProvision(BigDecimal conceptoProvision) {
		this.conceptoProvision = conceptoProvision;
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
	 * @return the grupoExcentos
	 */
	public BigDecimal getGrupoExcentos() {
		return grupoExcentos;
	}
	/**
	 * @param grupoExcentos the grupoExcentos to set
	 */
	public void setGrupoExcentos(BigDecimal grupoExcentos) {
		this.grupoExcentos = grupoExcentos;
	}
	/**
	 * @return the grupoTotales
	 */
	public BigDecimal getGrupoTotales() {
		return grupoTotales;
	}
	/**
	 * @param grupoTotales the grupoTotales to set
	 */
	public void setGrupoTotales(BigDecimal grupoTotales) {
		this.grupoTotales = grupoTotales;
	}
	/**
	 * @return the importeExcento
	 */
	public BigDecimal getImporteExcento() {
		return importeExcento;
	}
	/**
	 * @param importeExcento the importeExcento to set
	 */
	public void setImporteExcento(BigDecimal importeExcento) {
		this.importeExcento = importeExcento;
	}
	/**
	 * @return the matrizImpuesto
	 */
	public BigDecimal getMatrizImpuesto() {
		return matrizImpuesto;
	}
	/**
	 * @param matrizImpuesto the matrizImpuesto to set
	 */
	public void setMatrizImpuesto(BigDecimal matrizImpuesto) {
		this.matrizImpuesto = matrizImpuesto;
	}
	/**
	 * @return the porcentImpuesto
	 */
	public BigDecimal getPorcentImpuesto() {
		return porcentImpuesto;
	}
	/**
	 * @param porcentImpuesto the porcentImpuesto to set
	 */
	public void setPorcentImpuesto(BigDecimal porcentImpuesto) {
		this.porcentImpuesto = porcentImpuesto;
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
