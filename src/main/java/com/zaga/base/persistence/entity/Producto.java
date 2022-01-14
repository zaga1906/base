package com.zaga.base.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table (name = "productos")
public class Producto {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_producto")
    private Integer idProducto;

    private String nombre;

    @Column (name = "id_categoria")
    private Integer idCategoria;

    @Column (name = "codigo_barras")
    private Integer codigoBarras;

    @Column (name = "precio_venta")
    private Double precioVenta;

    @Column (name = "cantidad_stock")
    private Integer cantidadStock;

    private Boolean estado;
}
