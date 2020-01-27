package com.jwat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwat.entity.NewEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewRepository extends JpaRepository<NewEntity, Long> {
	@Query("select p from NewEntity p where p.id= :id")
    NewEntity findById(@Param("id")long id);
}
