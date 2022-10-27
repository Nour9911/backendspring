package fd.assignment.Services;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fd.assignment.Entities.User;
import fd.assignment.Entities.paiement;
import fd.assignment.Entities.panierProduit;
import fd.assignment.Entities.produit;
import fd.assignment.Entities.stock;
import fd.assignment.Repository.PaiementRepository;
import fd.assignment.Repository.PanierProduitRepository;
import fd.assignment.Repository.UserRepository;
import fd.assignment.Repository.produitRepository;
import fd.assignment.Repository.stockRepository;


@Service 
public class paiementServiceImpl implements IPaiementService{
	
	@Autowired
	PanierProduitRepository PanierProdRepo;
	
	@Autowired
	UserRepository UserRepo;
	
	@Autowired
	PaiementRepository PaiRepo;
	
	@Autowired
	stockRepository StockRepo;
	
	@Override
	public List<paiement> retrieveAllPaiement() {
		// TODO Auto-generated method stub
		return (List<paiement>) PaiRepo.findAll();
	}

	@Override
	public paiement addPaiement(paiement pa, Long id) {
		// TODO Auto-generated method stub
		User u = UserRepo.findById(id).orElse(null);
		List<panierProduit> produits = PanierProdRepo.findByUser(u);
		pa.setNature(pa.getNature());
		pa.setSommetotal(pa.getSommetotal());
		pa.setDate(new Date());
		pa.setCard(pa.getCard());
		pa.setCvc(pa.getCvc());
		pa.setExp(pa.getExp());
		pa.setUser(u);
		pa.setProduits(produits);
		PaiRepo.save(pa);
		return pa;
	}

	@Override
	public paiement retrievePaiement(Long idPaiement) {
		// TODO Auto-generated method stub
		return PaiRepo.findById(idPaiement).orElse(null);
	}
	
	
	@Override
	public List<paiement> retrievePaiementByUser(Long id) {
		// TODO Auto-generated method stub
		User u = UserRepo.findById(id).orElse(null);
		return PaiRepo.findByUser(u);
	}
	
	@Override
	public List<panierProduit> detailPanier(Long paiement_id) {
		paiement p = PaiRepo.findById(paiement_id).get();
		List<panierProduit> panier = p.getProduits();
		return panier;
	}

	
}