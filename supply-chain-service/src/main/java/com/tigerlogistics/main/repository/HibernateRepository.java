package com.tigerlogistics.main.repository;

import java.io.Serializable;

import org.hibernate.SessionFactory;

import com.tigerlogistics.main.model.Model;

public abstract class HibernateRepository<T extends Model<U>, U extends Serializable> extends HibernateReadOnlyRepository<T, U>implements Repository<T, U> {

public HibernateRepository(Class<T> type, SessionFactory sessionFactory) {
		super(type, sessionFactory);
	}

@Override
	public void add(T entity) {
		try {
			getHibernateTemplate().save(entity);
			getHibernateTemplate().flush();
		} catch (Exception e) {
			throw e;
		}
		
	}
@Override
	public void update(T entity) {
		try {
			getHibernateTemplate().merge(entity);
			getHibernateTemplate().flush();
		} catch (Exception e) {
			throw e;
		}
	}

}