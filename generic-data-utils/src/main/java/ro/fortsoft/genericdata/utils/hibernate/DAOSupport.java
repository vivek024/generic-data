package ro.fortsoft.genericdata.utils.hibernate;

import java.sql.Connection;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public interface DAOSupport {

	SessionFactory getSessionFactory();

	DataSource getDataSource();

	Session getSession();

	Connection getConnection();

}
