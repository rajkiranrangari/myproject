package com.prod.respository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.prod.dto.Category;
@Repository
public interface ProductRepository extends CrudRepository<Category, Integer	>{ 


}
