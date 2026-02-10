package toidangtest.toidangtest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import toidangtest.toidangtest.entity.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Integer> {
}
