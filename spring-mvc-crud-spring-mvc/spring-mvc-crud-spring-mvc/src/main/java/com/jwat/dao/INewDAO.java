package com.jwat.dao;

import java.util.List;

import com.jwat.model.NewModel;

public interface INewDAO extends GenericDAO<NewModel> {
	List<NewModel> findAll();
}
