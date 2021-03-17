package dl.thanhdat.service;

import java.util.List;

public interface IService<T> {
    List<T> findAll();

    void save(T customer);

    T findById(int id);

    void update(int id, T t);

    void remove(int id);
}
