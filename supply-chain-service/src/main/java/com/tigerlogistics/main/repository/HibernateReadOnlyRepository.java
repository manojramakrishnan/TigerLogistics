package com.tigerlogistics.main.repository;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.tigerlogistics.main.model.Model;

public abstract class HibernateReadOnlyRepository<T extends Model<U>, U extends Serializable>extends HibernateDaoSupport implements ReadOnlyRepository<T, U> {
private Class<T> type;

public HibernateReadOnlyRepository(Class<T> type, SessionFactory sessionFactory) {
this.type = type;
setSessionFactory(sessionFactory);
}

@Override
public T getById(U id) {
if(id == null) return null;
return getHibernateTemplate().get(type, id);
}

@Override
public List<T> getAll() {
return getHibernateTemplate().loadAll(type);
}
}
