
https://stackoverflow.com/questions/57589090/spring-client-cannot-register-with-eureka-minishift
~~~

curl -I discovery-service-firstservice.192.168.42.79.nip.io/eureka/apps
HTTP/1.1 200 
Content-Type: application/xml
Transfer-Encoding: chunked
Date: Tue, 03 Sep 2019 12:38:34 GMT
Set-Cookie: 57b87239caacc3710c925d905cb86c53=08dd197dfaf4f9c2cea425882e295a70; path=/; HttpOnly
Cache-control: private

~~~

# spring-cloud-gateway

~~~~
sh-4.2$ curl -I http://localhost:8761       
HTTP/1.1 200 
Content-Type: text/html;charset=UTF-8
Content-Language: en-US
Content-Length: 4620
`Date: Mon, 26 Aug 2019 08:20:12 GMT`
~~~~


~~~~
curl --header "X-second-Header:X-second-Header" http://localhost:8087/second
X-second-Header
~~~~
