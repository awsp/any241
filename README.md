## App Sample, using Play Framework (version 2.4.2)
------------


## Requirement & Installation

Install Java 8 on Ubuntu
```
apt-add-repository ppa:webupd8team/java
apt-get update
apt-get install oracle-java8-installer
```


## Objectives
------------
* Classes & Interfaces [OK]
* Repositories in practice [DbPageRepo.java, PageRepoInterface.java]
* Dependency Injection - [DepInjectionExample.java]
* Database 
    * Access        
    * Query Builder
    * Various Database Type
        * MySQL
        * DB2
        * Orcale
        * MongoDB
        * MSSQL
        * PostgreSQL
    * ORM - EBean
        * Basic CRUD
        * Relationships
            * 1-1
            * 1-n
            * m-n
            * Polymorphic relations
        * Validation
    * Configurations
    * Migrations and Evolutions
    * Pagination
* Routes
    * Wildcard supports including reg. expressions
    * REST supports, resourceful controller
    * Errors handling. (404, 500, etc)
    * Grouping
* Email
    * Send email    
* Templating
    * Data communication
    * Imports, includes and injects
    * Layout setup        
* Assets
    * Static serving
    * LESS
* Forms
    * Validation
    * CRUD
    * GET-POST-Redirect
    * Error handling
* Sessions
    * Maintaining user sessions
    * Save/Load sessions
* Authentication
    * User authentication
    * Route protection
    * Security filters
* Localization
    * I18n supports
* Unit Testing
    * JUnit
* Other / Unrelated
    * NginX
        * Load balancer
        * Proxy
    * Plugins / Libraries supports    
        * SBT
            * Load 3rd party libraries
        * J2SE
        * Custom written libraries
    