import java.net.InetAddress;
import java.net.UnknownHostException;

import org.hive2hive.core.api.H2HNode;
import org.hive2hive.core.api.configs.FileConfiguration;
import org.hive2hive.core.api.configs.NetworkConfiguration;
import org.hive2hive.core.api.interfaces.IFileConfiguration;
import org.hive2hive.core.api.interfaces.IH2HNode;
import org.hive2hive.core.api.interfaces.INetworkConfiguration;


public class P2PClient {

	/**
	 * @param args
	 * @throws InterruptedException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws InterruptedException, UnknownHostException {		
		/*
		 * Configuration		
		 */
				// initial peer configuration
				INetworkConfiguration initialNodeConfig = NetworkConfiguration.create("client");
				 
				// node peer configuration with bootstrap address
				INetworkConfiguration nodeConfig = NetworkConfiguration.create("nodeID", InetAddress.getByName("localhost"));
				 
				// default file configuration
				IFileConfiguration defaultFileConfig = FileConfiguration.createDefault();
				 
				// custom file configuration:
				// max. file size: 10 MB
				// nr. of versions: 20
				// max. size of all versions: 200 MB
				// chunk size: 1 MB
				IFileConfiguration customFileConfig = FileConfiguration.createCustom(10 * 1024 * 1024, 20, 20 * 10 * 1024 * 1024, 1024 * 1024);
				

				
		/*
		* Peer Creation	
		*/
				

				IH2HNode node = H2HNode.createNode(initialNodeConfig, defaultFileConfig);
				node.connect();
				 
				while(true){
					Thread.sleep(500);
				}
				 
			//	node.disconnect();
				
		
	}

}
