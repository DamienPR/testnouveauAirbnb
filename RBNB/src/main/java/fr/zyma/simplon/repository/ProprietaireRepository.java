package fr.zyma.simplon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.zyma.simplon.model.Proprietaire;

@Repository("proprietaireRepository")
public interface ProprietaireRepository extends JpaRepository<Proprietaire, Long> {

	
}
