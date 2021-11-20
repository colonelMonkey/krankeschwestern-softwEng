@Echo off

Echo.
Echo Alte Class-Dateien loeschen ...
Echo.

del klaufg03\rmiclient\*.class
del klaufg03\rmiserver\*.class

Echo.
Echo Compile ...
Echo.

javac -classpath .;de_eikelberg_iotools.jar klaufg03\rmiclient\*.java
javac -classpath . klaufg03\rmiserver\*.java


Echo.
pause

