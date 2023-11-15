package elgarda.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import elgarda.dao.IDao;
import elgarda.entities.Categorie;
import elgarda.repositories.CategorieRepository;

@Service
public class CategorieService implements IDao<Categorie>{

	
	@Autowired
	CategorieRepository categorieRepository;
	@Override
	public Categorie create(Categorie o) {
		return categorieRepository.save(o) ;
	}

	@Override
	public List<Categorie> findAll() {
		return categorieRepository.findAll();
	}

	@Override
	public Categorie update(Categorie o) {
		// TODO Auto-generated method stub
		return categorieRepository.save(o);
	}

	@Override
	public boolean delete(Categorie o) {
		try {
            categorieRepository.delete(o);
            return true;
        } catch (Exception e) {
            return false;
        }
	}

	@Override
	public Categorie findById(Long id) {
		return categorieRepository.findById(id).orElse(null);
	}

//	public List<Categorie> findbCategories(Categorie categorie){
//		return categorieRepository.findbCategories(categorie). ;
//	}
	
	
	
}
