package MongoDB;

import java.util.logging.Logger;
import java.util.logging.Level;
import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.MongoSocketException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class Connection {
	
	
		 	
			MongoClient mongoClient;
			MongoDatabase dataBase;
			MongoCollection<Document> Person;
			 private static final Logger LOGGER = Logger.getLogger(Connection.class.getName());

			
			
			public Connection()  {
				try {
					
					mongoClient = new MongoClient("localhost",27017);
					
					dataBase = mongoClient.getDatabase("Q_05");
					
					Person = dataBase.getCollection("Person");
					
					System.out.println("Conexão efetuada com sucesso");
					
				} catch (MongoSocketException e) {
					LOGGER.log(Level.SEVERE, null, e);
					
					
				}
			}
				
				public boolean insert() {
					try {
			            Document address = new Document("zip",1234)
			                    .append("street", "Willow Lane")
			                    .append("complement", "House")
			                    .append("neighborhood", "Peter")
			                    .append("city","Sunnyville")
			                    .append("state","California")
			                    .append("country","USA");
			            
			            Document document = new Document("Object", "value")
			                    .append("name", "João")
			                    .append("age", 22)
			                    .append("phone", "2222-3333")
			                    .append("height", "78 kg")
			                    .append("email", "joao@gmail.com")
			                    .append("cpf", "444.555.666-06")
			                    .append("birthday", "28/04/1998")
			                    .append("address", address);
			            
			            Person.insertOne(document);
			            
			            return true;
			            
			        } catch (Exception e) {
			            LOGGER.log(Level.SEVERE, null, e);
			            return false;
			        }
			    }
				
				public void show() {
					MongoCursor<Document> cursor = Person.find().iterator();
					while(cursor.hasNext()) {
						System.out.println(cursor.next());
					}
					
					cursor.close();
					
				}
			
}
				




