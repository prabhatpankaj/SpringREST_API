# SpringREST_API

# get http://localhost:8080/api/users/

curl -H "Content-Type: application/json" -X GET http://localhost:8080/api/users/

output [{"id":1,"frist_name":"prabhat","last_name":"pankaj","email_id":"prabhat.pankaj@gmail.com"}]

# post http://localhost:8080/api/user/

curl -d '{"frist_name":"name1", "last_name":"name2", "email_id":"email@example.com"}' -H "Content-Type: application/json" -X POST http://localhost:8080/api/user/

# put http://localhost:8080/api/user/1

