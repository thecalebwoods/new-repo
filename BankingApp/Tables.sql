


CREATE TABLE customers (
id serial PRIMARY KEY,
user_name Varchar(50),
pass_word varchar(50),
email varchar(50),
phone integer
);
	
CREATE TABLE accounts ( 
	id serial PRIMARY KEY,
	priv_acc integer NOT NULL,
	balance integer
);
CREATE TABLE junction (
	id serial PRIMARY KEY,
	user_request integer REFERENCES customers(id) NOT NULL,
	acc_receive integer REFERENCES accounts(id) NOT NULL
	);




DELETE FROM customers WHERE id > 0;
DELETE FROM accounts WHERE id > 0;

ALTER TABLE customers
	add COLUMN full_name varchar(50);

ALTER TABLE accounts 
		DROP COLUMN priv_acc;

CREATE ROLE banking WITH LOGIN PASSWORD 'password$'
GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA public to banking;
GRANT ALL PRIVILEGES ON ALL SEQUENCES IN SCHEMA public to banking;

INSERT INTO accounts (priv_acc, balance) VALUES ('2', '12345')
INSERT INTO customers (user_name, pass_word, phone, email, full_name) VALUES ('cwoods5', 'pass', 1234567890, 'the@gmail', 'Caleb Woods' )
