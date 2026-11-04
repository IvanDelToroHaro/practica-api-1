/**
 * 
 */
package api.arquetipo.practica_api_1.entities;

import jakarta.persistence.*;

/**
 * 
 */
@Entity
@Table(name = "cv_alumnos", schema = "cv_alumnos", uniqueConstraints = {
		@UniqueConstraint(name = "uk_alumnos_dni", columnNames = "dni") })
public class Inter_Profesor_Modulo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_alumno")
	private Long idAlumno;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_profesor", nullable = false, foreignKey = @ForeignKey(name = "fk_profesor"))
	private Profesor profesor;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_modulo", nullable = false, foreignKey = @ForeignKey(name = "fk_modulo"))
	private Modulo modulo;
}
