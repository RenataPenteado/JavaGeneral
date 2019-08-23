package j18.distributed.computing.ex02;

import java.rmi.*;

public interface MyRemote extends Remote {
	
	public String sayHello() throws RemoteException;

}
