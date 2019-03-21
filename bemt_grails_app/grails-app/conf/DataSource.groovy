dataSource {
    pooled = true
    driverClassName = "oracle.jdbc.driver.OracleDriver"
    dialect = "org.hibernate.dialect.OracleDialect"
}

hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory' // Hibernate 3
//    cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory' // Hibernate 4
}

// environment specific settings
environments {
    development {
        dataSource {
          pooled=true
          dbCreate = "update" // one of 'create', 'create-drop','update'
//          username = "*"
//	  password = "*"
//	  url = "jdbc:oracle:thin:@localhost:1521:orcl"
            username = '*' 
            password = '*'
            url = "jdbc:oracle:thin:@localhost:1521:orcl"
//            pooled=true
//            dbCreate = "update"
//            username = '*' 
//            password = '*'
//            url = "jdbc:oracle:thin:@localhost:1521:orcl"
        }
    }

// Oracle URLs can be of form jdbc:oracle:thin:user/pw@localhost:1521:SID but can leave out user and pw
// and set as sep params
    test {
        dataSource {
            pooled=true
            dbCreate = "update"
            username = '*' 
            password = '*'
            url = "jdbc:oracle:thin:@localhost:1521:orcl"
            dbCreate = 'update'
        }
    }
    production {
        dataSource {
            //******************************************************************
            //never ever ever ever! set this to create-drop!  
            //You will wipe out the production DB!
            dbCreate = "update"  
            //******************************************************************
            username = '*' 
            password = '*$'
            url = "jdbc:oracle:thin:@localhost:1521:orcl"
//            username = '*' 
//            password = '*'
//            url = "jdbc:oracle:thin:@localhost:1521:orcl"
            properties {
               maxActive = -1
               minEvictableIdleTimeMillis=1800000
               timeBetweenEvictionRunsMillis=1800000
               numTestsPerEvictionRun=3
               testOnBorrow=true
               testWhileIdle=true
               testOnReturn=false
               validationQuery="SELECT 1"
               jdbcInterceptors="ConnectionState"
            }
        }
    }
}
