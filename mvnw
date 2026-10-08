#!/bin/sh
PRG="$0"
while [ -h "$PRG" ]; do
  ls=`ls -ld "$PRG"`
  link=`expr "$ls" : '.*-> \(.*\)$'`
  if expr "$link" : '/.*' > /dev/null; then
    PRG="$link"
  else
    PRG=`dirname "$PRG"`/"$link"
  fi
done
SAVED="`pwd`"
cd "`dirname \"$PRG\"`" >/dev/null
APP_DIR="`pwd -P`"
cd "$SAVED" >/dev/null

WRAPPER_JAR="$APP_DIR/.mvn/wrapper/maven-wrapper.jar"
exec java -jar "$WRAPPER_JAR" "$@"
