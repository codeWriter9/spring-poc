curl -i -X POST -H "Content-Type:application/json" -d '{ "name" : "Jindal Takla",  "location" : "Jhumritelaiya",  "username" : "TaklaJ" }' http://localhost:8080/user
curl -i -X GET -H "Content-Type:application/json" http://localhost:8080/user
curl -i -X PUT -H "Content-Type:application/json" -d '{ "name" : "Peter Parker",  "location" : "New York",   "username" : "parker" }' http://localhost:8080/user/61c89b33439fad212794c62b
curl -i -X GET -H "Content-Type:application/json" http://localhost:8080/user
curl -i -X DELETE -H "Content-Type:application/json" http://localhost:8080/user/61c89b33439fad212794c62b
curl -i -X GET -H "Content-Type:application/json" http://localhost:8080/user
