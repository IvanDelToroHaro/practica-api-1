/**
 * 
 */
package api.arquetipo.practica_api_1.dtos;

import api.arquetipo.practica_api_1.entities.Familia;

/**
 * 
 */
public record AlumnoResponseDto(
		
		Long id,
		String dni,
		String nombre,
		String apellidos,
		String numero_ss,
		String emailCentro,
		String emailPersonal,
		String telefono,
		String fechaAlta,
		String fechaBaja,
		Familia familia) {
}
