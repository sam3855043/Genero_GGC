# FOURJS_START_COPYRIGHT(P,2018)
# Property of Four Js*
# (c) Copyright Four Js 2018, 2024. All Rights Reserved.
# * Trademark of Four Js Development Tools Europe Ltd
#   in the United States and elsewhere
# FOURJS_END_COPYRIGHT

#+ Genero Ghost client - Quick start guide
#+
#+ This quick start shows the Genero Ghost client basics.
#+
#+ == 1. Build the sample application
#+
#+ Source the environment script (envcomp or envcomp.bat)
#+ Move to the quick-start directory and call the build script
#+
#+ @code
#+ cd ${GGCDIR}/src/quick-start
#+ bash build.sh
#+
#+ Windows users may have to copy the quick-start directory to a writable location:
#+
#+ @code
#+ xcopy /S "%GGCDIR%\src\quick-start" C:\tmp\quick-start
#+ cd C:\tmn\quick-start
#+ build.bat
#+
#+ The sample application is compiled and a Genero archive is produced.
#+
#+
#+ == 2. Record a GUI log with GDC in direct connection
#+
#+ Unix-like OS:
#+
#+ @code
#+ export FGLIMAGEPATH=${GGCDIR}/src/quick-start/img:${FGLDIR}/lib/image2font.txt
#+ fglrun --start-guilog=price_sample.guilog price
#+
#+ Windows:
#+
#+ @code
#+ set FGLIMAGEPATH=%GGCDIR%/src/quick-start/img;%FGLDIR%/lib/image2font.txt
#+ fglrun --start-guilog=price_sample.guilog price
#+
#+ Then after having executed some actions, leave the application.
#+
#+ The file price_sample.guilog should be created.
#+
#+
#+ == 3. Generate a scenario using the produced GUI log
#+
#+ The Genero Ghost client provide some tools located in ${GGCDIR}/bin.
#+
#+ The 'ggcgen bdl' tool transforms a DVM guilog or a GDC log into a BDL scenario.
#+
#+ @code
#+ ggcgen bdl price_sample.guilog
#+
#+ The file price_sample.4gl should have been created.
#+
#+
#+ == 4. Compile and execute the scenario
#+
#+ Unix-like OS:
#+
#+ @code
#+ fglcomp price_sample.4gl
#+ fglrun price_sample tcp --working-directory $(pwd) --command-line 'fglrun price'
#+
#+ Windows:
#+
#+ @code
#+ fglcomp price_sample.4gl
#+ fglrun price_sample tcp --working-directory %CD% --command-line "fglrun price"
#+
#+
#+ == 5. Deploy the sample application on a Genero Application server
#+
#+ Source the GAS environment and ensure httpdispatch is started.
#+
#+ @code
#+ gasadmin gar --deploy-archive ggc-quick-start.gar
#+ gasadmin gar --enable-archive ggc-quick-start.gar
#+
#+ or use the deployment portal at the following url:
#+   http://localhost:6394/ws/r/services/DeploymentService/html
#+
#+ Ensure the application works correctly:
#+   http://localhost:6394/ua/r/price
#+
#+ Execute the compiled scenario against the GAS:
#+
#+ @code
#+ fglrun price_sample.42m ua --url http://localhost:6394/ua/r/price
