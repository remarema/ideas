import java.io.FileNotFoundException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import org.hive2hive.core.api.H2HNode;
import org.hive2hive.core.api.configs.FileConfiguration;
import org.hive2hive.core.api.configs.NetworkConfiguration;
import org.hive2hive.core.api.interfaces.IFileConfiguration;
import org.hive2hive.core.api.interfaces.IH2HNode;
import org.hive2hive.core.api.interfaces.INetworkConfiguration;
import org.hive2hive.core.exceptions.IllegalFileLocation;
import org.hive2hive.core.exceptions.NoPeerConnectionException;
import org.hive2hive.core.exceptions.NoSessionException;


public class P2PRoot {
	
	private static String ip = "127.0.0.1";
	private static String networkName = "first";
	private static String networkName2 = "second";


	/**
	 * @param args
	 * @throws UnknownHostException 
	 * @throws IllegalFileLocation 
	 * @throws NoPeerConnectionException 
	 * @throws NoSessionException 
	 * @throws IllegalArgumentException 
	 * @throws FileNotFoundException 
	 * @throws InterruptedException 
	 * @throws type filter text 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

				INetworkConfiguration initialNodeConfig = NetworkConfiguration.create("root");
				IFileConfiguration defaultFileConfig = FileConfiguration.createDefault();
				H2HNode.createNode(initialNodeConfig, defaultFileConfig).connect();
				
				while(true){
					Thread.sleep(500);
				}
		

		
/*
* User Management
*/	
		
/*
		IUserManager userManager = node.getUserManager();
		 
		UserCredentials credentials = new UserCredentials("userID", "password", "1234");
		 
		// register the user
		userManager.register(credentials);
		 
		// define the root folder for the user
		Path rootPath = Paths.get(System.getProperty("user.home"), "Hive2Hive", "userID");
		 
		// login the user and provide the local root directory path
		userManager.login(credentials, rootPath);
		 
		// do stuff (e.g., file management)
		 
		// logout the currently logged in user
		userManager.logout();
		
*/		
			
/*
* File Management
*/		
		
/*		
		
		IFileManager fileManager = node.getFileManager();
		 
		File folder = new File("demo-folder");
		File file = new File(folder, "demo-file");
		 
		// add a file
		fileManager.add(file);
		 
		// share a folder with another user (write permission)
		fileManager.share(folder, "otherUser", PermissionType.WRITE);
		 
		// update a file
		fileManager.update(file);
		 
		// recover a file's other version
		IVersionSelector versionSelector = new IVersionSelector() {
			@Override
			public IFileVersion selectVersion(List availableVersions) {
				return (IFileVersion) availableVersions.get(0);
			}
		};
		fileManager.recover(file, versionSelector);
		 
		// move a file in the file hierarchy
		File otherFolder = new File("other-demo-folder");
		fileManager.move(folder, otherFolder);
		 
		// delete a file
		fileManager.delete(file);
*/			 
		
		
	}

}
