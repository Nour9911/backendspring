# AssignementDEVOPS 

#### Made by:

- Nour MRAD


#### Requirements:
```
Postgres (BD: assignmentBD)
STS (Spring Tools Suite)
NodeJS
Webstorm, Intellij (or others)

```
#### Notes for the backend:

Step 0 : Create manually a database named " assignmentBD " on postgres

Step 1 : Run the springboot application so it will generate all the tables and their constraints in the database

Step 2 : Go to the "roles" table in postgres and insert manually these three roles (so we will be able to do the singup and the login)

--> INSERT INTO public.roles(
	id, name)
	VALUES (1, 'ROLE_ADMIN');

--> INSERT INTO public.roles(
	id, name)
	VALUES (2, 'ROLE_USER');

--> INSERT INTO public.roles(
	id, name)
	VALUES (3, 'ROLE_MODERATOR');


Step 3 : Restart both the springboot and angular application and enjoy! :)

[Backend with Spring BOOT Java](https://gitlab.com/Nour9911/internassignmentbackend.git
).

[Frontend with Angular JS](https://gitlab.com/Nour9911/internassignmentfrontend.git
).



