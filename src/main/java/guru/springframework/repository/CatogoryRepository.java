package guru.springframework.repository;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.domain.Category;

public interface CatogoryRepository extends CrudRepository<Category, Long>{

}
