package toidangtest.toidangtest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import toidangtest.toidangtest.entity.LopHoc;
import toidangtest.toidangtest.repository.LopHocRepository;

import java.util.List;

@Component
public class LopHocService {

    @Autowired
    private LopHocRepository lopHocRepository;

    public List<LopHoc> getAll() {
        List<LopHoc> lopHocList = (List<LopHoc>)this.lopHocRepository.findAll();
        return lopHocList;
    }
}
