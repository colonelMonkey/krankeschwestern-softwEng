@Echo off

rem
rem ggf. belegte Systemvariablen löschen:
rem

set classpath=.
set sourcepath=.
set bootclasspath=.
set extdirds=.

Echo.
Echo Die RMI-Registrierung wird gestartet ...
Echo.
start "RMI Registrierung" rmiregistry -J-Djava.rmi.server.useCodebaseOnly=false 11099

Echo.
Echo Es wird 3 Sekunden gewartet (Intitalisierung der RMI-Registrierung) ...
Echo.

java klaufg03.timer.Timer 3

Echo.
Echo Der Server wird gestartet ...
Echo.

rem aktuellen Pfad ermitteln, anschließend \ durch / ersetzen
set pfad=%~d0%~p0
set pfad=%pfad:\=/%

java -cp .;de_eikelberg_iotools.jar -Djava.rmi.server.codebase=file:%pfad% -Djava.rmi.server.useCodebaseOnly=false klaufg03.rmiserver.Server

Echo.

pause
