package org.vargroup;

import javax.inject.Inject;

import org.infinispan.client.hotrod.RemoteCache;
import org.infinispan.client.hotrod.RemoteCacheManager;

import io.quarkus.infinispan.client.Remote;

public class RemoteCacheConfig {


    @Inject RemoteCacheConfig(RemoteCacheManager remoteCacheManager) {
       this.remoteCacheManager = remoteCacheManager;
    }

    @Inject @Remote("sapp-tet")
    RemoteCache<String, String> cache;
 
    RemoteCacheManager remoteCacheManager;
    
    void onStart() {
    cache.put("helloDaskaril", "hellowolFromQuarkus");
    }

}
