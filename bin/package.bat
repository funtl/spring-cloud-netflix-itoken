rem /* ----- Cloud Service ----- */

cd ..
cd itoken-config
call mvn package -Dmaven.test.skip=true

cd ..
cd itoken-eureka
call mvn package -Dmaven.test.skip=true

cd ..
cd itoken-zipkin
call mvn package -Dmaven.test.skip=true

cd ..
cd itoken-admin
call mvn package -Dmaven.test.skip=true

cd ..
cd itoken-zuul
call mvn package -Dmaven.test.skip=true

rem /* ----- Common Libs ----- */

cd ..
cd itoken-dependencies
call mvn package -Dmaven.test.skip=true

cd ..
cd itoken-common
call mvn package -Dmaven.test.skip=true

cd ..
cd itoken-common-domain
call mvn package -Dmaven.test.skip=true

cd ..
cd itoken-common-service
call mvn package -Dmaven.test.skip=true

cd ..
cd itoken-common-web
call mvn package -Dmaven.test.skip=true

rem /* ----- Service Provider ----- */

cd ..
cd itoken-service-redis
call mvn package -Dmaven.test.skip=true

cd ..
cd itoken-service-sso
call mvn package -Dmaven.test.skip=true

cd ..
cd itoken-service-admin
call mvn package -Dmaven.test.skip=true

cd ..
cd itoken-service-upload
call mvn package -Dmaven.test.skip=true

cd ..
cd itoken-service-posts
call mvn package -Dmaven.test.skip=true

cd ..
cd itoken-service-digiccy
call mvn package -Dmaven.test.skip=true

cd ..
cd itoken-service-collection
call mvn package -Dmaven.test.skip=true

rem /* ----- Service Consumer ----- */

cd ..
cd itoken-web-admin
call mvn package -Dmaven.test.skip=true

cd ..
cd itoken-web-posts
call mvn package -Dmaven.test.skip=true

cd ..
cd itoken-web-backend
call mvn package -Dmaven.test.skip=true

cd ..
cd itoken-web-digiccy
call mvn package -Dmaven.test.skip=true

cd ..