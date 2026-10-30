/**
 * 
 */
package api.arquetipo.practica_api_1.entities;

import jakarta.persistence.*;

/**
 * 
 */

@Entity
@Table(name = "departamentos", schema = "cv_alumnos", uniqueConstraints = {
		@UniqueConstraint(name = "uk_departamentos_codigo", columnNames = "codigo") })

public class Departamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_departamento")
	private Long idDepartamento;

	@Column(name = "codigo", nullable = false, length = 20, unique = true)
	private String codigo;
	
	@Column(name = "nombre", nullable = false, length = 20)
	private String nombre;
	
	@Column(name = "descripcion", length = 150)
	private String descripcion;
	
	@Column(name = "telefono", length = 15)
	private String telefono;
}
