/**
 * 
 */
package api.arquetipo.practica_api_1.entities;

import jakarta.persistence.*;

/**
 * 
 */
@Entity
@Table(name = "estados", schema = "cv_alumnos", uniqueConstraints = {
		@UniqueConstraint(name = "uk_estados_", columnNames = "dni")
})
public class Estado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_estado")
	private Long idEstado;

	@Column(name = "nombre", nullable = false, length = 20)
	private String nombre;
	
	@Column(name = "descripcion", length = 150)
	private String descripcion;
}
