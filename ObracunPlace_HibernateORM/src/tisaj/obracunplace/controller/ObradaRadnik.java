/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tisaj.obracunplace.controller;

import java.util.List;
import tisaj.obracunplace.model.Radnik;
import tisaj.obracunplace.pomocno.ObracunPlaceException;
import tisaj.obracunplace.pomocno.Pomocno;
import org.apache.commons.validator.routines.IBANValidator;
import org.hibernate.Query;
import tisaj.obracunplace.pomocno.HibernateUtil;
import tisaj.obracunplace.pomocno.ObradaSucelje;

/**
 *
 * @author Josip
 * @param <T>
 */
public class ObradaRadnik extends Obrada<Radnik> implements ObradaSucelje<Radnik> {

    public ObradaRadnik() {
        super();
    }

    public List<Radnik> getLista() {
        return HibernateUtil.getSession().createQuery("from Radnik").list();
    }

    public List<Radnik> getLista(String uvjet, boolean isSelected) {

        Query query = HibernateUtil.getSession().createQuery("from Radnik a "
                + " where concat(a.ime,' ',a.prezime) like :uvjet")
                .setString("uvjet", "%" + uvjet + "%");
        if (isSelected) {
            query.setMaxResults(25);
        }

        return query.list();
    }

    public Radnik save(Radnik r) throws ObracunPlaceException {

        kontrola(r);

        return dao.save(r);
    }

    public List<Radnik> save(List<Radnik> radnici) throws ObracunPlaceException {

        for (Radnik r : radnici) {
            kontrola(r);

        }

        return dao.save(radnici);
    }

    public void delete(Radnik r) throws ObracunPlaceException {

        if (!r.getObracuni().isEmpty()) {
            throw new ObracunPlaceException("Radnik se ne može obrisati jer ima obračun");
        }

        dao.delete(r);
    }

    public void kontrola(Radnik r) throws ObracunPlaceException {
        if (r.getIme() == null) {
            throw new ObracunPlaceException("Ime nije definirano");
        }
        if (r.getIme().trim().isEmpty()) {
            throw new ObracunPlaceException("Ime nije uneseno");
        }
        if (r.getPrezime() == null) {
            throw new ObracunPlaceException("Prezime nije definirano");
        }
        if (r.getPrezime().trim().isEmpty()) {
            throw new ObracunPlaceException("Prezime nije uneseno");
        }
        if (!Pomocno.checkOIB(r.getOib())) {
            throw new ObracunPlaceException("Oib je neispravan");
        }
        if (r.getMobitel() == null) {
            throw new ObracunPlaceException("Mobitel nije definiran");
        }
        if (r.getMobitel().trim().isEmpty()) {
            throw new ObracunPlaceException("Mobitel nije unesen");
        }
        if (r.getSpol() == null) {
            throw new ObracunPlaceException("Spol nije definiran");
        }
        if (r.getSpol().trim().isEmpty()) {
            throw new ObracunPlaceException("Spol nije unesen");
        }
//        if(r.getDatumRodenja()==null){
//            throw new ObracunPlaceException("Datum rođenja nije definiran");
//        }
        if (r.getOsnovicaPoSatu() == null) {
            throw new ObracunPlaceException("Osnovica po satu nije definirana");
        }
        if (r.getOsnovicaPoSatu().trim().isEmpty()) {
            throw new ObracunPlaceException("Osnovica po satu nije unesena");
        }
        if (r.getOpcinaPrebivaliste() == null) {
            throw new ObracunPlaceException("Općina prebivališta nije definirana");
        }
        if (r.getOsnovicaPoSatu().trim().isEmpty()) {
            throw new ObracunPlaceException("Općina prebivališta nije unesena");
        }
        if (!IBANValidator.getInstance().isValid(r.getIban())) {
            throw new ObracunPlaceException("Račun radnika nije ispavan");
        }

    }

}
