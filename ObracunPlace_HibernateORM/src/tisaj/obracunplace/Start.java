package tisaj.obracunplace;

import java.util.ArrayList;
import java.util.List;
import tisaj.obracunplace.controller.ObradaRadnik;
import tisaj.obracunplace.model.Radnik;
import tisaj.obracunplace.pomocno.ObracunPlaceException;
import tisaj.obracunplace.view.SplashScreen;

//upogoniti Hibernate prateći https://examples.javacodegeeks.com/enterprise-java/hibernate/hibernate-maven-example/
public class Start {

    public static void main(String[] args) {

//        ObradaRadnik or = new ObradaRadnik();
//        Radnik r;
//        List<Radnik> rr = new ArrayList<>();
//        for (int i = 0; i < 1000; i++) {
//
//            r = new Radnik();
//            r.setIme("Polaznik b" +i);
//            r.setPrezime("Prezime b" +i);
//            r.setSpol("M");
//            r.setOib("98544075463");
//            r.setIban("HR1210010051863000160");
//            r.setDatumRodenja(null);
//            r.setMobitel("0988569712");
//            r.setOpcinaPrebivaliste("AA");
//            r.setOsnovicaPoSatu("55");
//
//            rr.add(r);
//           
//        }
//        
//         try {
//                or.save(rr);
//            } catch (ObracunPlaceException ex) {
//                ex.printStackTrace();
//            }

        new SplashScreen().setVisible(true);

    }

}
