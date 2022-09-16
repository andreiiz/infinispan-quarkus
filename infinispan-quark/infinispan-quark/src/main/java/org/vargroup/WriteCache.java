package org.vargroup;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.infinispan.client.hotrod.RemoteCache;
import org.infinispan.client.hotrod.RemoteCacheManager;

import io.quarkus.infinispan.client.Remote;

@Path("/infinispan")
public class WriteCache {
	
//	@Inject
//    @Remote("test")
// //   RemoteCache<String, String> cache;
	
    @Inject
    RemoteCacheManager cacheManager;
//	@Inject
//    RemoteCacheManager cacheManagerr;
	RemoteCache<String, String> cache = cacheManager.getCache("sap-test");

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        
    	String result = cache.get("111");
    	return result;
    }
}
