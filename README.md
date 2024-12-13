# Genero_ggc
test gcc from Genero GHOST sample
- GHOST sample 
    - quick-start
      - img 
      - price.4gl
      - price.per 
      - prices.xcf
      - prices_sample.4gl [simulate behavior]
      - edit_price.per
      - price.xcf
    - my_sample
      - azzi085_test.4gl
      - aazi085_test.guilog
      - README.md
# GGCGEN
COMMAND: 
 - fglrun --start-guilog=price_sample.guilog ${GGCDIR}/src/quick-start/price 
 - ggcgen bdl price_sample.guilog<br>
 - ggcgen --check-all

# RUN TEST SCENARIO
 - fglcomp price_sample.4gl <br>
 - ggcadmin startbdlserver & <br>
 - fglrun price_sample tcp --command-line "fglrun price"

# RUN on GAS
 - gasadmin gar --deploy-archive ggc-quick-start.gar
 - gasadmin gar --enable-archive ggc-quick-start.gar
 - add price.xcf in as.xcf
 - please add the following xml to toptst.xcf, you can check toptst.xcf as sample
 - ```
    <GROUP Id="ggc"> '/u1/genero/ggc/src/quick-start</GROUP> 
## httpdispatch testing 
 - fglrun price_sample.42m ua --url http://{hostip}:{port}/ua/r/price
## fastcgidispatch testing
 - fglrun price_sample.42m ua --url http://{hostip}/ua/r/price
## Detail please check the manual 
 - https://4js.com/online_documentation/fjs-ggc-manual-html/#ggc-topics/t_ggc_quick_start_guide.html
