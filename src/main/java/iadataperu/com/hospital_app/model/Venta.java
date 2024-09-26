package iadataperu.com.hospital_app.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "tbl_venta")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idVenta;

    @Column(nullable = false,length = 4)
    private String numSerie;

    @Column(nullable = false,length = 10)
    private String correlativo;

    @Column(nullable = false,length = 20)
    private String numDocumento;

    @Column(nullable = false,length = 10)
    private String codCliente;

    @Column(nullable = false)
    private Double pago;

    @Column(nullable = false)
    private Double vuelto;

    @Column(nullable = false)
    private Double igv;

    @Column(nullable = false)
    private Double descuento;

    @Column(nullable = false,length = 10)
    private Double impuestos;

    @Column(nullable = false)
    private Double montoTotal;

    @Column(nullable = false,length = 20)
    private String estado;

    @Column(nullable = false,length = 10)
    private String xmlSunat;

    @ManyToOne
    @JoinColumn(name = "id_tipocomprobante",foreignKey = @ForeignKey(name = "Fk_venta_tipocomprobante"))
    private Tipocomprobante tipocomprobante;

    @ManyToOne
    @JoinColumn(name = "id_tipomoneda",foreignKey = @ForeignKey(name = "Fk_venta_tipomoneda"))
    private Tipomoneda tipoMoneda;

    /*@ManyToOne
    @JoinColumn(name = "id_paciente",foreignKey = @ForeignKey(name = "Fk_venta_paciente"))
    private Paciente paciente;*/

    @ManyToOne
    @JoinColumn(name = "id_caja",foreignKey = @ForeignKey(name = "Fk_venta_caja"))
    private Caja caja;

    @ManyToOne
    @JoinColumn(name = "id_serie",foreignKey = @ForeignKey(name = "Fk_venta_serie"))
    private Serie serie;

    /*@ManyToOne
    @JoinColumn(name = "id_usuario",foreignKey = @ForeignKey(name = "Fk_venta_usuario"))
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_admision",foreignKey = @ForeignKey(name = "Fk_venta_admision"))
    private Admision admision;

    @ManyToOne
    @JoinColumn(name = "id_receta",foreignKey = @ForeignKey(name = "Fk_venta_receta"))
    private Receta receta;*/

    @OneToMany(mappedBy = "venta")
    private List<Detalleventa> detalleVenta;

}