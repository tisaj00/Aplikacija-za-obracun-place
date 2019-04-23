/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tisaj.obracunplace.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class VrstaPrimanja extends Entitet implements Serializable {
    
    private String nazivVrstePrimanja;
    private BigDecimal koeficijent;
    
    @OneToMany (mappedBy = "vrstaPrimanja")
    private List<Obracun> obracuni = new ArrayList<>();

    public List<Obracun> getObracuni() {
        return obracuni;
    }

    public void setObracuni(List<Obracun> obracuni) {
        this.obracuni = obracuni;
    }

    public String getNazivVrstePrimanja() {
        return nazivVrstePrimanja;
    }

    public void setNazivVrstePrimanja(String nazivVrstePrimanja) {
        this.nazivVrstePrimanja = nazivVrstePrimanja;
    }
    
    public BigDecimal getKoeficijent() {
        return koeficijent;
    }

    public void setKoeficijent(BigDecimal koeficijent) {
        this.koeficijent = koeficijent;
    }

    @Override
    public String toString() {
        return nazivVrstePrimanja +" " +"Koeficijent: "+ koeficijent;
    }
    
    
    
}
