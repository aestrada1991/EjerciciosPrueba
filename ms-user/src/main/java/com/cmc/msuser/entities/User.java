package com.cmc.msuser.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USUARIOS")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "Codigo_Usuario")
	private Integer userCode;

	@Column(name = "Nombre_Completo")
	private String fullName;

	@Column(name = "Telefono_Contacto")
	private String phoneContact;

	@Column(name = "Correo_Electronico")
	private String email;

	@Column(name = "Fecha_Ultima_Autenticacion")
	private Date lastAuthenticationDate;

	@Column(name = "Hora_Ultima_Autenticacion")
	private String lastAuthenticationHour;

	@Column(name = "Numero_Intentos")
	private Integer numberTest;


}
