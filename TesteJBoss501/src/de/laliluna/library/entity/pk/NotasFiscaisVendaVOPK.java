package de.laliluna.library.entity.pk;
import java.io.Serializable;

public class NotasFiscaisVendaVOPK implements Serializable {
    public Long codFilial;
    public String especie;
    public String modeloNf;
    public Long numeroNf;
    public String serie;

    public NotasFiscaisVendaVOPK() {
    }

    public NotasFiscaisVendaVOPK(Long codFilial, String especie, 
                                 String modeloNf, Long numeroNf, String serie) {this.codFilial = codFilial;
        this.especie = especie;
        this.modeloNf = modeloNf;
        this.numeroNf = numeroNf;
        this.serie = serie;
    }

    public boolean equals(Object other) {
        if (other instanceof NotasFiscaisVendaVOPK) {
            final NotasFiscaisVendaVOPK otherNotasFiscaisVendaVOPK = (NotasFiscaisVendaVOPK) other;
            final boolean areEqual = 
                (otherNotasFiscaisVendaVOPK.codFilial.equals(codFilial) && otherNotasFiscaisVendaVOPK.especie.equals(especie) && otherNotasFiscaisVendaVOPK.modeloNf.equals(modeloNf) && otherNotasFiscaisVendaVOPK.numeroNf.equals(numeroNf) && otherNotasFiscaisVendaVOPK.serie.equals(serie));
            return areEqual;
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }
}
