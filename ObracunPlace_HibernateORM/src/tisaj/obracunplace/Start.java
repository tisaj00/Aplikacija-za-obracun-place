package tisaj.obracunplace;


import java.text.SimpleDateFormat;
import tisaj.obracunplace.controller.ObradaRadnik;
import tisaj.obracunplace.model.Radnik;
import tisaj.obracunplace.view.SplashScreen;


//upogoniti Hibernate prateći https://examples.javacodegeeks.com/enterprise-java/hibernate/hibernate-maven-example/
public class Start {

    public static void main(String[] args) {
//        ObradaRadnik rr = new ObradaRadnik();
//        Radnik r = new Radnik();
//        
//        r.setIme("Josip");
//        r.setPrezime("Tisaj");
//        r.setSpol("M");
//        r.setMobitel("0919340771");
//        r.setOpcinaPrebivaliste("Beli Manastir");
//        r.setOsnovicaPoSatu("100");
//        r.setOib("68628389819");
//        r.setIban("HR5023400093218505986");
//        
//        
//        
//        try {
//            rr.save(r);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        
        new SplashScreen().setVisible(true);
        
        
    }
    
}
