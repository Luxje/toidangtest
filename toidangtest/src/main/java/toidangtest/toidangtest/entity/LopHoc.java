package toidangtest.toidangtest.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "lop_hoc")
public class LopHoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten_lop")
    private String tenLop;

    @Column(name = "khoi")
    private Integer khoi;

    @Column(name = "si_so")
    private Integer siSo;
}
