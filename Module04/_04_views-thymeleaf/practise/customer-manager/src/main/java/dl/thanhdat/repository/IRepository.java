package dl.thanhdat.repository;

import dl.thanhdat.model.Customer;

import java.util.List;

public interface IRepository<T> {
    List<T> findAll();

    void save(T customer);

    T findById(int id);

    void update(int id, T t);

    void remove(int id);
}
