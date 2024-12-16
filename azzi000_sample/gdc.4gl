# =============================================================================
# Generated using Genero Ghost Client 5.00.02-202405230916
# =============================================================================
IMPORT FGL ggc

MAIN
    CALL ggc.setApplicationName("azzi800")
    CALL ggc.parseOptions()

    # Register scenario functions
    CALL ggc.registerScenario(FUNCTION play_2)

    # Start execution and exits when the scenario ends
    # Exit status is 1 in case of error, 0 on success.
    CALL ggc.play()
END MAIN

# Scenario gdc id : 2
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

