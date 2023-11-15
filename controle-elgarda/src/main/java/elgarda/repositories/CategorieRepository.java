package elgarda.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import elgarda.entities.Categorie;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long>{
  //List<Categorie> findbCategories(Categorie categorie);
	
}
