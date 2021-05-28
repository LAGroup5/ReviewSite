DROP TABLE IF EXISTS trails CASCADE;
CREATE TABLE trails (
  id SERIAL PRIMARY KEY,
  name VARCHAR(255) not null,
  difficulty INTEGER not null,
  description TEXT not null,
  hike_length_miles INTEGER not null,
  elevation_gain_ft INTEGER not null,
  pass_required BOOLEAN DEFAULT false not null,
  family_friendly BOOLEAN DEFAULT false not null,
  pet_friendly BOOLEAN DEFAULT false not null
);