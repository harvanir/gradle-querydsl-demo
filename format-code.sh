#!/usr/bin/env sh
mkdir -p .cache
cd .cache
pwd

formatter_jar=google-java-format-1.7-all-deps.jar
if [ ! -f $formatter_jar ]
then
    curl -LJO "https://github.com/google/google-java-format/releases/download/google-java-format-1.7/$formatter_jar"
    chmod 755 $formatter_jar
fi

cd ..
pwd

changed_java_files=$(git diff --cached --name-only --diff-filter=ACMR | grep ".*java$" )
echo "changed files:\n$changed_java_files"
java -jar .cache/$formatter_jar --replace $changed_java_files


for OUTPUT in $changed_java_files
do
	git add $OUTPUT
done