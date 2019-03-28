/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tisaj.obracunplace.controller;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;
import tisaj.obracunplace.model.Operater;
import tisaj.obracunplace.pomocno.BCrypt;
import tisaj.obracunplace.pomocno.HibernateUtil;
import tisaj.obracunplace.pomocno.ObracunPlaceException;
import tisaj.obracunplace.pomocno.ObradaSucelje;

/**
 *
 * @author Josip
 */
public class ObradaOperater extends Obrada<Operater> implements ObradaSucelje<Operater>{

    
     public Operater autoriziraj(String username, String password){
        Operater o = (Operater) HibernateUtil.getSession().createQuery(" from Operater a "
                + " where a.username=:username ")
                .setString("username", username)
                .uniqueResult();
        if(o==null){
            return null;
        }
        
        if(BCrypt.checkpw(password, o.getPassword())){
            //o.setLozinka(null); - riješiti
            return o;
        }
        
        return null;
    }
     
     public Operater pohrana(String ime,String prezime,String username,String password){
     
         
         Operater o = (Operater) HibernateUtil.getSession().createQuery("insert into radnik (ime,prezime,username,password) "
                    + " values (?,?,?,?)")
                 .setString("ime", ime)
                 .setString("prezime", prezime)
                 .setString("username", username)
                 .setString("password", password)
                 .uniqueResult();
         if(o==null){
             return null;
         }
         if(BCrypt.checkpw(password, o.getPassword())){
             return o;
         }
         
     
         return null;
     }
     
     
    @Override
    public List<Operater> getLista() {
        return HibernateUtil.getSession().createQuery("from Operater").list();
    }

    @Override
    public void kontrola(Operater t) throws ObracunPlaceException {
        
    }

    @Override
    public Operater save(Operater t) throws ObracunPlaceException {
        return dao.save(t);
    }

    @Override
    public void delete(Operater t) throws ObracunPlaceException {
        
    }
    
    
    
}
