package password;

import java.util.Random;

public class Caracteres {

    Random obr = new Random();
    String car = "1234567890ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz-*_,./@'¿¡?";
    String num = "1234567890";
    String letters = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
    String lettersm = "abcdefghijklmnñopqrstuvwxyz";
    String special = "-*_,./@'¿¡?";
    char c;
    String password = " ";

    public String GenCon() {
        do{
            password="";
        for (int x = 0; x < 8; x++) {
            c = car.charAt(obr.nextInt(car.length()));
            password = password + c;
        }
        }while(!this.Validar(password));
        return password;
    }

    public boolean Validar(String password) {
        int conn = 0, conl = 0, conlm = 0, cons = 0;
        if(password.length()==8){
        for (int i = 0; i < 8; i++) {
            if (num.contains(""+password.charAt(i))) {
                conn++;
            } else if (letters.contains(""+password.charAt(i))) {
                conl++;
            } else if (lettersm.contains(""+password.charAt(i))) {
                conlm++;
            } else if (special.contains(""+password.charAt(i))) {
                cons++;
            }
        }
         if(conn > 0 && conl > 0 && conlm > 0 && cons > 0) 
                return true;
        }
        return false;
    }
}
