/**
 * 
 */
package api.arquetipo.practica_api_1.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import api.arquetipo.practica_api_1.dtos.AlumnoRequestDto;
import api.arquetipo.practica_api_1.dtos.AlumnoResponseDto;
import api.arquetipo.practica_api_1.entities.Alumno;
import api.arquetipo.practica_api_1.repositories.AlumnoRepository;

/**
 * 
 */
@Service
public class AlumnoService {
	
	private final AlumnoRepository alumnoRepository;

    // Inyección de dependencias por constructor
    public AlumnoService(AlumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }
    
	@Transactional
	public AlumnoResponseDto crear(AlumnoRequestDto dto) {
		// Validación de regla de negocio: DNI único
		if (alumnoRepository.existsByDni(dto.dni())) {
			//throw new DniAlreadyExistsException("Ya existe un alumno registrado con el DNI: " + dto.dni());
		}

		Alumno nuevoAlumno = new Alumno(
				null,
				dto.dni(),
				dto.nombre(),
				dto.apellidos(),
				dto.numero_ss(),
				dto.emailCentro(),
				dto.emailPersonal(),
				dto.telefono(),
				dto.fechaAlta(),
				dto.fechaBaja(),
				dto.familia());

		Alumno guardado = alumnoRepository.save(nuevoAlumno);
		return mapToResponseDto(guardado);
	}
	
	
    
    // Metodo de leer todos las entidades
    @Transactional(readOnly = true)
    public List<AlumnoResponseDto> obtenerTodos() {
        return alumnoRepository.findAll()
                .stream()
                .map(this::mapToResponseDto)
                .toList();
    }
    
    

    
    // Método auxiliar de mapeo de Entidad a DTO
	private AlumnoResponseDto mapToResponseDto(Alumno alumno) {
		return new AlumnoResponseDto(
				alumno.getIdAlumno(), 
				alumno.getDni(), 
				alumno.getNombre(), 
				alumno.getApellidos(),
				alumno.getNumero_ss(),
				alumno.getEmailCentro(),
				alumno.getEmailPersonal(),
				alumno.getTelefono(),
				alumno.getFechaAlta(),
				alumno.getFechaBaja(),
				alumno.getFamilia());
	}
}
