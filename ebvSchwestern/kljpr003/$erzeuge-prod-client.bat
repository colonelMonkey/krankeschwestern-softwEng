@echo off
copy .\$start-client.bat                             ..\jpra0258ProdClient\*.bat /Y
copy .\aufg0258\rmiclient\rmipolicy_client.txt       ..\jpra0258ProdClient\aufg0258\rmiclient\*.txt /Y
copy .\aufg0258\rmiclient\Client.class               ..\jpra0258ProdClient\aufg0258\rmiclient\*.class /Y
copy .\aufg0258\rmiserver\RmiMethodenInterface.class  ..\jpra0258ProdClient\aufg0258\rmiserver\*.class /Y
copy .\de_eikelberg_iotools.jar ..\jpra0258ProdClient\*.jar /Y
pause