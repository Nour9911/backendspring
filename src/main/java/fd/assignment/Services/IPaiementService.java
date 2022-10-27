package fd.assignment.Services;

import java.util.List;

import fd.assignment.Entities.paiement;
import fd.assignment.Entities.panierProduit;

public interface IPaiementService {

	List<paiement> retrieveAllPaiement();
	
	List<paiement> retrievePaiementByUser(Long id);

	paiement retrievePaiement(Long id);

	paiement addPaiement(paiement pa, Long id);

	List<panierProduit> detailPanier(Long paiement_id);
	
}