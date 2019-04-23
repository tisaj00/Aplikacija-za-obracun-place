/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tisaj.obracunplace.controller;

import tisaj.obracunplace.model.Obracun;
import tisaj.obracunplace.pomocno.ObracunPlaceException;
import tisaj.obracunplace.pomocno.HibernateUtil;
import tisaj.obracunplace.pomocno.ObradaSucelje;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;

/**
 *
 * @author Josip
 */
public class ObradaObracun extends Obrada<Obracun> implements ObradaSucelje<Obracun>{
    
    public ObradaObracun(){
        super();
    }
    
    public List<Obracun> getLista(){

         return HibernateUtil.getSession().createQuery("from Obracun order by radnik.prezime ").list();
    }
    
    public List<Obracun> getLista(int idIsplata){

         return HibernateUtil.getSession().createQuery("from Obracun where isplata.id=:id "
                 + " order by radnik.prezime ,vrstaPrimanja.nazivVrstePrimanja ")
                 .setInteger("id", idIsplata).list();
    }
    
    public Obracun save(Obracun ob) throws ObracunPlaceException{
         
         kontrola(ob);
     
         
         return dao.save(ob);
     }
    
     public void delete(Obracun ob) throws ObracunPlaceException{

         dao.delete(ob);
     }
     
     
     public void kontrola(Obracun ob) throws ObracunPlaceException{
     
         if(ob.getKolicinaSati()<=0){
             throw new ObracunPlaceException("Količina sati mora bit pozitivan broj");
         }
         
         
     }
    
}
