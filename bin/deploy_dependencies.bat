cd ..
cd itoken-dependencies
call mvn clean deploy

cd ..
cd itoken-common
call mvn clean deploy

cd ..
cd itoken-common-domain
call mvn clean deploy

cd ..
cd itoken-common-service
call mvn clean deploy

cd ..
cd itoken-common-web
call mvn clean deploy

cd ..