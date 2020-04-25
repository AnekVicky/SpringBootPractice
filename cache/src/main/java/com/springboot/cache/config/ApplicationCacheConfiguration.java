package com.springboot.cache.config;

import net.sf.ehcache.CacheManager;
import net.sf.ehcache.config.CacheConfiguration;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableCaching
@Configuration
public class ApplicationCacheConfiguration extends CachingConfigurerSupport {

 /*
  this caching is explicitly using net.sf.CacheManager and  net.sf.CacheConfiguration
  But Spring EhCacheManagerFactoryBean internally uses this only

    */

    @Bean
    public net.sf.ehcache.CacheManager ehCacheManager(){


        CacheConfiguration cacheConfiguration = new CacheConfiguration();
                           cacheConfiguration.setName("studentCache");
                           cacheConfiguration.setMemoryStoreEvictionPolicy("LRU");
                           cacheConfiguration.setMaxEntriesLocalHeap(10);
                           cacheConfiguration.setTimeToLiveSeconds(1000);

        net.sf.ehcache.config.Configuration config = new net.sf.ehcache.config.Configuration();
        config.addCache(cacheConfiguration);


        return CacheManager.newInstance(config);


    }

    @Bean

    public org.springframework.cache.CacheManager cacheManager(){

        return new EhCacheCacheManager(ehCacheManager());
    }




}
