# Azzi000_sample
Test T100 menu using gas mode
- Log Collect
    - a DVM guilog.
    - a GDC log
    - a GBC log
    ```
    http://10.40.41.189/wtopprd/ua/r/app/gwc_azzi000?Arg=99&recordGbcLog=1
    ```
   - close menu and it will appeal url link please click and download gbc.log
- a uaproxy log
 
- Record log, loging T100 menu and operating
- Please don't close T100 menu it will also close GDC
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
 - fglrun azzi00_gdc.42m ua --url http://10.40.41.189/wtopprd/ua/r/app/gwc_azzi000?Arg=99 
## Detail please check the manual 
 - https://4js.com/online_documentation/fjs-ggc-manual-html/#ggc-topics/t_ggc_record_scenario_log_dvm.html

# JAVA scenario
## ggcgen for java
 - ggcgen java --package-name azzi000 --check-form gbc.log

 - ggcadmin ua --url http://10.40.41.189/wtoptst/ua/r/app/gwc_azzi000?Arg=99 --scenario-provider azzi000.azzi000_gbc_1_provider --instance-count 2 --instance-delay 500
 - ggcadmin ua --url http://10.40.40.207/wtoptst/ua/r/app/gwc_azzi000?Arg=99 --scenario-provider azzi000.azzi000_gbc_1_provider --instance-count 1
 --scenario-provider azzi000.azzi000_gbc_1_provider --instance-count 2 --instance-delay 500
 
 # GUIGRAPH execute
 - fglrun azzi000_gdc.42m ua --url http://10.40.41.147/wtopprd/ua/r/app/gwc_azzi000?Arg=99 -f 10.40.241.163:0
 - ggcadmin ua --url http://10.40.41.189/wtoptst/ua/r/app/gwc_azzi000?Arg=99  --scenario-provider azzi000.azzi000_gbc_1_provider -f 10.40.241.163:0 🚨 錯誤：Something went wrong!
 # TCP mode
 - export GUIMODE=GDC
 - ggcadmin tcp -w /u1/usr/tiptop/sam/Genero_ggc/azzi000_gbc/ -c 'fglrun /u1/topprd/erp/azz/42r/azzi000.42r' --scenario-provider azzi000.azzi000_gbc_1_provider --instance-count 2 ✅ **成功**：操作已順利完成！

# UA mode
## azzi085_open 
 - ggcgen java --package-name gbc_azzi800 --check-form app_gwc_azzi800_open.gbclog   
 - ggcadmin ua --url http://10.40.41.189/wtoptst/ua/r/app/gwc_azzi000?Arg=99 --scenario-provider gbc_azzi800.app_gwc_azzi800_open_1_provider --instance-count 2 --instance-delay 5000 --speed-ratio 0.4
## azzi085_open search copy and delete
 - ggcgen java --package-name gbc_azzi800_search_delete --check-form app_gwc_azzi800_add_delete.gbclog
 - ggcadmin ua --url http://10.40.41.189/wtopprd/ua/r/app/gwc_azzi000?Arg=99 --scenario-provider gbc_azzi800_search_delete.app_gwc_azzi800_add_delete_1_provider ✅ **成功**：操作已順利完成！

## sucessful copy with variable
 - ggcadmin ua --url http://10.40.41.189/wtoptst/ua/r/app/gwc_azzi000?Arg=99 --scenario-provider azzi000.azzi000_gbc_1_provider --instance-count 2  --instance-delay 3000 --speed-ratio 0.5 ✅ **成功**：操作已順利完成！
 - ggcadmin ua --url http://10.40.41.189/wtoptst/ua/r/app/gwc_azzi000?Arg=99 --scenario-provider azzi000.azzi000_gbc_1_provider --instance-count 3  --instance-delay 3000 --speed-ratio 0.5 ✅ **成功**：操作已順利完成！
 - ggcadmin ua --url http://10.40.41.189/wtoptst/ua/r/app/gwc_azzi000?Arg=99 --scenario-provider azzi000.azzi000_gbc_1_provider --instance-count 4  --instance-delay 3000 --speed-ratio 0.5 ✅ **成功**：操作已順利完成！
 - ggcadmin ua --url http://10.40.41.189/wtoptst/ua/r/app/gwc_azzi000?Arg=99 --scenario-provider azzi000.azzi000_gbc_1_provider --instance-count 5  --instance-delay 3000 --speed-ratio 0.5 ✅ **成功**：操作已順利完成！
 - ggcadmin ua --url http://10.40.41.189/wtoptst/ua/r/app/gwc_azzi000?Arg=99 --scenario-provider azzi000.azzi000_gbc_1_provider --instance-count 6  --instance-delay 3000 --speed-ratio 0.5 🚨 錯誤：Something went wrong!
 - ggcadmin ua --url http://10.40.41.189/wtoptst/ua/r/app/gwc_azzi000?Arg=99 --scenario-provider azzi000.azzi000_gbc_1_provider --instance-count 10  --instance-delay 3000 --speed-ratio 0.5🚨 錯誤：Something went wrong!
<<<<<<< HEAD
 - ggcadmin ua --url http://10.40.41.189/wtoptst/ua/r/app/gwc_azzi000?Arg=99 --scenario-provider azzi000.azzi000_gbc_1_provider --instance-count 100  --instance-delay 300 --speed-ratio 0 🚨 錯誤：Something went wrong!
=======
 - ggcadmin ua --url http://10.40.41.189/wtoptst/ua/r/app/gwc_azzi000?Arg=99 --scenario-provider azzi000.azzi000_gbc_1_provider --instance-count 50  --instance-delay 500 --speed-ratio 0🚨 錯誤：Something went wrong!
>>>>>>> origin/HEAD
