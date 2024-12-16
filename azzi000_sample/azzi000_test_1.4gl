# =============================================================================
# Generated using Genero Ghost Client 5.00.02-202405230916
# =============================================================================
IMPORT FGL ggc

MAIN
    CALL ggc.setApplicationName("azzi800")
    CALL ggc.parseOptions()

    # Register scenario functions
    CALL ggc.registerScenario(FUNCTION play_0)
    CALL ggc.registerScenario(FUNCTION play_1)
    CALL ggc.registerScenario(FUNCTION play_2)

    # Start execution and exits when the scenario ends
    # Exit status is 1 in case of error, 0 on success.
    CALL ggc.play()
END MAIN

# Scenario azzi000_test_1 id : 0
PRIVATE FUNCTION play_0()
# FRONT CALL
# FunctionCall 85 (isSystem = "0", returnCount = "1", paramCount = "1", moduleName = "standard", name = "feinfo") {   FunctionCallParameter 86 (dataType = "STRING", isNull = "0", value = "ostype") { } } 
# FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "WINDOWS") { } } 

    CALL ggc.wait(86)
# FRONT CALL
# FunctionCall 90 (isSystem = "0", returnCount = "1", paramCount = "1", moduleName = "standard", name = "feinfo") {   FunctionCallParameter 91 (dataType = "STRING", isNull = "0", value = "target") { } } 
# FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "w64v142") { } } 

    CALL ggc.wait(41)
# FRONT CALL
# FunctionCall 93 (isSystem = "0", returnCount = "0", paramCount = "1", moduleName = "standard", name = "setwebcomponentpath") {   FunctionCallParameter 94 (dataType = "STRING", isNull = "0", value = "http://10.40.41.189/topprd/components") { } } 
# FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "1") { } } 

    CALL ggc.wait(769)
# FRONT CALL
# FunctionCall 587 (isSystem = "0", returnCount = "1", paramCount = "1", moduleName = "standard", name = "feInfo") {   FunctionCallParameter 588 (dataType = "STRING", isNull = "0", value = "userPreferredLang") { } } 
# FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "en_US") { } } 

    CALL ggc.wait(149)
# FRONT CALL
# FunctionCall 774 (isSystem = "0", returnCount = "1", paramCount = "1", moduleName = "standard", name = "feInfo") {   FunctionCallParameter 775 (dataType = "STRING", isNull = "0", value = "ostype") { } } 
# FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "WINDOWS") { } } 

    CALL ggc.wait(50)
# FRONT CALL
# FunctionCall 513 (isSystem = "0", returnCount = "1", paramCount = "1", moduleName = "standard", name = "feInfo") {   FunctionCallParameter 512 (dataType = "STRING", isNull = "0", value = "datadirectory") { } } 
# FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "C:/Users/dgw/AppData/Local/Four Js/Genero Desktop Client/cache/ftcache") { } } 

    CALL ggc.wait(230)
# FRONT CALL
# FunctionCall 775 (isSystem = "0", returnCount = "1", paramCount = "2", moduleName = "standard", name = "execute") {   FunctionCallParameter 774 (     dataType = "STRING"     isNull = "0"     value = "cmd /C copy "%UserProfile%\.000session" "C:\Users\dgw\AppData\Local\Four Js\Genero Desktop Client\cache\ftcache\.000session" /Y "   ) { }   FunctionCallParameter 511 (dataType = "INTEGER", isNull = "0", value = "1") { } } 
# FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "1") { } } 

    CALL ggc.wait(198)
    CALL ggc.mediaSize("large")

    CALL ggc.wait(241)
    CALL ggc.setTableSize("w_azzi000:s_startmenu", 35)

    CALL ggc.wait(1601)
    CALL ggc.setFocus("formonly.gzxd002")

    CALL ggc.wait(4250)
    CALL ggc.setFocus("formonly.gzxd002")

    CALL ggc.setValue("tiptop")

    CALL ggc.action("login") -- 登录

    CALL ggc.wait(31)
# FRONT CALL
# FunctionCall 842 (isSystem = "0", returnCount = "1", paramCount = "1", moduleName = "standard", name = "feInfo") {   FunctionCallParameter 89 (dataType = "STRING", isNull = "0", value = "ostype") { } } 
# FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "WINDOWS") { } } 

    CALL ggc.wait(94)
# FRONT CALL
# FunctionCall 845 (isSystem = "0", returnCount = "1", paramCount = "2", moduleName = "standard", name = "execute") {   FunctionCallParameter 846 (     dataType = "STRING"     isNull = "0"     value = "cmd /C echo {"r":"eyJhY2NvdW50IjoidGlwdG9wIiwibGFuZyI6InpoX1RXIiwibG9jYWwiOiJEU0NUQyIsInN0YXR1cyI6IlQifQ=="} > "%UserProfile%/.000session""   ) { }   FunctionCallParameter 847 (dataType = "INTEGER", isNull = "0", value = "1") { } } 
# FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "1") { } } 

    CALL ggc.end()
END FUNCTION

# Scenario azzi000_test_1 id : 1
PRIVATE FUNCTION play_1()
# FRONT CALL
# FunctionCall 85 (isSystem = "0", returnCount = "1", paramCount = "1", moduleName = "standard", name = "feinfo") {   FunctionCallParameter 86 (dataType = "STRING", isNull = "0", value = "ostype") { } } 
# FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "WINDOWS") { } } 

    CALL ggc.wait(19)
# FRONT CALL
# FunctionCall 90 (isSystem = "0", returnCount = "1", paramCount = "1", moduleName = "standard", name = "feinfo") {   FunctionCallParameter 91 (dataType = "STRING", isNull = "0", value = "target") { } } 
# FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "w64v142") { } } 

    CALL ggc.wait(27)
# FRONT CALL
# FunctionCall 93 (isSystem = "0", returnCount = "0", paramCount = "1", moduleName = "standard", name = "setwebcomponentpath") {   FunctionCallParameter 94 (dataType = "STRING", isNull = "0", value = "http://10.40.41.189/topprd/components") { } } 
# FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "1") { } } 

    CALL ggc.wait(1322)
    CALL ggc.setTableSize("s_startmenu", 34)

    CALL ggc.wait(734)
    CALL ggc.setTableSize("s_startmenu", 35)

    CALL ggc.wait(422)
    CALL ggc.setFocus("formonly.searchstr")

    CALL ggc.wait(120)
    CALL ggc.action("wc_flow_init") -- wc_flow_init

    CALL ggc.wait(301)
    CALL ggc.setFocus("formonly.searchstr")

    CALL ggc.setValue("ㄇ")

    CALL ggc.wait(15)
    CALL ggc.setFocus("formonly.wc")

    CALL ggc.wait(16)
    CALL ggc.setValue(" ")

    CALL ggc.action("wc_exec") -- wc_exec

    CALL ggc.wait(270)
    CALL ggc.setValue("{\"cmd\":\"handshake\"}")

    CALL ggc.action("wc_get_req") -- wc_get_req

    CALL ggc.wait(15)
    CALL ggc.setValue("{\"cmd\":\"chk_internal_ip\",\"hostname\":\"\"}")

    CALL ggc.action("wc_get_req") -- wc_get_req

    CALL ggc.wait(2631)
    CALL ggc.setFocus("formonly.searchstr")

    CALL ggc.wait(2335)
    CALL ggc.setFocus("formonly.searchstr")

    CALL ggc.setValue("azzi800")

    CALL ggc.action("execute") -- execute

    CALL ggc.wait(37023)
    CALL ggc.action("close") -- close

    CALL ggc.wait(39)
# FRONT CALL
# FunctionCall 841 (isSystem = "0", returnCount = "1", paramCount = "2", moduleName = "standard", name = "execute") {   FunctionCallParameter 88 (dataType = "STRING", isNull = "0", value = "taskkill /f /im gdc.exe") { }   FunctionCallParameter 853 (dataType = "INTEGER", isNull = "0", value = "0") { } } 
# FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "1") { } } 

    CALL ggc.end()
END FUNCTION

# Scenario azzi000_test_1 id : 2
PRIVATE FUNCTION play_2()
    CALL ggc.setTableSize("s_queryplan", 17)

    CALL ggc.setTableSize("s_relateapps", 12)

    CALL ggc.setTableSize("s_browse", 33)

    CALL ggc.wait(1710)
    CALL ggc.action("query") -- 查詢 query

    CALL ggc.wait(1255)
    CALL ggc.setTableSize("s_detail1_01", 8)

    CALL ggc.setTableSize("s_detail1_03", 9)

    CALL ggc.wait(2402)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("gez")

    CALL ggc.wait(463)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("geza")

    CALL ggc.wait(685)
    CALL ggc.action("accept") -- 確定 accept

    CALL ggc.wait(2880)
    CALL ggc.action("reproduce") -- 複製 reproduce

    CALL ggc.wait(2061)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("ge")

    CALL ggc.wait(608)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("gezz")

    CALL ggc.wait(486)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("gezza")

    CALL ggc.wait(1908)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("geza")

    CALL ggc.wait(793)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("gezaaa")

    CALL ggc.wait(5444)
    CALL ggc.setFocus("gzxa_t.gzxa003")

    CALL ggc.wait(510)
    CALL ggc.setFocus("gzxa_t.gzxa003")

    CALL ggc.setValue("000000")

    CALL ggc.wait(749)
    CALL ggc.action("accept") -- 確定 accept

    CALL ggc.wait(1888)
    CALL ggc.action("no") -- 否

    CALL ggc.wait(4122)
    CALL ggc.action("delete") -- 刪除 delete

    CALL ggc.wait(1837)
    CALL ggc.action("yes") -- 是

    CALL ggc.wait(2143)
    CALL ggc.action("close") -- close

    CALL ggc.end()
END FUNCTION

