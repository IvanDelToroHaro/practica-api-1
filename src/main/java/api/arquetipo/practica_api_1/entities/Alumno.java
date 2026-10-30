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
}
