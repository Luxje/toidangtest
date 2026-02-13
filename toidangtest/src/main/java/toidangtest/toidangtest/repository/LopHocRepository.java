package toidangtest.toidangtest.repository;


import org.springframework.data.repository.CrudRepository;
import toidangtest.toidangtest.entity.LopHoc;

public interface LopHocRepository extends CrudRepository<LopHoc, Integer> {

    public LopHoc findLopHocById(Integer id);
}
