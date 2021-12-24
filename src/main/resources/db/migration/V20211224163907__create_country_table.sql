CREATE TABLE "country"
(
    "id"          serial PRIMARY KEY,
    "name"        character varying(30) NOT NULL,
    "description" character varying(255) NULL,
    "created_at"  timestamp NULL DEFAULT now(),
    "updated_at"  timestamp NULL DEFAULT now()
);