/**
 * 
 */
package api.arquetipo.practica_api_1.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.arquetipo.practica_api_1.entities.Alumno;

/**
 * 
 */
@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {

	// --- CREATE / VALIDACIÓN ---
	// Comprobar si existe por la clave única antes de crear
	boolean existsByDni(String dni);

	// --- READ ---
	// Buscar por la clave única (retorna Optional en vez de List al ser única)
	Optional<Alumno> findByDni(String dni);

	// --- DELETE ---
	// Eliminar por la clave única (retorna la cantidad de registros eliminados o void)
	void deleteByDni(String dni);
}
