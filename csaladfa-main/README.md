endpoints:  

http://localhost:8080/  

GET person/reference/:name  

GET person/:id  

GET person/create    (example object)  

GET person/update    (example object)  

PUT person/update/:id   

POST person/create  

DELETE person/del/:id  




Get /person/{id}

{"id":4,"name":"Ákos","sex":false,"birthDate":"2001-05-09T22:00:00.000+00:00","birthLocation":"Pécs","motherId":2,"motherName":"Laura","fatherId":null,"fatherName":null,"deathDate":null,"deathLocation":null,"childId":null,"childName":null}

Post /person

{"name":"Ákos",  REQUIRED
"sex":false, REQUIRED
"birthDate":"2001-05-09T22:00:00.000+00:00", REQUIRED
"birthLocation":"Pécs", REQUIRED
"motherId":2, 
"motherName":"Laura",
"fatherId":null,
"fatherName":null,
"deathDate":null,
"deathLocation":null,
"childId":null,
"childName":null}

get id=1 / name matches ádám (LIKE %name%)
{"id":1,"name":"Ádám","sex":false,"birthDate":"1968-01-01","birthLocation":"Nagykanizsa","motherId":null,"motherName":null,"fatherId":null,"fatherName":null,"deathDate":null,"deathLocation":null,"children":[{"id":2,"name":"Laura"},{"id":7,"name":"Miklós"},{"id":8,"name":"Mihály"}]}

post
{"name":"Miklós","sex":false,"birthDate":"1983-11-03","birthLocation":"Miskolc","motherId":3,"motherName":"Angi","fatherId":1,"fatherName":"Ádám","deathDate":null,"deathLocation":null,"children":[{"id":15,"name":"Lilla"}]}

put id = 7
{"id":7,"name":"Miklós","sex":false,"birthDate":"1983-11-03","birthLocation":"Miskolc","motherId":3,"motherName":"Angi","fatherId":1,"fatherName":"Ádám","deathDate":null,"deathLocation":null,"children":[]}


