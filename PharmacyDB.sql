create table Product (
  	IdProduct SERIAL PRIMARY KEY,
	nom varchar (20),
	quantite int,
	description varchar (20),
	 prix DECIMAL(10, 2)
)