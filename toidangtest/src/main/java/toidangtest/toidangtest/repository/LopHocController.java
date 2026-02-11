package toidangtest.toidangtest.repository;


import org.springframework.data.repository.CrudRepository;
import toidangtest.toidangtest.entity.LopHoc;

public interface LopHocController extends CrudRepository {

    public LopHoc findLopHocById(Integer id);
}
