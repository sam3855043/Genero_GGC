
# Test genero ghost with genero fglrun demo
 - cd $FGLDIR;
 - fglrun --start-guilog=demo_scenario.guilog demo
 - Copy log to your directory
 - [URL:https://4js.com/online_documentation/fjs-ggc-manual-html/#ggc-topics/t_ggc_run_bdl_test.html]
 # BUILD TEST SCENARIO WITH BDL
 ## command
 - ggcgen bdl demo_scenario.guilog  <br>
 - export FGLLICENSE=$FGLDIR/etc/fgllicense.dev <br>
 - fglcomp demo_scenario.4gl <br>
 - or using r.cs demo_scenario <br>
 - ggcadmin startbdlserver & <br>
 - ------
 - Genero DVM TCP TESTING <br>
 - TCP mode
 - mv demo_scenario.42m /u1/genero/fgl/demo <br>
 - cd $FGLDIR/demo <br>
 - fglrun demo_scenario.42m  tcp --command-line "fglrun demo"
 - ------
 - UA mode
 - fglrun demo_scenario ua --url http://10.40.41.189/wtoptst/ua/r/demo
------
 # BUILD TEST SCENARIO WITH JAVA
 ## command
 - java test <br>
 - genggc -java --package-name demo_tcp --check-form demo.guilog   
 - ggcadmin ua --url  http://10.40.41.189/wtoptst/ua/r/demo --scenario-provider demo_tcp.demo_provider.class ✅ 成功：Operation completed successfully!！ 

 - ggcadmin tcp -w /u1/usr/tiptop/sam/Genero_ggc/quick-start/ -c 'fglrun /u1/genero/fgl/demo/demo.42m' --scenario-provider demo_tcp.demo_provider.class ✅ 成功：Operation completed successfully!！ 
 
 - ### [GBC log recording ](https://4js.com/online_documentation/fjs-gbc-manual-html/index.html#gbc-topics/c_gbc_debug_record_log.html)




