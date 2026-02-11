package toidangtest.toidangtest.repository;

import org.springframework.data.repository.CrudRepository;
import toidangtest.toidangtest.entity.HocSinh;

public interface HocSinhRepository extends CrudRepository<HocSinh, Integer> {

    public HocSinh findHocSinhByHoTen(String email);

}
