# Azzi000_sample
Test T100 menu using gas mode
- Log Collect
    - a DVM guilog.
    - a GDC log
    - a GBC log
    ```
    http://localhost:6394/ua/r/price?recordGbcLog=1
    ```
    - a uaproxy log
    
- Record log, loging T100 menu and operating
- Please don't cloase T100 let will also close GDC
- End of operating click stop button to end record of GDC

# GGCGEN
COMMAND: 
 - . /u1/genero/ggc/envggc
 - ggcgen bdl gdc.log<br>
 - ggcgen --check-all

# RUN TEST SCENARIO
 - fglcomp gdc.4gl <br>
 - ggcadmin startbdlserver & <br>
 - export GUIMODE=GDC;fglrun price_sample tcp --command-line "fglrun /u1/topprd/azz/erp/azz/42r/azzi000.42r"
## fastcgidispatch testing
 - fglrun 189.42m ua --url http://10.40.41.189/wtopprd/ua/r/app/gwc_azzi000?Arg=99
## Detail please check the manual 
 - https://4js.com/online_documentation/fjs-ggc-manual-html/#ggc-topics/t_ggc_record_scenario_log_dvm.html
