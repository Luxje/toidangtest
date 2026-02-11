package toidangtest.toidangtest.repository;


import org.springframework.data.repository.CrudRepository;
import toidangtest.toidangtest.entity.LopHoc;

public interface LopHocRepository extends CrudRepository {

    public LopHoc findLopHocById(Integer id);
}
