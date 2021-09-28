git

sqlScript

export as CSV file 

# git
``` console 
antw@Mac-mini SumProj % git remote add origin https://.../learnj.git
antw@Mac-mini SumProj % git checkout branch3

Mar 15, 2021
antw@Mac-mini mJCap7 % git clone https://github.com/alvintwng/learnj.git
antw@Mac-mini mJCap7 % cd learnj

antw@Mac-mini learnj % pwd             
.../ntuc/mJCap7/learnj

antw@Mac-mini learnj % git checkout -b branch4
antw@Mac-mini learnj % git add .
antw@Mac-mini learnj % git commit -m "transfer to .../ntuc/mJCap7/learnj"

Mar 27, 2021
antw@Mac-mini learnj % git diff
antw@Mac-mini learnj % git status
On branch branch4
Your branch is up to date with 'origin/branch4'
antw@Mac-mini learnj % git add .
antw@Mac-mini learnj % git commit -m "Delete Confimration Alert for: Customer, Vehicle, Hire" 

antw@Mac-mini learnj % git push -u origin branch4   

```
# git Heroku
``` console
antw@Mac-mini carzoom % git status                         
On branch master
...
antw@Mac-mini carzoom % git add .
antw@Mac-mini carzoom % git commit -m "Booking system, blocked dates, LocalDateArrayMany.java"
...
antw@Mac-mini carzoom % git push heroku master
Enumerating objects: 52, done.

```

# sqlScript
``` sql
insert into ROLE (NAME)  values  ('ADMIN');
insert into ROLE (NAME)  values  ('MANAGER');
insert into ROLE (NAME)  values  ('USER');

insert into EMPLOYEE (EMAIL, EMP_FULL_NAME, EMPNAME, ISACTIVE, JOB_TITLE, PASSWORD, PHONE_NO, PSWD_EXPIRY, USER_EXPIRY)
            VALUES ('root@carDate.com', 'Simon Sridhar', 'root', 1, 'Director', '$2y$12$B6v4.Xt3A/Ru850pmXwzjunyTZJkcv3kTOekHB2.vU/jmh31I9XiG',
                    '+9198989897', '27-MAY-2021', '27-JUL-2021');
Insert into EMPLOYEE (EMAIL, EMP_FULL_NAME, EMPNAME, ISACTIVE, JOB_TITLE, PASSWORD, PHONE_NO, PSWD_EXPIRY, USER_EXPIRY) 
            values ('ntuc@ntuc.com',    'ntuc',          'ntuc', 1, 'Manager',  '$2y$12$HhTBWJSyOmHzJV54PwvgeeSOpsVb03sN1x9evySaF3Q0Kc8TXQygq',
                    '88888888',   '27-MAY-2021',  '27-JUL-21');


               
insert into VEH_STATUS (NAME)  values  ('FREE');
insert into VEH_STATUS (NAME)  values  ('HIRED');
```
---
## export as CSV file
Dataclip results can be downloaded in CSV and JSON formats. To download the results to your local machine as a CSV or JSON file,

Select `Resources` > `Heroku Postgres` > `Dataclips` > select the clip or `Create Dataclip` then

``` sql
            SELECT
            *
            FROM
            customer
```
`Save & Run`

To download as CSV or JSON, click the corresponding button in the results section.

## import to Oracle DB Developer VM
* Select the table in the navigation tree.
* Right click and select 'import data'.
* Follow the instructions in the wizard.

for instance
* copy and paste table-data to oracle terminal
* need to convert false, true to 0, 1. in Vim can use `:%s/false/0/g` for replacement.
``` console
            [oracle@localhost ~]$ vi cust_state.csv
            [oracle@localhost ~]$ cat cust_state.csv
            custstateid,isdriver,name
            1,0,Cat A
            2,0,Cat B
            3,0,Cat C
            [oracle@localhost ~]$ 
```
* during the selection column, unselect id, for instance custstateid move to left.
