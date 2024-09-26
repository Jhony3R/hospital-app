package iadataperu.com.hospital_app.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "tbl_detalleventa")
public class Detalleventa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idDetalleventa;

    @Column(nullable = false)
    private Double monto;

    @Column(nullable = false)
    private Integer cantidad;

    @Column(nullable = false,length = 120)
    private String descricpcion;

    @Column(nullable = false)
    private Double subTotal;

    @Column(nullable = false)
    private Double descuento;

    @ManyToOne
    @JoinColumn(name = "id_servicio",foreignKey = @ForeignKey(name = "Fk_detalleventa_servicio"))
    private Servicio servicio;

    @ManyToOne
    @JoinColumn(name = "id_producto",foreignKey = @ForeignKey(name = "Fk_detalleventa_producto"))
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "id_venta",foreignKey = @ForeignKey(name = "Fk_detalleventa_venta"))
    private Venta venta;

    @ManyToOne
    @JoinColumn(name = "id_estado",foreignKey = @ForeignKey(name = "Fk_detalleventa_estado"))
    private Estado estado;
}
