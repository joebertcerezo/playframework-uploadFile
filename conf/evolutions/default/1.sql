-- !Ups
CREATE TABLE "USERS" (
  "ID" UUID,
  "NAME" VARCHAR,
  "EMAIL" VARCHAR UNIQUE,
  "USERNAME" VARCHAR UNIQUE,
  "PASSWORD" VARCHAR,
  "AVATAR" VARCHAR,
  PRIMARY KEY ("ID")
);

-- !Downs
DROP TABLE "USERS";
