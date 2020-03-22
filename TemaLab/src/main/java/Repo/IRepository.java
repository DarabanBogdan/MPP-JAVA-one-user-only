package Repo;


import Domain.Excursie;

/**
 * Created by grigo on 11/14/16.
 */
public interface IRepository<ID, T> {
    int size();
    void save(T entity);
    void delete(ID id);
    void update(ID id, T entity);
    T findOne(ID id);
    Iterable<T> findAll();
    Iterable<T> findAllMatch(Integer idExcursie);
    Iterable<T> findAllMatch(String numeObiectivTuristic);

}
