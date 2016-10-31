mvn clean test -Denv.OS=machahah -Denv.USER=aaabbb -Dgroups=Sniff
mvn clean test -Denv.OS=machahah -Denv.USER=aaa -DsuiteFile=testng1.xml
mvn clean test -Denv.OS=machahah -Denv.USER=aaa -DsuiteFile=testng2.xml

#rerun failed cases from surefire-reports
mvn clean test -DsuiteFile=testng-failed.xml
