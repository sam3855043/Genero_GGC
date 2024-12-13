#batch run price_sample
fglrun price_sample.42m ua --url http://10.40.41.189:6396/ua/r/price >1.log & #1
fglrun price_sample.42m ua --url http://10.40.41.189:6396/ua/r/price >2.log & #2
fglrun price_sample.42m ua --url http://10.40.41.189:6396/ua/r/price >3.log & #3
fglrun price_sample.42m ua --url http://10.40.41.189:6396/ua/r/price >4.log & #4
