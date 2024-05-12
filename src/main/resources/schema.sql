DROP TABLE IF EXISTS account;
CREATE TABLE account (
	account_ref_id VARCHAR(255) NOT NULL,
	user_ref_id VARCHAR(255) NOT NULL,
	account_no VARCHAR(20) NOT NULL,
	account_name VARCHAR(255) NOT NULL,
	account_balance decimal(17,2) NOT NULL,
	status VARCHAR(10) NOT NULL,
	created_date datetime NOT NULL,
	PRIMARY KEY(account_ref_id)
);