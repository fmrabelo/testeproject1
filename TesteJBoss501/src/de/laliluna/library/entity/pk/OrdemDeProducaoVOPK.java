package de.laliluna.library.entity.pk;

import java.io.Serializable;

public class OrdemDeProducaoVOPK implements Serializable {
    public Long codFilial;
    public Long nroOrdemProducao;

    public OrdemDeProducaoVOPK() {
    }

    public OrdemDeProducaoVOPK(Long codFilial, Long nroOrdemProducao) {
        this.codFilial = codFilial;
        this.nroOrdemProducao = nroOrdemProducao;
    }

    public boolean equals(Object other) {
        if (other instanceof OrdemDeProducaoVOPK) {
            final OrdemDeProducaoVOPK otherOrdemDeProducaoVOPK = (OrdemDeProducaoVOPK) other;
            final boolean areEqual = 
                (otherOrdemDeProducaoVOPK.codFilial.equals(codFilial) && otherOrdemDeProducaoVOPK.nroOrdemProducao.equals(nroOrdemProducao));
            return areEqual;
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }
}
