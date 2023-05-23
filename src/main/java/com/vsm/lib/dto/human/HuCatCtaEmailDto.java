package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCatCtaEmailDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long numCia;
	private String accountSender;
	private String alias;
	private String autentificacion;
	private LocalDateTime fechaMov;
	private String password;
	private BigDecimal puerto;
	private String smtpServerAddress;
	private String ssl;
	private String status;
	private String tls;
	private String userId;
}