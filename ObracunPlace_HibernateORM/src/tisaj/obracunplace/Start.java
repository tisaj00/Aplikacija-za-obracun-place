package tisaj.obracunplace;


import tisaj.obracunplace.pomocno.HibernateUtil;
import tisaj.obracunplace.view.LoginForm;


//upogoniti Hibernate prateći https://examples.javacodegeeks.com/enterprise-java/hibernate/hibernate-maven-example/
public class Start {

    public static void main(String[] args) {
        new LoginForm().setVisible(true);
        HibernateUtil.getSession();
        
        
    }
    
}
