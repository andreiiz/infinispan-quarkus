//package org.vargroup;
//import javax.enterprise.context.ApplicationScoped;
//import javax.enterprise.event.Observes;
//import javax.inject.Inject;
//import org.infinispan.client.hotrod.RemoteCache;
//import org.infinispan.client.hotrod.RemoteCacheManager;
//import io.quarkus.runtime.StartupEvent;
//
//@ApplicationScoped
//public class RemoteCacheConfig {
//	
//    @Inject
//    RemoteCacheManager cacheManager;
// 
//    
//     void onStart(@Observes StartupEvent ev) {
//   RemoteCache<String, String> tri = cacheManager.getCache("test");  //solo cambiato il nome
//    tri.put("hellooooqqqqqq", "hellowolFromQuarkus");
//    }
//}

	
