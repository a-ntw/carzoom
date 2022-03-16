git

sqlScript

# git
``` console 
antw@Mac-mini SumProj % git remote add origin https://.../learnj.git
antw@Mac-mini SumProj % git checkout branch3

Mar 15, 2021
antw@Mac-mini mJCap7 % git clone https://github.com/alvintwng/learnj.git
antw@Mac-mini mJCap7 % cd learnj

antw@Mac-mini learnj % pwd             
/Users/antw/ntuc/mJCap7/learnj

antw@Mac-mini learnj % git checkout -b branch4
antw@Mac-mini learnj % git add .
antw@Mac-mini learnj % git commit -m "transfer to /Users/antw/ntuc/mJCap7/learnj"

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
`heroku login` will open browser to login. 
But prior to this, I have login to www.heroku.com
``` console
antw@Mac-mini carzoom % git status                         
On branch master
...
antw@Mac-mini carzoom % git add .
antw@Mac-mini carzoom % git commit -m "Booking system, blocked dates, LocalDateArrayMany.java"
...
antw@Mac-mini carzoom % git push heroku master
 Username for 'https://git.heroku.com': 
 Password for 'https://git.heroku.com': 
 remote: !	WARNING:
 remote: !	Do not authenticate with username and password using git.
 remote: !	Run `heroku login` to update your credentials, then retry the git command.
 remote: !	See documentation for details: https://devcenter.heroku.com/articles/git#http-git-authentication
 fatal: Authentication failed for 'https://git.heroku.com/carzoom.git/'
antw@Mac-mini carzoom % heroku login
 heroku: Press any key to open up the browser to login or q to exit: 
 Opening browser to ...
 Logging in... done
 Logged in as a.......g@gmail.com
antw@Mac-mini carzoom % git push heroku master
 Enumerating objects: 31, done.
 ...
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