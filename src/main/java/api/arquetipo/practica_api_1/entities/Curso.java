/**
 * 
 */
package api.arquetipo.practica_api_1.entities;

import jakarta.persistence.*;

/**
 * 
 */
@Entity
@Table(name = "cursos", schema = "cv_alumnos", uniqueConstraints = {
		@UniqueConstraint(name = "uk_cursos_diminutivo", columnNames = "diminutivo")
})
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_curso")
	private Long idCurso;

	@Column(name = "diminutivo", nullable = false, length = 9, unique = true)
	private String diminutivo;
	
	@Column(name = "descripcion", length = 150)
	private String descripcion;
}
