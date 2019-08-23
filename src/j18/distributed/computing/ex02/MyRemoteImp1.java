package j18.distributed.computing.ex02;

import java.rmi.*;
import java.rmi.server.*;

public class MyRemoteImp1 extends UnicastRemoteObject implements MyRemote{
	
	private static final long serialVersionUID = 1L;

	public String sayHello() {
		return "Server says, 'Hey'";
	}
	
	public MyRemoteImp1() throws RemoteException{ 
		}
	
	public static void main(String[] args) {
		try {
			MyRemote service = new MyRemoteImp1();
			Naming.rebind("Remote Hello", service);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	}
