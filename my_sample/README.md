# Genero_ggc my sample follow step by step 
ENVIROEMENT:
  . /u1/genero/ggc/envggc
# GGCGEN
COMMAND: 
 - fglrun --start-guilog=azzi085_test.guilog ${AZZ}/42r/azzi085.42r <br>
 - {AZZ} = /u1/topprd/erp/azz <br>
 - ggcgen bdl azzi085_test.guilog<br>
 - ggcgen --check-all

# RUN TEST SCENARIO
 - export FGLLICENSE=$FGLDIR/etc/fgllicense.dev <br>
 - fglcomp azzi085_test.4gl <br>
 - or using r.cs azzi085_test <br>
 - ggcadmin startbdlserver & <br>
 - fglrun azzi085_test tcp --command-line "fglrun ${AZZ}/42r/azzi085.42r"


https://4js.com/online_documentation/fjs-ggc-manual-html/#ggc-topics/t_ggc_quick_start_guide.html
https://4js.com/online_documentation/fjs-gas-manual-html/#gas-topics/t_gas_packaging_create_manifest_file.html
https://4js.com/online_documentation/fjs-gas-manual-html/#gas-topics/t_gas_garchive_deploy_with_gasadmin.html
