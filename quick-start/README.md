
# java scenario 
- ua <br>
```
ggcadmin ua --url  http://10.40.41.189/wtoptst/ua/r/price --scenario-provider test2scenario.price_sample_provider.class
```
- tcp <br>
```
ggcadmin tcp -w /u1/usr/tiptop/sam/Genero_ggc/quick-start -c 'fglrun price' --scenario-provider test2scenario.price_sample_provider$1.class
```
 - bdl test
```
ggcadmin ua --url --scenario-provider test2scenario.price_sample_provider$1.class
```