package by.epam.learn.db.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import by.epam.learn.classes.javabeanwithxml.Entity;

public interface BaseDao < T, K extends Entity> {
	List<T> findAll();
	T findEntityById(K id);
	boolean delete (T t);
	boolean delete(K id);
	boolean create(T t);
	T update(T t);
	default void close(Statement statement){
		try {
			if(statement !=null){
				statement.close();
			}
		} catch (SQLException e){

		}
	}

	default void close(Connection connection){
		try {
			if(connection !=null){
				connection.close();
			}
		} catch (SQLException e){

		}
	}

}
