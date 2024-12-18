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

    # Start execution and exits when the scenario ends
    # Exit status is 1 in case of error, 0 on success.
    CALL ggc.play()
END MAIN

# Scenario azzi000_gdc id : 0
PRIVATE FUNCTION play_0()
# FRONT CALL
# FunctionCall 81 (isSystem = "0", returnCount = "0", paramCount = "1", moduleName = "standard", name = "setwebcomponentpath") {   FunctionCallParameter 80 (dataType = "STRING", isNull = "0", value = "http://10.40.41.189/topprd/components") { } } 
# FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "1") { } } 

    CALL ggc.wait(1039)
# FRONT CALL
# FunctionCall 587 (isSystem = "0", returnCount = "1", paramCount = "1", moduleName = "standard", name = "feInfo") {   FunctionCallParameter 588 (dataType = "STRING", isNull = "0", value = "userPreferredLang") { } } 
# FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "en_US") { } } 

    CALL ggc.wait(266)
# FRONT CALL
# FunctionCall 774 (isSystem = "0", returnCount = "1", paramCount = "1", moduleName = "standard", name = "feInfo") {   FunctionCallParameter 775 (dataType = "STRING", isNull = "0", value = "ostype") { } } 
# FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "WINDOWS") { } } 

    CALL ggc.wait(24)
# FRONT CALL
# FunctionCall 513 (isSystem = "0", returnCount = "1", paramCount = "1", moduleName = "standard", name = "feInfo") {   FunctionCallParameter 512 (dataType = "STRING", isNull = "0", value = "datadirectory") { } } 
# FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "C:/Users/dgw/AppData/Local/Four Js/Genero Desktop Client/cache/ftcache") { } } 

    CALL ggc.wait(96)
# FRONT CALL
# FunctionCall 775 (isSystem = "0", returnCount = "1", paramCount = "2", moduleName = "standard", name = "execute") {   FunctionCallParameter 774 (     dataType = "STRING"     isNull = "0"     value = "cmd /C copy "%UserProfile%\.000session" "C:\Users\dgw\AppData\Local\Four Js\Genero Desktop Client\cache\ftcache\.000session" /Y "   ) { }   FunctionCallParameter 511 (dataType = "INTEGER", isNull = "0", value = "1") { } } 
# FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "1") { } } 

    CALL ggc.wait(179)
    CALL ggc.setTableSize("w_azzi000:s_startmenu", 36)

    CALL ggc.mediaSize("large")

    CALL ggc.wait(4691)
    CALL ggc.setFocus("formonly.gzxd001")

    CALL ggc.wait(37)
    CALL ggc.key("tab")

    CALL ggc.wait(2555)
    CALL ggc.setFocus("formonly.gzxd002")

    CALL ggc.setValue("tiptop")

    CALL ggc.action("login") -- 登录

    CALL ggc.wait(33)
# FRONT CALL
# FunctionCall 852 (isSystem = "0", returnCount = "1", paramCount = "1", moduleName = "standard", name = "feInfo") {   FunctionCallParameter 77 (dataType = "STRING", isNull = "0", value = "ostype") { } } 
# FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "WINDOWS") { } } 

    CALL ggc.wait(53)
# FRONT CALL
# FunctionCall 855 (isSystem = "0", returnCount = "1", paramCount = "2", moduleName = "standard", name = "execute") {   FunctionCallParameter 856 (     dataType = "STRING"     isNull = "0"     value = "cmd /C echo {"r":"eyJhY2NvdW50IjoidGlwdG9wIiwibGFuZyI6InpoX1RXIiwibG9jYWwiOiJEU0NUQyIsInN0YXR1cyI6IlQifQ=="} > "%UserProfile%/.000session""   ) { }   FunctionCallParameter 857 (dataType = "INTEGER", isNull = "0", value = "1") { } } 
# FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "1") { } } 

    CALL ggc.end()
END FUNCTION

# Scenario azzi000_gdc id : 1
PRIVATE FUNCTION play_1()
# FRONT CALL
# FunctionCall 81 (isSystem = "0", returnCount = "0", paramCount = "1", moduleName = "standard", name = "setwebcomponentpath") {   FunctionCallParameter 80 (dataType = "STRING", isNull = "0", value = "http://10.40.41.189/topprd/components") { } } 
# FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "1") { } } 

    CALL ggc.wait(1536)
    CALL ggc.setTableSize("s_startmenu", 36)

    CALL ggc.wait(893)
    CALL ggc.action("wc_flow_init") -- wc_flow_init

    CALL ggc.wait(219)
    CALL ggc.setFocus("formonly.searchstr")

    CALL ggc.wait(144)
    CALL ggc.setFocus("formonly.wc")

    CALL ggc.wait(19)
    CALL ggc.setValue(" ")

    CALL ggc.action("wc_exec") -- wc_exec

    CALL ggc.wait(287)
    CALL ggc.setValue("{\"cmd\":\"handshake\"}")

    CALL ggc.action("wc_get_req") -- wc_get_req

    CALL ggc.wait(45)
    CALL ggc.setValue("{\"cmd\":\"chk_internal_ip\",\"hostname\":\"\"}")

    CALL ggc.action("wc_get_req") -- wc_get_req

    CALL ggc.wait(1019)
    CALL ggc.setFocus("formonly.searchstr")

    CALL ggc.wait(1546)
    CALL ggc.setFocus("formonly.searchstr")

    CALL ggc.setValue("azzi800")

    CALL ggc.action("execute") -- execute

    CALL ggc.wait(33306)
    CALL ggc.action("close") -- close

    CALL ggc.wait(42)
# FRONT CALL
# FunctionCall 78 (isSystem = "0", returnCount = "1", paramCount = "2", moduleName = "standard", name = "execute") {   FunctionCallParameter 861 (dataType = "STRING", isNull = "0", value = "taskkill /f /im gdc.exe") { }   FunctionCallParameter 863 (dataType = "INTEGER", isNull = "0", value = "0") { } } 
# FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "1") { } } 

    CALL ggc.end()
END FUNCTION

