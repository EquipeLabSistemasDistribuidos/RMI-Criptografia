import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Criptografia extends Remote{
    public String encryptText(String text) throws RemoteException;
    public String decryptText(String text) throws RemoteException;
}
