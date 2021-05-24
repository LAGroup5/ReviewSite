DROP TABLE IF EXISTS reviews CASCADE;

CREATE TABLE reviews (
  id SERIAL PRIMARY KEY,
  reviewer_name VARCHAR(255),
  star_rating INTEGER not null,
  review TEXT,
  trail_id INTEGER REFERENCES trails(id)
);