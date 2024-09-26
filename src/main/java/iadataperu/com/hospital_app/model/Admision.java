package iadataperu.com.hospital_app.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "tbl_admision")
public class Admision {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idAdmision;

    @Column(nullable = false,length = 8)
    private String numAdmision;

    @Column(nullable = false,length = 10)
    private LocalDateTime fAtencion;

    /*@ManyToOne
    @JoinColumn(name = "id_fua",foreignKey = @ForeignKey(name = "Fk_admision_fua"))
    private Fua fua;

    @ManyToOne
    @JoinColumn(name = "id_usuario",foreignKey = @ForeignKey(name = "Fk_admision_usuario"))
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_expediente",foreignKey = @ForeignKey(name = "Fk_admision_expediente"))
    private Expediente expediente;*/
}
