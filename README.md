# SpringREST_API

# get http://localhost:8080/api/users/

output [{"id":1,"frist_name":"prabhat","last_name":"pankaj","email_id":"prabhat.pankaj@gmail.com"}]

# post http://localhost:8080/api/user/

output 

{
    "timestamp": 1498443503678,
    "status": 400,
    "error": "Bad Request",
    "exception": "org.springframework.http.converter.HttpMessageNotReadableException",
    "message": "JSON parse error: Can not deserialize instance of com.exaple.objects.User out of START_ARRAY token; nested exception is com.fasterxml.jackson.databind.JsonMappingException: Can not deserialize instance of com.exaple.objects.User out of START_ARRAY token\n at [Source: java.io.PushbackInputStream@1546ea93; line: 1, column: 1]",
    "path": "/api/user/"
}


