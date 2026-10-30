/**
 * 
 */
package api.arquetipo.practica_api_1.entities;

import jakarta.persistence.*;

/**
 * 
 */
@Entity
@Table(name = "familias", schema = "cv_alumnos")
public class Familia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_familia")
	private Long idAlumno;

	@Column(name = "nombre_madre", length = 20)
	private String nombreMadre;

	@Column(name = "nombre_padre", length = 20)
	private String nombrePadre;

	@Column(name = "apellidos_madre", length = 30)
	private String apellidosMadre;

	@Column(name = "apellidos_padre", length = 20)
	private String apellidos_padre;

	@Column(name = "email_madre", length = 30)
	private String emailMadre;

	@Column(name = "email_padre", length = 30)
	private String emailPadre;

	@Column(name = "telefono_madre", length = 15)
	private String telefonoMadre;

	@Column(name = "telefono_padre", length = 15)
	private String telefonoPadre;

	@Column(name = "direccion_madre", length = 100)
	private String direccionMadre;

	@Column(name = "direccion_padre", length = 100)
	private String direccionPadre;

	@Column(name = "codigo_postal_madre", length = 10)
	private String codigoPostalMadre;

	@Column(name = "codigo_postal_padre", length = 10)
	private String codigoPostalPadre;

	@Column(name = "provincia_madre", length = 30)
	private String provinciaMadre;

	@Column(name = "provincia_padre", length = 30)
	private String provinciaPadre;

	@Column(name = "son_separados")
	private Boolean sonSeparados;

	@Column(name = "es_compartida")
	private Boolean esCompartida;

	@Column(name = "es_padre")
	private Boolean esPadre;

	@Column(name = "es_madre")
	private Boolean esMadre;
}
