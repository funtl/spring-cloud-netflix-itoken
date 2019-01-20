rem /* ----- Cloud Service ----- */

cd ..
cd itoken-config
call mvn clean

cd ..
cd itoken-eureka
call mvn clean

cd ..
cd itoken-zipkin
call mvn clean

cd ..
cd itoken-admin
call mvn clean

cd ..
cd itoken-zuul
call mvn clean

rem /* ----- Common Libs ----- */

cd ..
cd itoken-dependencies
call mvn clean

cd ..
cd itoken-common
call mvn clean

cd ..
cd itoken-common-domain
call mvn clean

cd ..
cd itoken-common-service
call mvn clean

cd ..
cd itoken-common-web
call mvn clean

rem /* ----- Service Provider ----- */

cd ..
cd itoken-service-redis
call mvn clean

cd ..
cd itoken-service-sso
call mvn clean

cd ..
cd itoken-service-admin
call mvn clean

cd ..
cd itoken-service-upload
call mvn clean

cd ..
cd itoken-service-posts
call mvn clean

cd ..
cd itoken-service-digiccy
call mvn clean

cd ..
cd itoken-service-collection
call mvn clean

rem /* ----- Service Consumer ----- */

cd ..
cd itoken-web-admin
call mvn clean

cd ..
cd itoken-web-posts
call mvn clean

cd ..
cd itoken-web-backend
call mvn clean

cd ..
cd itoken-web-digiccy
call mvn clean

cd ..