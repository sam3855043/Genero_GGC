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



# GGC JAVA testing just for tcp tesing
  - java testing produce package name azzi800
 
 ```
  ggcgen java --package-name azzi800 --check-form azzi800_test.guilog
  
```
- using ggcadmin tcp test java scenario and stress testing
```
ggcadmin tcp -w /u1/usr/tiptop/sam/Genero_ggc/my_sample/ -c 'fglrun /u1/topprd/erp/azz/42r/azzi800.42r' --scenario-provider azzi800.azzi800_test_provider
```
 - instacne-count 3
```
ggcadmin tcp -w /u1/usr/tiptop/sam/Genero_ggc/my_sample/ -c 'fglrun /u1/topprd/erp/azz/42r/azzi800.42r' --scenario-provider azzi800.azzi800_test_provider_1$scenario_0.class --instance-count 3
```
 - Using GDC Log for azzi085
```
ggcgen java --package-name gdc --check-form gdc.log
```
```
ggcgen java --package-name azzi085 --check-form azzi085_test.guilog
```

```
ggcadmin tcp -w /u1/usr/tiptop/sam/Genero_ggc/my_sample/ -c 'fglrun /u1/topprd/erp/azz/42r/azzi085.42r' --scenario-provider azzi085.azzi085_test_provider --instance-count 2
```

  - ### [GGC quick-start-guide](https://4js.com/online_documentation/fjs-ggc-manual-html/#ggc-topics/t_ggc_quick_start_guide.html)
 
  - ### [GAS admin tool manifest](https://4js.com/online_documentation/fjs-gas-manual-html/#gas-topics/t_gas_packaging_create_manifest_file.html)

 - ### [GAS admin deploy](https://4js.com/online_documentation/fjs-gas-manual-html/#gas-topics/t_gas_garchive_deploy_with_gasadmin.html)

