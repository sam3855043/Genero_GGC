# =============================================================================
# Generated using Genero Ghost Client 5.00.02-202405230916
# =============================================================================
IMPORT FGL ggc

MAIN
    CALL ggc.setApplicationName("azzi000")
    CALL ggc.parseOptions()

    # Register scenario functions
    CALL ggc.registerScenario(FUNCTION play_0)
    CALL ggc.registerScenario(FUNCTION play_1)
    CALL ggc.registerScenario(FUNCTION play_2)

    # Start execution and exits when the scenario ends
    # Exit status is 1 in case of error, 0 on success.
    CALL ggc.play()
END MAIN

# Scenario gdc_1 id : 0
PRIVATE FUNCTION play_0()
# FRONT CALL
# FunctionCall 533 (isSystem = "0", returnCount = "1", paramCount = "1", moduleName = "standard", name = "feInfo") {   FunctionCallParameter 534 (dataType = "STRING", isNull = "0", value = "userPreferredLang") { } } 
# FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "en_US") { } } 

    CALL ggc.wait(130)
# FRONT CALL
# FunctionCall 774 (isSystem = "0", returnCount = "1", paramCount = "1", moduleName = "standard", name = "feInfo") {   FunctionCallParameter 775 (dataType = "STRING", isNull = "0", value = "ostype") { } } 
# FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "WINDOWS") { } } 

    CALL ggc.wait(65)
# FRONT CALL
# FunctionCall 459 (isSystem = "0", returnCount = "1", paramCount = "1", moduleName = "standard", name = "feInfo") {   FunctionCallParameter 458 (dataType = "STRING", isNull = "0", value = "datadirectory") { } } 
# FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "C:/Users/dgw/AppData/Local/Four Js/Genero Desktop Client/cache/ftcache") { } } 

    CALL ggc.wait(96)
# FRONT CALL
# FunctionCall 775 (isSystem = "0", returnCount = "1", paramCount = "2", moduleName = "standard", name = "execute") {   FunctionCallParameter 774 (     dataType = "STRING"     isNull = "0"     value = "cmd /C copy "%UserProfile%\.000session" "C:\Users\dgw\AppData\Local\Four Js\Genero Desktop Client\cache\ftcache\.000session" /Y "   ) { }   FunctionCallParameter 457 (dataType = "INTEGER", isNull = "0", value = "1") { } } 
# FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "1") { } } 

    CALL ggc.wait(76)
# FRONT CALL
# FunctionCall 458 (isSystem = "0", returnCount = "0", paramCount = "2", moduleName = "standard", name = "fgl_getfile") {   FunctionCallParameter 459 (dataType = "STRING", isNull = "0", value = "C:/Users/dgw/AppData/Local/Four Js/Genero Desktop Client/cache/ftcache/.000session") { }   FunctionCallParameter 456 (dataType = "STRING", isNull = "0", value = "http://10.40.41.189:80/wtopprd/ua/ft/a959b2551c6713708dcb26968133f140/fgl-files/901876/tmp_getfile.upload") { } } 
# FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "1") { } } 

    CALL ggc.wait(144)
    CALL ggc.mediaSize("large")

    CALL ggc.wait(2282)
    CALL ggc.setFocus("formonly.gzxd001")
    CALL ggc.setValue("tiptop")
    CALL ggc.wait(93)

    CALL ggc.key("tab")

    CALL ggc.wait(2957)
    CALL ggc.setFocus("formonly.gzxd002")

    CALL ggc.setValue("tiptop")

    CALL ggc.wait(56)
    CALL ggc.key("tab")

    CALL ggc.wait(119)
    CALL ggc.setFocus("formonly.gzzy001")

    CALL ggc.wait(55)
    CALL ggc.key("tab")

    CALL ggc.wait(115)
    CALL ggc.setFocus("formonly.gzxa007")

    CALL ggc.wait(44)
    CALL ggc.key("tab")

    #CALL ggc.wait(67)
# FRONT CALL
# FunctionCall 537 (isSystem = "0", returnCount = "1", paramCount = "1", moduleName = "standard", name = "feInfo") {   FunctionCallParameter 446 (dataType = "STRING", isNull = "0", value = "ostype") { } } 
# FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "WINDOWS") { } } 

    #CALL ggc.wait(155)
# FRONT CALL
# FunctionCall 444 (isSystem = "0", returnCount = "1", paramCount = "2", moduleName = "standard", name = "execute") {   FunctionCallParameter 443 (     dataType = "STRING"     isNull = "0"     value = "cmd /C echo {"r":"eyJhY2NvdW50IjoidGlwdG9wIiwibGFuZyI6InpoX1RXIiwibG9jYWwiOiJEU0NUQyIsInN0YXR1cyI6IlQifQ=="} > "%UserProfile%/.000session""   ) { }   FunctionCallParameter 442 (dataType = "INTEGER", isNull = "0", value = "1") { } } 
# FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "1") { } } 

    CALL ggc.end()
END FUNCTION

# Scenario gdc_1 id : 1
PRIVATE FUNCTION play_1()
    CALL ggc.setTableSize("s_startmenu", 36)

    CALL ggc.wait(391)
    CALL ggc.action("wc_flow_init") -- wc_flow_init

    CALL ggc.wait(334)
    CALL ggc.setFocus("formonly.wc")

    CALL ggc.wait(32)
    CALL ggc.setValue(" ")

    CALL ggc.action("wc_exec") -- wc_exec

    CALL ggc.wait(203)
    CALL ggc.setFocus("formonly.searchstr")

    CALL ggc.wait(65)
    CALL ggc.setFocus("formonly.wc")

    CALL ggc.wait(27)
    CALL ggc.setValue("{\"cmd\":\"handshake\"}")

    CALL ggc.action("wc_get_req") -- wc_get_req

    CALL ggc.wait(39)
    CALL ggc.setValue("{\"cmd\":\"chk_internal_ip\",\"hostname\":\"10.40.41.189\"}")

    CALL ggc.action("wc_get_req") -- wc_get_req

    CALL ggc.wait(1882)
    CALL ggc.setFocus("formonly.searchstr")

    CALL ggc.wait(2654)
    CALL ggc.setFocus("formonly.searchstr")

    CALL ggc.setValue("azzi800")

    CALL ggc.action("execute") -- execute

    CALL ggc.end()
END FUNCTION

# Scenario gdc_1 id : 2
PRIVATE FUNCTION play_2()
    CALL ggc.setTableSize("s_queryplan", 17)

    CALL ggc.setTableSize("s_relateapps", 12)

    CALL ggc.setTableSize("s_browse", 34)

    CALL ggc.wait(2027)
    CALL ggc.action("query") -- 查詢 query

    CALL ggc.wait(1374)
    CALL ggc.setTableSize("s_detail1_01", 9)

    CALL ggc.setTableSize("s_detail1_03", 10)

    CALL ggc.wait(2164)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("g")

    CALL ggc.wait(571)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("ge")

    CALL ggc.wait(459)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("gez")

    CALL ggc.wait(476)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("geza")

    CALL ggc.wait(1189)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("gezaa")

    CALL ggc.wait(426)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("gezaaa")

    CALL ggc.wait(7393)
    CALL ggc.setFocus("gzxa_t.gzxa003")

    CALL ggc.wait(490)
    CALL ggc.setFocus("gzxa_t.gzxa003")

    CALL ggc.setValue("000000")

    CALL ggc.wait(429)
    CALL ggc.action("accept") -- 確定 accept

    CALL ggc.wait(2169)
    CALL ggc.action("ok") -- 確定

    CALL ggc.wait(2342)
    CALL ggc.action("query") -- 查詢 query

    CALL ggc.wait(2016)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("g")

    CALL ggc.wait(608)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("gez")

    CALL ggc.wait(433)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("geza")

    CALL ggc.wait(303)
    CALL ggc.action("accept") -- 確定 accept

    CALL ggc.wait(1932)
    CALL ggc.action("reproduce") -- 複製 reproduce

    CALL ggc.wait(2569)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("g")

    CALL ggc.wait(440)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("ge")

    CALL ggc.wait(402)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("gez")

    CALL ggc.wait(567)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("geza")

    CALL ggc.wait(311)
    CALL ggc.action("accept") -- 確定 accept

    CALL ggc.wait(4328)
    CALL ggc.setFocus("gzxa_t.gzxa003")

    CALL ggc.setValue("000000")

    CALL ggc.wait(470)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.wait(802)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("geza1")

    CALL ggc.wait(720)
    CALL ggc.action("accept") -- 確定 accept

    CALL ggc.wait(1999)
    CALL ggc.action("no") -- 否

    CALL ggc.wait(1320)
    CALL ggc.action("delete") -- 刪除 delete

    CALL ggc.wait(1606)
    CALL ggc.action("yes") -- 是

    CALL ggc.wait(3131)
    CALL ggc.action("close") -- close

    CALL ggc.end()
END FUNCTION

