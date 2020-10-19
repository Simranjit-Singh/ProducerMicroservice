package com.repository;

import com.model.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.io.Serializable;

@Repository
public interface   UserRepository extends CrudRepository<UserEntity, Serializable>{

}
