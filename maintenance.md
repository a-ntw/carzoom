


Heroku PG
``` console
antw@Mac-mini ntuc % heroku help pg
show database information

USAGE
  $ heroku pg [DATABASE]

OPTIONS
  -a, --app=app        (required) app to run command against
  -r, --remote=remote  git remote of app to use

COMMANDS
  pg:backups             list database backups
  pg:bloat               show table and index bloat in your database ordered by most wasteful
  pg:blocking            display queries holding locks other queries are waiting to be released
  pg:connection-pooling  add an attachment to a database using connection pooling
  pg:copy                copy all data from source db to target
  pg:credentials         show information on credentials in the database
  pg:diagnose            run or view diagnostics report
  pg:info                show database information
  pg:kill                kill a query
  pg:killall             terminates all connections for all credentials
  pg:links               lists all databases and information on link
  pg:locks               display queries with active locks
  pg:maintenance         show current maintenance information
  pg:outliers            show 10 queries that have longest execution time in aggregate
  pg:promote             sets DATABASE as your DATABASE_URL
  pg:ps                  view active queries with execution time
  pg:psql                open a psql shell to the database
  pg:pull                pull Heroku database into local or remote database
  pg:push                push local or remote into Heroku database
  pg:reset               delete all data in DATABASE
  pg:settings            show your current database settings
  pg:unfollow            stop a replica from following and make it a writeable database
  pg:upgrade             unfollow a database and upgrade it to the latest stable PostgreSQL version
  pg:vacuum-stats        show dead rows and whether an automatic vacuum is expected to be triggered
  pg:wait                blocks until database is available

antw@Mac-mini ntuc % heroku pg:pull --help    
pull Heroku database into local or remote database

USAGE
  $ heroku pg:pull SOURCE TARGET

OPTIONS
  -a, --app=app                            (required) app to run command against
  -r, --remote=remote                      git remote of app to use
  --exclude-table-data=exclude-table-data  tables for which data should be excluded (use ';' to split multiple names)

DESCRIPTION
  Pull from SOURCE into TARGET.

  TARGET must be one of:
     * a database name (i.e. on a local PostgreSQL server)  => TARGET must not exist and will be created
     * a fully qualified URL to a local PostgreSQL server   => TARGET must not exist and will be created
     * a fully qualified URL to a remote PostgreSQL server  => TARGET must exist and be empty

  To delete a local database run `dropdb TARGET`
  To create an empty remote database, run `createdb` with connection command-line options (run `createdb --help` for details).

  Examples:

       # pull Heroku DB named postgresql-swimmingly-100 into local DB mylocaldb that must not exist
       $ heroku pg:pull postgresql-swimmingly-100 mylocaldb --app sushi

       # pull Heroku DB named postgresql-swimmingly-100 into empty remote DB at postgres://myhost/mydb
       $ heroku pg:pull postgresql-swimmingly-100 postgres://myhost/mydb --app sushi

antw@Mac-mini ntuc % heroku pg:info --app carzoom
=== DATABASE_URL
Plan:                  Hobby-dev
Status:                Available
Connections:           0/20
PG Version:            13.4
Created:               2021-04-07 11:17 UTC
Data Size:             8.8 MB/1.00 GB (In compliance)
Tables:                15
Rows:                  145/10000 (In compliance)
Fork/Follow:           Unsupported
Rollback:              Unsupported
Continuous Protection: Off
Add-on:                postgresql-fitted-27887

antw@Mac-mini mkHeroku % cd dataBk
antw@Mac-mini dataBk % heroku pg:backups:capture --app carzoom
Starting backup of postgresql-fitted-27887... done
antw@Mac-mini dataBk % heroku pg:backups:download --app carzoom
Getting backup from ⬢ carzoom... done, #6
Downloading latest.dump... ████████████████████████▏  100% 00:00 36.44KB    
```
https://devcenter.heroku.com/articles/heroku-postgres-import-export

error in pg_restore
### still unable to convert to sql !
