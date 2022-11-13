import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import org.jasypt.util.text.BasicTextEncryptor;

public class CriptografiaIMP extends UnicastRemoteObject implements Criptografia{
    public BasicTextEncryptor textEncryptor = new BasicTextEncryptor();     //chave criptografadora

    public CriptografiaIMP() throws RemoteException{
        super();
       	textEncryptor.setPassword("superSenha");
    }

    public String encryptText(String text) throws RemoteException{
        String encryptedText = textEncryptor.encrypt(text);
        System.out.println("Retornando texto criptografado para o cliente: "+encryptedText);
        return encryptedText;
    }
    
    public String decryptText(String text) throws RemoteException{
        String decryptedText = textEncryptor.decrypt(text);
        System.out.println("Retornando texto descriptografado para o cliente: "+decryptedText);
        return decryptedText;
    }
}
