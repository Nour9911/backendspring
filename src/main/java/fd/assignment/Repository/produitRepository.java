package fd.assignment.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fd.assignment.Entities.produit;

@Repository
public interface produitRepository extends CrudRepository<produit, Long> {
	
	@Query("SELECT p FROM produit p WHERE CONCAT(p.categorieProduit, ' ', p.libelleProduit) LIKE %?1%")
	public List<produit> search(String keyword);
	
	@Query("SELECT p FROM produit p WHERE p.user.id = ?1 ")
	public List<produit> findByIdUser(Long key);
	
	@Query("SELECT p FROM produit p WHERE p.stock.idStock = ?1 ")
	public List<produit> findByIdstock(Long key);
	


}