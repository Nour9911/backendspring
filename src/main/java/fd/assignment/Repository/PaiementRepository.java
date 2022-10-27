package fd.assignment.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fd.assignment.Entities.User;
import fd.assignment.Entities.paiement;
import fd.assignment.Entities.panierProduit;
import fd.assignment.Entities.produit;

@Repository
public interface PaiementRepository extends CrudRepository<paiement, Long> {
	
	List<paiement> findByUser(User user);

}