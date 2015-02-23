# Audit Test

Example audit API

![screen](https://github.com/gaving/audit-api/raw/master/docs/1.png)

## Install

- mvn package
- mvn exec:java -Dexec.mainClass="uk.police.scotland.audit.App"
- curl -XPOST http://localhost:4567/audit -d "{'hi':'ok'}"
