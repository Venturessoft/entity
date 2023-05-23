package com.vsm.lib.dto.seldb;

public class Ta020Dto {
	private int cia;
	private String codigo;
	private int clave;
	private String sclave;
	private String descr;
	private String act;
	private String sts;
	
	
	
	
	
	@Override
	public String toString() {
		return "Ta020Dto [cia=" + cia + ", codigo=" + codigo + ", clave=" + clave + ", sclave=" + sclave + ", descr="
				+ descr + ", act=" + act + ", sts=" + sts + "]";
	}
	public int getCia() {
		return cia;
	}
	public void setCia(int cia) {
		this.cia = cia;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getClave() {
		return clave;
	}
	public void setClave(int clave) {
		this.clave = clave;
	}
	public String getSclave() {
		return sclave;
	}
	public void setSclave(String sclave) {
		this.sclave = sclave;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public String getAct() {
		return act;
	}
	public void setAct(String act) {
		this.act = act;
	}
	public String getSts() {
		return sts;
	}
	public void setSts(String sts) {
		this.sts = sts;
	}

	
	
	
	
}
