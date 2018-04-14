This is Spring cache Demo using ehcache

Process:

1. First we have to create the cache manager in a config class. There are many provided by Spring and one of them is EhCacheCacheManager and we have used it here,

2. We have to enable caching on config class using @EnableCaching annotation,

3. We also have provide the caching configuration using EhCacheManagerFactory bean. This bean read the our necessary configurations from resource configuration file like ehcache.xml,(We can configure multiple cache using cache names and keys, this is very useful when we have multiple caching requirements in a project),

4. Then we create a component and annotate a business method @cacheable because we want the incoming data to be cached after first retrieval,

5. Please rememeber to visit http://www.ehcache.org/documentation/2.7/apis/cache-eviction-algorithms.html for caching mechanisms used in ehCache(reference ehcache we used LFU - Least Frequently Used)

6. Create a repository interface(class) to retrieve the data,

7. expose the resource like UserResource we have coded using the endpoints

8. Since we are using JPA make sure you are annotating the resource class with JPARepositories

* You may need to change the caching structure a little bit as there are sme more ehcache versions are released which needs little bit tweaking in the code.
