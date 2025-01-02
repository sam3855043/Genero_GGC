# Genero_GGC5
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
# GGCGEN
COMMAND: 
 - ggcgen bdl price_sample.guilog<br>
 - ggcgen --check-all

# RUN TEST SCENARIO
 - fglcomp price_sample.4gl <br>
 - ggcadmin startbdlserver & <br>
 - fglrun price_sample tcp --command-line "fglrun price"
