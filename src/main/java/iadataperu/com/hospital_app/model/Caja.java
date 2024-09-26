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
@Table(name = "tbl_caja")
public class Caja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idCaja;

    @Column(nullable = false)
    private LocalDateTime fRegistro;

    private Integer secuencia;

    @Column(nullable = false)
    private Double monto;

    @Column(nullable = false,length = 10)
    private String codigo;

    @Column(length = 100)
    private String nombres;

    @Column(nullable = false,length = 100)
    private String concepto;

    @Column(length = 150)
    private String observacion;

    @ManyToOne
    @JoinColumn(name = "id_tipomovimiento",foreignKey = @ForeignKey(name = "Fk_caja_tipomovimiento"))
    private Tipomovimiento tipoMovimiento;

    @ManyToOne
    @JoinColumn(name = "id_referencia",foreignKey = @ForeignKey(name = "Fk_caja_referencia"))
    private Referencia referencia;

    @ManyToOne
    @JoinColumn(name = "id_turno",foreignKey = @ForeignKey(name = "Fk_caja_turno"))
    private Turno turno;

    @ManyToOne
    @JoinColumn(name = "id_tipocaja",foreignKey = @ForeignKey(name = "Fk_caja_tipocaja"))
    private Tipocaja tipoCaja;

}