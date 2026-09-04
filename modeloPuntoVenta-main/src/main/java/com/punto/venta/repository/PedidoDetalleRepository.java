package com.punto.venta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.punto.venta.entity.Pedido;
import com.punto.venta.entity.PedidoDetalle;
import com.punto.venta.entity.Producto;

import java.util.List;

@Repository
public interface PedidoDetalleRepository extends JpaRepository<PedidoDetalle, Integer> {

    boolean existsByIdPedidoAndIdProducto(Pedido idPedido, Producto idProducto);

    List<PedidoDetalle> findByEstadoTrue();

    List<PedidoDetalle> findByEstadoTrueAndIdPedido(Pedido idPedido);

    List<PedidoDetalle> findTop5ByEstadoTrueOrderByIdPedidoDetalleDesc();
}