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
    CALL ggc.registerScenario(FUNCTION play_3)
    CALL ggc.registerScenario(FUNCTION play_4)
    CALL ggc.registerScenario(FUNCTION play_5)
    CALL ggc.registerScenario(FUNCTION play_6)
    CALL ggc.registerScenario(FUNCTION play_7)
    CALL ggc.registerScenario(FUNCTION play_8)
    CALL ggc.registerScenario(FUNCTION play_9)
    CALL ggc.registerScenario(FUNCTION play_10)
    

    # Start execution and exits when the scenario ends
    # Exit status is 1 in case of error, 0 on success.
    CALL ggc.play()
END MAIN

# Scenario azzi800_test id : 0
PRIVATE FUNCTION play_0()
    CALL ggc.setTableSize("s_queryplan", 10)

    CALL ggc.setTableSize("s_relateapps", 7)

    CALL ggc.setTableSize("s_browse", 20)

    CALL ggc.wait(527)
    CALL ggc.setTableSize("s_queryplan", 16)

    CALL ggc.setTableSize("s_relateapps", 12)

    CALL ggc.setTableSize("s_browse", 32)

    CALL ggc.wait(222)
    CALL ggc.mediaSize("large")

    CALL ggc.wait(2439)
    CALL ggc.action("query") -- 查詢 query

    CALL ggc.wait(971)
    CALL ggc.setTableSize("s_detail1_01", 9)

    CALL ggc.setTableSize("s_detail1_03", 10)

    CALL ggc.wait(1008)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("geza")

    CALL ggc.wait(341)
    CALL ggc.action("accept") -- 確定 accept

    CALL ggc.wait(845)
    CALL ggc.action("reproduce") -- 複製 reproduce

    CALL ggc.wait(1184)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("gezaaa")

    CALL ggc.wait(1286)
    CALL ggc.setFocus("gzxa_t.gzxa003")

    CALL ggc.wait(623)
    CALL ggc.setFocus("gzxa_t.gzxa003")

    CALL ggc.setValue("000000")

    CALL ggc.wait(1050)
    CALL ggc.action("accept") -- 確定 accept

    CALL ggc.wait(2060)
    CALL ggc.action("no") -- 否

    CALL ggc.wait(2205)
    CALL ggc.action("delete") -- 刪除 delete

    CALL ggc.wait(1830)
    CALL ggc.action("yes") -- 是

    CALL ggc.wait(2092)
    CALL ggc.action("close") -- close

    CALL ggc.end()
END FUNCTION

# Scenario azzi800_test id : 1
PRIVATE FUNCTION play_1()
    CALL ggc.setTableSize("s_queryplan", 10)

    CALL ggc.setTableSize("s_relateapps", 7)

    CALL ggc.setTableSize("s_browse", 20)

    CALL ggc.wait(527)
    CALL ggc.setTableSize("s_queryplan", 16)

    CALL ggc.setTableSize("s_relateapps", 12)

    CALL ggc.setTableSize("s_browse", 32)

    CALL ggc.wait(222)
    CALL ggc.mediaSize("large")

    CALL ggc.wait(2439)
    CALL ggc.action("query") -- 查詢 query

    CALL ggc.wait(971)
    CALL ggc.setTableSize("s_detail1_01", 9)

    CALL ggc.setTableSize("s_detail1_03", 10)

    CALL ggc.wait(1008)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("geza")

    CALL ggc.wait(341)
    CALL ggc.action("accept") -- 確定 accept

    CALL ggc.wait(845)
    CALL ggc.action("reproduce") -- 複製 reproduce

    CALL ggc.wait(1184)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("gezaaa")

    CALL ggc.wait(1286)
    CALL ggc.setFocus("gzxa_t.gzxa003")

    CALL ggc.wait(623)
    CALL ggc.setFocus("gzxa_t.gzxa003")

    CALL ggc.setValue("000000")

    CALL ggc.wait(1050)
    CALL ggc.action("accept") -- 確定 accept

    CALL ggc.wait(2060)
    CALL ggc.action("no") -- 否

    CALL ggc.wait(2205)
    CALL ggc.action("delete") -- 刪除 delete

    CALL ggc.wait(1830)
    CALL ggc.action("yes") -- 是

    CALL ggc.wait(2092)
    CALL ggc.action("close") -- close

    CALL ggc.end()
END FUNCTION

# Scenario azzi800_test id : 2
PRIVATE FUNCTION play_2()
    CALL ggc.setTableSize("s_queryplan", 10)

    CALL ggc.setTableSize("s_relateapps", 7)

    CALL ggc.setTableSize("s_browse", 20)

    CALL ggc.wait(527)
    CALL ggc.setTableSize("s_queryplan", 16)

    CALL ggc.setTableSize("s_relateapps", 12)

    CALL ggc.setTableSize("s_browse", 32)

    CALL ggc.wait(222)
    CALL ggc.mediaSize("large")

    CALL ggc.wait(2439)
    CALL ggc.action("query") -- 查詢 query

    CALL ggc.wait(971)
    CALL ggc.setTableSize("s_detail1_01", 9)

    CALL ggc.setTableSize("s_detail1_03", 10)

    CALL ggc.wait(1008)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("geza")

    CALL ggc.wait(341)
    CALL ggc.action("accept") -- 確定 accept

    CALL ggc.wait(845)
    CALL ggc.action("reproduce") -- 複製 reproduce

    CALL ggc.wait(1184)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("gezaaa")

    CALL ggc.wait(1286)
    CALL ggc.setFocus("gzxa_t.gzxa003")

    CALL ggc.wait(623)
    CALL ggc.setFocus("gzxa_t.gzxa003")

    CALL ggc.setValue("000000")

    CALL ggc.wait(1050)
    CALL ggc.action("accept") -- 確定 accept

    CALL ggc.wait(2060)
    CALL ggc.action("no") -- 否

    CALL ggc.wait(2205)
    CALL ggc.action("delete") -- 刪除 delete

    CALL ggc.wait(1830)
    CALL ggc.action("yes") -- 是

    CALL ggc.wait(2092)
    CALL ggc.action("close") -- close

    CALL ggc.end()
END FUNCTION

# Scenario azzi800_test id : 3
PRIVATE FUNCTION play_3()
    CALL ggc.setTableSize("s_queryplan", 10)

    CALL ggc.setTableSize("s_relateapps", 7)

    CALL ggc.setTableSize("s_browse", 20)

    CALL ggc.wait(527)
    CALL ggc.setTableSize("s_queryplan", 16)

    CALL ggc.setTableSize("s_relateapps", 12)

    CALL ggc.setTableSize("s_browse", 32)

    CALL ggc.wait(222)
    CALL ggc.mediaSize("large")

    CALL ggc.wait(2439)
    CALL ggc.action("query") -- 查詢 query

    CALL ggc.wait(971)
    CALL ggc.setTableSize("s_detail1_01", 9)

    CALL ggc.setTableSize("s_detail1_03", 10)

    CALL ggc.wait(1008)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("geza")

    CALL ggc.wait(341)
    CALL ggc.action("accept") -- 確定 accept

    CALL ggc.wait(845)
    CALL ggc.action("reproduce") -- 複製 reproduce

    CALL ggc.wait(1184)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("gezaaa")

    CALL ggc.wait(1286)
    CALL ggc.setFocus("gzxa_t.gzxa003")

    CALL ggc.wait(623)
    CALL ggc.setFocus("gzxa_t.gzxa003")

    CALL ggc.setValue("000000")

    CALL ggc.wait(1050)
    CALL ggc.action("accept") -- 確定 accept

    CALL ggc.wait(2060)
    CALL ggc.action("no") -- 否

    CALL ggc.wait(2205)
    CALL ggc.action("delete") -- 刪除 delete

    CALL ggc.wait(1830)
    CALL ggc.action("yes") -- 是

    CALL ggc.wait(2092)
    CALL ggc.action("close") -- close

    CALL ggc.end()
END FUNCTION

# Scenario azzi800_test id : 4
PRIVATE FUNCTION play_4()
    CALL ggc.setTableSize("s_queryplan", 10)

    CALL ggc.setTableSize("s_relateapps", 7)

    CALL ggc.setTableSize("s_browse", 20)

    CALL ggc.wait(527)
    CALL ggc.setTableSize("s_queryplan", 16)

    CALL ggc.setTableSize("s_relateapps", 12)

    CALL ggc.setTableSize("s_browse", 32)

    CALL ggc.wait(222)
    CALL ggc.mediaSize("large")

    CALL ggc.wait(2439)
    CALL ggc.action("query") -- 查詢 query

    CALL ggc.wait(971)
    CALL ggc.setTableSize("s_detail1_01", 9)

    CALL ggc.setTableSize("s_detail1_03", 10)

    CALL ggc.wait(1008)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("geza")

    CALL ggc.wait(341)
    CALL ggc.action("accept") -- 確定 accept

    CALL ggc.wait(845)
    CALL ggc.action("reproduce") -- 複製 reproduce

    CALL ggc.wait(1184)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("gezaaa")

    CALL ggc.wait(1286)
    CALL ggc.setFocus("gzxa_t.gzxa003")

    CALL ggc.wait(623)
    CALL ggc.setFocus("gzxa_t.gzxa003")

    CALL ggc.setValue("000000")

    CALL ggc.wait(1050)
    CALL ggc.action("accept") -- 確定 accept

    CALL ggc.wait(2060)
    CALL ggc.action("no") -- 否

    CALL ggc.wait(2205)
    CALL ggc.action("delete") -- 刪除 delete

    CALL ggc.wait(1830)
    CALL ggc.action("yes") -- 是

    CALL ggc.wait(2092)
    CALL ggc.action("close") -- close

    CALL ggc.end()
END FUNCTION

# Scenario azzi800_test id : 5
PRIVATE FUNCTION play_5()
    CALL ggc.setTableSize("s_queryplan", 10)

    CALL ggc.setTableSize("s_relateapps", 7)

    CALL ggc.setTableSize("s_browse", 20)

    CALL ggc.wait(527)
    CALL ggc.setTableSize("s_queryplan", 16)

    CALL ggc.setTableSize("s_relateapps", 12)

    CALL ggc.setTableSize("s_browse", 32)

    CALL ggc.wait(222)
    CALL ggc.mediaSize("large")

    CALL ggc.wait(2439)
    CALL ggc.action("query") -- 查詢 query

    CALL ggc.wait(971)
    CALL ggc.setTableSize("s_detail1_01", 9)

    CALL ggc.setTableSize("s_detail1_03", 10)

    CALL ggc.wait(1008)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("geza")

    CALL ggc.wait(341)
    CALL ggc.action("accept") -- 確定 accept

    CALL ggc.wait(845)
    CALL ggc.action("reproduce") -- 複製 reproduce

    CALL ggc.wait(1184)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("gezaaa")

    CALL ggc.wait(1286)
    CALL ggc.setFocus("gzxa_t.gzxa003")

    CALL ggc.wait(623)
    CALL ggc.setFocus("gzxa_t.gzxa003")

    CALL ggc.setValue("000000")

    CALL ggc.wait(1050)
    CALL ggc.action("accept") -- 確定 accept

    CALL ggc.wait(2060)
    CALL ggc.action("no") -- 否

    CALL ggc.wait(2205)
    CALL ggc.action("delete") -- 刪除 delete

    CALL ggc.wait(1830)
    CALL ggc.action("yes") -- 是

    CALL ggc.wait(2092)
    CALL ggc.action("close") -- close

    CALL ggc.end()
END FUNCTION
    # Scenario azzi800_test id : 6
PRIVATE FUNCTION play_6()
    CALL ggc.setTableSize("s_queryplan", 10)

    CALL ggc.setTableSize("s_relateapps", 7)

    CALL ggc.setTableSize("s_browse", 20)

    CALL ggc.wait(527)
    CALL ggc.setTableSize("s_queryplan", 16)

    CALL ggc.setTableSize("s_relateapps", 12)

    CALL ggc.setTableSize("s_browse", 32)

    CALL ggc.wait(222)
    CALL ggc.mediaSize("large")

    CALL ggc.wait(2439)
    CALL ggc.action("query") -- 查詢 query

    CALL ggc.wait(971)
    CALL ggc.setTableSize("s_detail1_01", 9)

    CALL ggc.setTableSize("s_detail1_03", 10)

    CALL ggc.wait(1008)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("geza")

    CALL ggc.wait(341)
    CALL ggc.action("accept") -- 確定 accept

    CALL ggc.wait(845)
    CALL ggc.action("reproduce") -- 複製 reproduce

    CALL ggc.wait(1184)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("gezaaa")

    CALL ggc.wait(1286)
    CALL ggc.setFocus("gzxa_t.gzxa003")

    CALL ggc.wait(623)
    CALL ggc.setFocus("gzxa_t.gzxa003")

    CALL ggc.setValue("000000")

    CALL ggc.wait(1050)
    CALL ggc.action("accept") -- 確定 accept

    CALL ggc.wait(2060)
    CALL ggc.action("no") -- 否

    CALL ggc.wait(2205)
    CALL ggc.action("delete") -- 刪除 delete

    CALL ggc.wait(1830)
    CALL ggc.action("yes") -- 是

    CALL ggc.wait(2092)
    CALL ggc.action("close") -- close

    CALL ggc.end()
END FUNCTION

# Scenario azzi800_test id : 7
PRIVATE FUNCTION play_7()
    CALL ggc.setTableSize("s_queryplan", 10)

    CALL ggc.setTableSize("s_relateapps", 7)

    CALL ggc.setTableSize("s_browse", 20)

    CALL ggc.wait(527)
    CALL ggc.setTableSize("s_queryplan", 16)

    CALL ggc.setTableSize("s_relateapps", 12)

    CALL ggc.setTableSize("s_browse", 32)

    CALL ggc.wait(222)
    CALL ggc.mediaSize("large")

    CALL ggc.wait(2439)
    CALL ggc.action("query") -- 查詢 query

    CALL ggc.wait(971)
    CALL ggc.setTableSize("s_detail1_01", 9)

    CALL ggc.setTableSize("s_detail1_03", 10)

    CALL ggc.wait(1008)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("geza")

    CALL ggc.wait(341)
    CALL ggc.action("accept") -- 確定 accept

    CALL ggc.wait(845)
    CALL ggc.action("reproduce") -- 複製 reproduce

    CALL ggc.wait(1184)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("gezaaa")

    CALL ggc.wait(1286)
    CALL ggc.setFocus("gzxa_t.gzxa003")

    CALL ggc.wait(623)
    CALL ggc.setFocus("gzxa_t.gzxa003")

    CALL ggc.setValue("000000")

    CALL ggc.wait(1050)
    CALL ggc.action("accept") -- 確定 accept

    CALL ggc.wait(2060)
    CALL ggc.action("no") -- 否

    CALL ggc.wait(2205)
    CALL ggc.action("delete") -- 刪除 delete

    CALL ggc.wait(1830)
    CALL ggc.action("yes") -- 是

    CALL ggc.wait(2092)
    CALL ggc.action("close") -- close

    CALL ggc.end()
END FUNCTION

# Scenario azzi800_test id : 8
PRIVATE FUNCTION play_8()
    CALL ggc.setTableSize("s_queryplan", 10)

    CALL ggc.setTableSize("s_relateapps", 7)

    CALL ggc.setTableSize("s_browse", 20)

    CALL ggc.wait(527)
    CALL ggc.setTableSize("s_queryplan", 16)

    CALL ggc.setTableSize("s_relateapps", 12)

    CALL ggc.setTableSize("s_browse", 32)

    CALL ggc.wait(222)
    CALL ggc.mediaSize("large")

    CALL ggc.wait(2439)
    CALL ggc.action("query") -- 查詢 query

    CALL ggc.wait(971)
    CALL ggc.setTableSize("s_detail1_01", 9)

    CALL ggc.setTableSize("s_detail1_03", 10)

    CALL ggc.wait(1008)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("geza")

    CALL ggc.wait(341)
    CALL ggc.action("accept") -- 確定 accept

    CALL ggc.wait(845)
    CALL ggc.action("reproduce") -- 複製 reproduce

    CALL ggc.wait(1184)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("gezaaa")

    CALL ggc.wait(1286)
    CALL ggc.setFocus("gzxa_t.gzxa003")

    CALL ggc.wait(623)
    CALL ggc.setFocus("gzxa_t.gzxa003")

    CALL ggc.setValue("000000")

    CALL ggc.wait(1050)
    CALL ggc.action("accept") -- 確定 accept

    CALL ggc.wait(2060)
    CALL ggc.action("no") -- 否

    CALL ggc.wait(2205)
    CALL ggc.action("delete") -- 刪除 delete

    CALL ggc.wait(1830)
    CALL ggc.action("yes") -- 是

    CALL ggc.wait(2092)
    CALL ggc.action("close") -- close

    CALL ggc.end()
END FUNCTION

# Scenario azzi800_test id : 9
PRIVATE FUNCTION play_9()
    CALL ggc.setTableSize("s_queryplan", 10)

    CALL ggc.setTableSize("s_relateapps", 7)

    CALL ggc.setTableSize("s_browse", 20)

    CALL ggc.wait(527)
    CALL ggc.setTableSize("s_queryplan", 16)

    CALL ggc.setTableSize("s_relateapps", 12)

    CALL ggc.setTableSize("s_browse", 32)

    CALL ggc.wait(222)
    CALL ggc.mediaSize("large")

    CALL ggc.wait(2439)
    CALL ggc.action("query") -- 查詢 query

    CALL ggc.wait(971)
    CALL ggc.setTableSize("s_detail1_01", 9)

    CALL ggc.setTableSize("s_detail1_03", 10)

    CALL ggc.wait(1008)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("geza")

    CALL ggc.wait(341)
    CALL ggc.action("accept") -- 確定 accept

    CALL ggc.wait(845)
    CALL ggc.action("reproduce") -- 複製 reproduce

    CALL ggc.wait(1184)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("gezaaa")

    CALL ggc.wait(1286)
    CALL ggc.setFocus("gzxa_t.gzxa003")

    CALL ggc.wait(623)
    CALL ggc.setFocus("gzxa_t.gzxa003")

    CALL ggc.setValue("000000")

    CALL ggc.wait(1050)
    CALL ggc.action("accept") -- 確定 accept

    CALL ggc.wait(2060)
    CALL ggc.action("no") -- 否

    CALL ggc.wait(2205)
    CALL ggc.action("delete") -- 刪除 delete

    CALL ggc.wait(1830)
    CALL ggc.action("yes") -- 是

    CALL ggc.wait(2092)
    CALL ggc.action("close") -- close

    CALL ggc.end()
END FUNCTION

# Scenario azzi800_test id : 10
PRIVATE FUNCTION play_10()
    CALL ggc.setTableSize("s_queryplan", 10)

    CALL ggc.setTableSize("s_relateapps", 7)

    CALL ggc.setTableSize("s_browse", 20)

    CALL ggc.wait(527)
    CALL ggc.setTableSize("s_queryplan", 16)

    CALL ggc.setTableSize("s_relateapps", 12)

    CALL ggc.setTableSize("s_browse", 32)

    CALL ggc.wait(222)
    CALL ggc.mediaSize("large")

    CALL ggc.wait(2439)
    CALL ggc.action("query") -- 查詢 query

    CALL ggc.wait(971)
    CALL ggc.setTableSize("s_detail1_01", 9)

    CALL ggc.setTableSize("s_detail1_03", 10)

    CALL ggc.wait(1008)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("geza")

    CALL ggc.wait(341)
    CALL ggc.action("accept") -- 確定 accept

    CALL ggc.wait(845)
    CALL ggc.action("reproduce") -- 複製 reproduce

    CALL ggc.wait(1184)
    CALL ggc.setFocus("gzxa_t.gzxa001")

    CALL ggc.setValue("gezaaa")

    CALL ggc.wait(1286)
    CALL ggc.setFocus("gzxa_t.gzxa003")

    CALL ggc.wait(623)
    CALL ggc.setFocus("gzxa_t.gzxa003")

    CALL ggc.setValue("000000")

    CALL ggc.wait(1050)
    CALL ggc.action("accept") -- 確定 accept

    CALL ggc.wait(2060)
    CALL ggc.action("no") -- 否

    CALL ggc.wait(2205)
    CALL ggc.action("delete") -- 刪除 delete

    CALL ggc.wait(1830)
    CALL ggc.action("yes") -- 是

    CALL ggc.wait(2092)
    CALL ggc.action("close") -- close

    CALL ggc.end()
END FUNCTION



