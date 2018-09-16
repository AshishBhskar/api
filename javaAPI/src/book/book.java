package book;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/book")
public class book {


		@GET
	    @Produces(MediaType.TEXT_XML)
		
	   public String sayhelloxml()
	{
		String resource="<?xml vesion='1.0' ?>" +
				"<hello> Hello World </hello>";
		return resource;
		}
	}
		
	   /*@GET
	   @Produces(MediaType.APPLICATION_JSON)
	   public String sayhellojson()
		   {
		   	String resource=null;
		   	return resource;
		   	}
	   
	   @GET
	   @Produces(MediaType.TEXT_HTML)
	   public String sayhellohtml()
		   {
		   	String resource="<h1>Hello World</h1>";
		   	return resource;
		   	}
	}
	*/

