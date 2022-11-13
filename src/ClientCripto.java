import java.io.*;
import java.rmi.Naming;
public class ClientCripto {
    public static void main(String[] args) throws Exception {
        try{
            String server = "localhost";
            String porta = "1099";

            Criptografia c = (Criptografia) Naming.lookup("rmi://"+server+":"+porta+"/CriptografiaService");
            BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.print("Digite o texto a ser enviado ao servidor: ");
            String sentence = inFromUser.readLine();
            String criptText = c.encryptText(sentence);
            System.out.println(criptText);
            String decriptText = c.decryptText(criptText);
            System.out.println(decriptText);
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
