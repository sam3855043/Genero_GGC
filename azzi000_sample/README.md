ggcgen java --package-name gdc --check-form azzi000_gdc.log
ggcgen bdl
ggcadmin startbdlserver &
fglrun azzi000_gdc_1 ua --url http://10.40.41.189/wtoptst/ua/r/app/gwc_azzi000?Arg=99 

ggcadmin ua --url http://10.40.41.189/wtoptst/ua/r/app/gwc_azzi000?Arg=99 --scenario-provider gdc.azzi000_gdc_1_provider --instance-count 1 

ggcadmin ua --url http://10.40.41.189/wtoptst/ua/r/app/gwc_azzi000?Arg=99 --scenario-provider gdc.azzi000_gdc_1_provider --instance-count 10 --instance-delay 10000 --speed-ratio 0.1