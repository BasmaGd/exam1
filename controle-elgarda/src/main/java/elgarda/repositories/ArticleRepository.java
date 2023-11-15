package elgarda.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import elgarda.entities.Article;
import elgarda.entities.Categorie;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long>{
	List<Article> findByDateProductionBetween(Date dateDebut, Date dateFin);
	List<Article> findByCategorie(Categorie categorie);
}
