create table company (
    com_id bigserial, 
    com_name varchar(50),
    com_sales bigint,
    PRIMARY KEY(com_id)
    );

create table tenpo (
    ten_id bigserial, 
    ten_name varchar(50),
    com_id bigint,
    ten_sales bigint,
    PRIMARY KEY(ten_id),
    FOREIGN KEY(com_id) 
        REFERENCES company(com_id)
    );

create table product (
    pro_id bigserial, 
    pro_name varchar(50),
    PRIMARY KEY(pro_id)
    );

create table inventory (
    pro_id bigint, 
    ten_id bigint, 
    pro_inv INTEGER,
    PRIMARY KEY(ten_id,pro_id),
    FOREIGN KEY(ten_id) 
        REFERENCES tenpo(ten_id),
    FOREIGN KEY(pro_id) 
        REFERENCES product(pro_id)
    );