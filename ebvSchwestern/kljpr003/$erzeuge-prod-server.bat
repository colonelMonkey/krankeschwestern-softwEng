@echo off
copy $start-server.bat                                   ..\jpra0258ProdServer\*.bat /Y
copy aufg0258\rmiserver\rmipolicy_server.txt             ..\jpra0258ProdServer\aufg0258\rmiserver\*.txt /Y
copy aufg0258\rmiserver\RmiMethodenImplementierung.class ..\jpra0258ProdServer\aufg0258\rmiserver\*.class /Y
copy aufg0258\rmiserver\RmiMethodenInterface.class       ..\jpra0258ProdServer\aufg0258\rmiserver\*.class /Y
copy aufg0258\rmiserver\Server.class                     ..\jpra0258ProdServer\aufg0258\rmiserver\*.class /Y
copy aufg0258\timer\Timer.class                          ..\jpra0258ProdServer\aufg0258\timer\*.class /Y
pause
