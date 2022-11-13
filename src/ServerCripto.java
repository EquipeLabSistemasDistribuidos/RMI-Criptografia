import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServerCripto {
    ServerCripto(){
        System.out.println("Servidor RMI iniciado!");

        try{
            String server = "192.168.1.9";              //endereço
            LocateRegistry.createRegistry(1098);        //porta que será utilizada para o serviço (mas a porta que será passada no comando do cliente, será a porta do rmiregistry)
            System.setProperty("java.rmi.server.hostname", server);      //necessário para declarar o ip do rmi host
            Criptografia obj = new CriptografiaIMP();
            Naming.bind("rmi://"+server+"/CriptografiaService", obj);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ServerCripto();
    } 
}
