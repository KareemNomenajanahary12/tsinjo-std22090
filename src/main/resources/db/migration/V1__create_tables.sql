-- Table Donor
CREATE TABLE donor (
                       id BIGSERIAL PRIMARY KEY,
                       email VARCHAR(255) NOT NULL Unique ,
                       full_name VARCHAR(255) NOT NULL
);

-- Table Beneficiary
CREATE TABLE beneficiary (
                             id BIGSERIAL PRIMARY KEY,
                             email VARCHAR(255) NOT NULL unique,
                             full_name VARCHAR(255) NOT NULL
);

-- Table Payment
CREATE TABLE payment (
                         id BIGSERIAL PRIMARY KEY,
                         amount NUMERIC(12, 2) NOT NULL,
                         payment_method VARCHAR(100) NOT NULL,
                         payment_date TIMESTAMP NOT NULL,
                         vola_payment_id VARCHAR(100),
                         status VARCHAR(50) NOT NULL
);

-- Table Donation
CREATE TABLE donation (
                          id BIGSERIAL PRIMARY KEY,
                          donor_id BIGINT NOT NULL REFERENCES donor(id),
                          payment_id BIGINT NOT NULL REFERENCES payment(id),
                          created_at TIMESTAMP NOT NULL
);

-- Table Help
CREATE TABLE help (
                      id BIGSERIAL PRIMARY KEY,
                      beneficiary_id BIGINT NOT NULL REFERENCES beneficiary(id),
                      payment_id BIGINT NOT NULL REFERENCES payment(id),
                      accident_description TEXT NOT NULL,
                      created_at TIMESTAMP NOT NULL
);
