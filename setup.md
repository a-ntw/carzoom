setup on desktop
---

#### Hardware
* os: macOS Big Sur
* Mac mini (2018)
* Processor: 3.6 GHz Quad-Core Intel Core i3
* Memory: 8 GB 2667 MHz DDR4
* Graphics: Intel UHD Graphics 630 1536 MB

#### Software install
* Oracle: https://www.oracle.com/database/technologies/databaseappdev-vm.html
  * Oracle VM Virtual Box
  * Oracle DB Developer VM 
  * for my case, SQL Developer in the VM work the next day! Guess need to restart the computer to work..
  * Editor use: Spring Tool Suite 4

#### Database configure
  * username=sumproj, password=sumproj ref from [application.properties](/src/main/resources/application.properties)

terminal oracle@localhost:~ 
``` sql
[oracle@localhost ~]$ 
[oracle@localhost ~]$ sqlplus sys/oracle as sysdba

SQL*Plus: Release 19.0.0.0.0 - Production on Sat Aug 21 00:34:12 2021
Version 19.3.0.0.0

Copyright (c) 1982, 2019, Oracle.  All rights reserved.


Connected to:
Oracle Database 19c Enterprise Edition Release 19.0.0.0.0 - Production
Version 19.3.0.0.0

SQL> create user sumproj
  2  identified by sumproj
  3  default tablespace users
  4  temporary tablespace temp
  5  quota unlimited on users
  6  password expire;

User created.

SQL> grant connect, resource to sumproj;

Grant succeeded.

SQL> grant create view to sumproj;

Grant succeeded.

SQL> conn sumproj/sumproj
ERROR:
ORA-28001: the password has expired


Changing password for sumproj
New password: 
Retype new password: 
Password changed
Connected.
SQL> exit
Disconnected from Oracle Database 19c Enterprise Edition Release 19.0.0.0.0 - Production
Version 19.3.0.0.0
[oracle@localhost ~]$ 
```
* open Oracle SQL Developer in VM
  * New Connection ( the green plus icon)
    * Name: sumproj
    * Username sumproj
    * Password: sumproj
    * Service name: orcl
  * => Connect
  * Exit

#### Initialize with a employee with role `ADMIN`

* Oracle SQL Developer, add in data `ADMIN`, `MANAGER`, and 'USER` in table `ROLE`. 

* need to temporary edit the following 3 codes to create employee `ADMIN` data.  Im using Spring Tool Suite ro edit
  * java/carDate/AddSecurity.java - Uncomment line 27 to line 40, and comment off line 47 to line 88
  * java/carDate.emp/MyUserDetailService.java - commented all, ie not use.
  * resources/templates/common.html - edit authoize in line 55 to `sec:authorize="hasAnyAuthority('ADMIN','ROLE_ADMIN')">`

* Spring Tool Suite
  * run the software, learnj . 
  * Open the browser with 'localhost:8080'. 
  * login as `ntuc`/`ntuc`. 
  * Create the Employee profile with role 'ADMIN'. 
  * After created employee, undo the 3 codes, AddSecurity.java, MyUserDetailService.java & common.html . 

---
