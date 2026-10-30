/**
 * 
 */
package api.arquetipo.practica_api_1.entities;

import jakarta.persistence.*;

/**
 * 
 */
@Entity
@Table(name = "modulos", schema = "cv_alumnos", uniqueConstraints = {
		@UniqueConstraint(name = "uk_modulos_codigo", columnNames = "codigo")
})
public class Modulo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_modulo")
	private Long idModulo;

	@Column(name = "codigo", nullable = false, length = 20, unique = true)
	private String codigo;
	
	@Column(name = "diminutivo", nullable = false, length = 9, unique = true)
	private String diminutivo;
	
	@Column(name = "nombre", nullable = false, length = 20)
	private String nombre;
	
	@Column(name = "descripcion", length = 150)
	private String descripcion;
	
	@Column(name = "horas_semanales")
	private Long horasSemanales;
	
	@Column(name = "creditos", nullable = false)
	private Long creditos;
}
