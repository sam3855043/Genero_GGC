- fglrun --start-guilog=azzi000.guilog $AZZ/42r/azzp000.42r azzi000
- ggcgen bdl azzi000
- fglrun azzi000.42m tcp --command "fglrun /u1/topprd/erp/azz/42r/azzp000.42r azzi000" 
- fglrun


## fastcgidispatch testing
 - fglrun azzi00_gdc.42m ua --url http://10.40.41.189/wtopprd/ua/r/app/gwc_azzi000?Arg=99 
 - fglrun test.42m ua --url http://10.40.40.207/wtopprd/da/r/app/gwc_azzi000?Arg=99  -f $FGLSERVER:0
 - fglrun test.42m tcp --command "fglrun /u1/topprd/erp/azz/42r/azzp000.42r azzi000"
 - ggcgen bdl 

 - fglrun gwc_demo.42m ua --url http://10.40.41.147/wtopprd/ua/r/gwc-demo  -f $FGLSERVER:0
 - fglrun login.42m ua --url http://10.40.41.147/wtopprd/ua/r/app/gwc_azzi000?Arg=99  -f $FGLSERVER:0


 - ggcgen 2.0 無法測試 T100 login 的功能
 - login azzi000_login 失敗
 - gwc_demo 成功

 - azzi085 失敗
 - fglrun azzi085.42m tcp --command "fglrun /u1/topprd/erp/azz/42r/azzp000.42r azzi085"
 - fglrun azzi085.42m tcp --command "fglrun /u1/topprd/erp/azz/42r/azzi085.42r"
 - fglrun azzi085.42m tcp --command "fglrun /u1/topprd/erp/azz/42r/azzp000.42r azzi085" -f $FGLSERVER:0