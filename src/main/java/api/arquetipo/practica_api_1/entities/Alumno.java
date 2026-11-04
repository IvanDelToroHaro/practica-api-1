/**
 * 
 */
package api.arquetipo.practica_api_1.entities;

import jakarta.persistence.*;

/**
 * 
 */
@Entity
@Table(name = "alumnos", schema = "cv_alumnos", uniqueConstraints = {
		@UniqueConstraint(name = "uk_alumnos_dni", columnNames = "dni") })
public class Alumno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_alumno")
	private Long idAlumno;

	@Column(name = "dni", nullable = false, length = 9, unique = true)
	private String dni;

	@Column(name = "nombre", nullable = false, length = 20)
	private String nombre;

	@Column(name = "apellidos", nullable = false, length = 30)
	private String apellidos;

	@Column(name = "numero_ss", nullable = false, length = 12, unique = true)
	private String numero_ss;

	@Column(name = "email_centro", length = 30)
	private String emailCentro;

	@Column(name = "email_personal", length = 30)
	private String emailPersonal;

	@Column(name = "telefono", length = 15)
	private String telefono;

	@Column(name = "fecha_alta", nullable = false, length = 30)
	private String fechaAlta;

	@Column(name = "fecha_baja", length = 30)
	private String fechaBaja;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_familia", nullable = false, foreignKey = @ForeignKey(name = "fk_alumno_familia"))
	private Familia familia;

	public Alumno() {
		super();
	}

	public Alumno(Long idAlumno, String dni, String nombre, String apellidos, String numero_ss, String emailCentro,
			String emailPersonal, String telefono, String fechaAlta, String fechaBaja, Familia familia) {
		super();
		this.idAlumno = idAlumno;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.numero_ss = numero_ss;
		this.emailCentro = emailCentro;
		this.emailPersonal = emailPersonal;
		this.telefono = telefono;
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
		this.familia = familia;
	}

	public Long getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(Long idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNumero_ss() {
		return numero_ss;
	}

	public void setNumero_ss(String numero_ss) {
		this.numero_ss = numero_ss;
	}

	public String getEmailCentro() {
		return emailCentro;
	}

	public void setEmailCentro(String emailCentro) {
		this.emailCentro = emailCentro;
	}

	public String getEmailPersonal() {
		return emailPersonal;
	}

	public void setEmailPersonal(String emailPersonal) {
		this.emailPersonal = emailPersonal;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public String getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(String fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public Familia getFamilia() {
		return familia;
	}

	public void setFamilia(Familia familia) {
		this.familia = familia;
	}
	
	
}
