echo "Fetch All"
read input
curl -i -X GET -H "Content-Type:application/json" http://localhost:8080/user
echo "Fetch by User name"
read input
curl -i -X GET http://localhost:8080/user/search/findByUsername?username=Matthews
echo "Fetch All"
read input
curl -i -X GET -H "Content-Type:application/json" http://localhost:8080/user
echo "Insert Data"
read input
curl -i -X POST -H "Content-Type:application/json" -d '{ "name" : "Jindal Takla",  "location" : "Jhumritelaiya",  "username" : "TaklaJ" }' http://localhost:8080/user
echo "Fetch All"
read input
curl -i -X GET -H "Content-Type:application/json" http://localhost:8080/user
echo "Update Record"
read input
curl -i -X PUT -H "Content-Type:application/json" -d '{ "name" : "Peter Parker",  "location" : "New York",   "username" : "parker" }' http://localhost:8080/user/61c8a2b85084282209c43af2
echo "Fetch All"
read input
curl -i -X GET -H "Content-Type:application/json" http://localhost:8080/user
echo "Delete User"
read input
curl -i -X DELETE -H "Content-Type:application/json" http://localhost:8080/user/61c8a2b85084282209c43af2
echo "Fetch All"
read input
curl -i -X GET -H "Content-Type:application/json" http://localhost:8080/user
