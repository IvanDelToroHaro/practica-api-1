/**
 * 
 */
package api.arquetipo.practica_api_1.entities;

import jakarta.persistence.*;

/**
 * 
 */

@Entity
@Table(name = "profesores", schema = "cv_alumnos", uniqueConstraints = {
		@UniqueConstraint(name = "uk_profesores_dni", columnNames = "dni") })

public class Profesor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_profesor")
	private Long idProfesor;
	
	@Column(name = "dni", nullable = false, length = 9, unique = true)
	private String dni;

	@Column(name = "nombre", nullable = false, length = 20)
	private String nombre;

	@Column(name = "apellidos", nullable = false, length = 30)
	private String apellidos;

	@Column(name = "email_centro",  length = 30)
	private String emailCentro;

	@Column(name = "email_personal",  length = 30)
	private String emailPersonal;
	
	@Column(name = "telefono",  length = 15)
	private String telefono;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_departamento", nullable = false, foreignKey = @ForeignKey(name = "fk_departamento_profesor"))
	private Departamento departamento;
}
