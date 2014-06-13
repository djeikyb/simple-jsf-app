# To use:

1. Copy the project
2. Delete the git folder and reinit
3. Find and replace all instances of "com.example"
4. Edit `build.properties` if you need to (eg, `deploy.dir`)
5. Run `ant resolve`
6. Run `ant war`

The compile target doesn't resolve.
Be sure to resolve after you edit ivy.xml or after you clean.


# Prereqs

1. You need:
 - java 8
 - ant 1.9+
 - ivy 2.3+
 - tomcat 7+

2. Java and ant must be in your `$PATH`
3. The ivy jars must be in ant's classpath (ie, in one of ant's lib folders, `$HOME/.ant/lib` is a good choice)


# Servlet containers

If you have `$CATALINA_HOME` set to your tomcat directory, you're all set.
Start tomcat and run `ant deploy`.
To deploy somewhere else (eg, glassfish), set the `deploy.dir` property.
