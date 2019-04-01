package tisaj.obracunplace;


import tisaj.obracunplace.controller.ObradaOperater;
import tisaj.obracunplace.model.Operater;
import tisaj.obracunplace.view.SplashScreen;


//upogoniti Hibernate prateći https://examples.javacodegeeks.com/enterprise-java/hibernate/hibernate-maven-example/
public class Start {

    public static void main(String[] args) {
        ObradaOperater oo = new ObradaOperater();
        Operater o = new Operater();
        o.setIme("Ivo");
        o.setPrezime("Ivić");
        o.setUsername("user");
        o.setPassword("t");
        
        try {
            oo.save(o);
        } catch (Exception e) {
            e.printStackTrace();
            
        }
       
        
        new SplashScreen().setVisible(true);
        
        
    }
    
}
