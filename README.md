# Audit Test

Example audit API

## Install

- mvn package
- mvn exec:java -Dexec.mainClass="uk.police.scotland.audit.App"
- curl -XPOST http://localhost:4567/audit -d "{'hi':'ok'}"
