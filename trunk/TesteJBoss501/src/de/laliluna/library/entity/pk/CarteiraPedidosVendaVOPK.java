package de.laliluna.library.entity.pk;

import java.io.Serializable;

public class CarteiraPedidosVendaVOPK implements Serializable {
    public Long anoPedido;
    public Long codFilial;
    public Long nroSeqPedido;

    public CarteiraPedidosVendaVOPK() {
    }

    public CarteiraPedidosVendaVOPK(Long anoPedido, Long codFilial, Long nroSeqPedido) {this.anoPedido = anoPedido;
        this.codFilial = codFilial;
        this.nroSeqPedido = nroSeqPedido;
    }

    public boolean equals(Object other) {
        if (other instanceof CarteiraPedidosVendaVOPK) {
            final CarteiraPedidosVendaVOPK otherCarteiraPedidosVendaVOPK = (CarteiraPedidosVendaVOPK) other;
            final boolean areEqual = 
                (otherCarteiraPedidosVendaVOPK.anoPedido.equals(anoPedido) && otherCarteiraPedidosVendaVOPK.codFilial.equals(codFilial) && otherCarteiraPedidosVendaVOPK.nroSeqPedido.equals(nroSeqPedido));
            return areEqual;
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }
}
