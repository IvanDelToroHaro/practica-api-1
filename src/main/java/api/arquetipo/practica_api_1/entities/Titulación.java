/**
 * 
 */
package api.arquetipo.practica_api_1.entities;

import jakarta.persistence.*;

/**
 * 
 */
@Entity
@Table(name = "titulaciones", schema = "cv_alumnos", uniqueConstraints = {
		@UniqueConstraint(name = "uk_titulaciones_codigo", columnNames = "codigo")
})
public class Titulación {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_titulacion")
	private Long idTitulacion;

	@Column(name = "codigo", nullable = false, length = 20, unique = true)
	private String codigo;
	
	@Column(name = "diminutivo", nullable = false, length = 9, unique = true)
	private String diminutivo;

	@Column(name = "horas_totales")
	private Long horasTotales;
}
