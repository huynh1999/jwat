package com.jwat.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jwat.dao.INewDAO;
import com.jwat.mapper.NewMapper;
import com.jwat.model.NewModel;

@Repository
public class NewDAO extends AbstractDAO<NewModel> implements INewDAO {
	
	@Override
	public List<NewModel> findAll() {
		StringBuilder sql = new StringBuilder("SELECT * FROM news");
		return query(sql.toString(), new NewMapper());
	}
}
