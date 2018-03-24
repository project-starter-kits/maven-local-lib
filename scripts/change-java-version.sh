#!/bin/bash
JAVA_OLD_VERSION=8
JAVA_VERSION=10
REG_EXP="s/<java.version>$JAVA_OLD_VERSION<\/java.version>/<java.version>$JAVA_VERSION<\/java.version>/g" 
sed -i -e $REG_EXP demolibrary/pom.xml 
sed -i -e $REG_EXP project/pom.xml 