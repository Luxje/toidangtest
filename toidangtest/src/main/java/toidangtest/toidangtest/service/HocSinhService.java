package toidangtest.toidangtest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.stylesheets.LinkStyle;
import toidangtest.toidangtest.entity.HocSinh;
import toidangtest.toidangtest.repository.HocSinhRepository;

import java.util.List;

@Component
public class HocSinhService {

    @Autowired
    private HocSinhRepository hocSinhRepository;

        public List<HocSinh> getAll() {
            List<HocSinh> lstHocSinh = (List<HocSinh>)this.hocSinhRepository.findAll();
            return lstHocSinh;
        }

        public HocSinh getHocSinh(Integer id) {
            return hocSinhRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Hoc sinh not found with id: " + id));
        }

        public void delete(Integer id) {
            this.hocSinhRepository.deleteById(id);
        }

        public void update(HocSinh hocSinh, Integer id) {
            for(HocSinh hs : getAll()) {
                if ((hs.getId() == id)){
                    this.hocSinhRepository.save(hocSinh);
                }
            }
        }

        public void add(HocSinh hocSinh) {
            this.hocSinhRepository.save(hocSinh);
        }

        public boolean LoginCheck(String hoTen, Integer id) {
            HocSinh hocSinh = hocSinhRepository.findHocSinhByHoTen(hoTen);
            if(hocSinh != null && hocSinh.getId().equals(id)) {
                return true;
            }else {
                return false;
            }
        }


            }

