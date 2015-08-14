
## setup

http://wiki.apache.org/cassandra/GettingStarted


1. download cassandra 2.2.0
2. `bin/cassandra -f`
3. `bin/cqlsh`
4. `CREATE KEYSPACE mykeyspace WITH REPLICATION = { 'class' : 'SimpleStrategy', 'replication_factor' : 1 };`
5. `CREATE TABLE mykeyspace.users (
      user_id int PRIMARY KEY,
      fname text,
      lname text
    );`