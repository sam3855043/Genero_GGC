# =============================================================================
# Generated using Genero Ghost Client 2.00.20-202307241032
# =============================================================================
IMPORT FGL ggc

MAIN
    CALL ggc.setApplicationName("azzi800")
    CALL ggc.parseOptions()

    # Register scenario functions
    CALL ggc.registerScenario(FUNCTION play_0)

    # Start execution and exits when the scenario ends
    # Exit status is 1 in case of error, 0 on success.
    CALL ggc.play()
END MAIN

# Scenario azzi800 id : 0
PRIVATE FUNCTION play_0()
    CALL ggc.wait(1811)
    CALL ggc.setTableSize("s_browse", 16)

    CALL ggc.setTableSize("s_relateapps", 12)

    CALL ggc.setTableSize("s_queryplan", 17)

    CALL ggc.wait(1750)
    CALL ggc.action("query") -- 查詢 query

    CALL ggc.wait(88)
    CALL ggc.setTableSize("s_detail1_01", 2)

    CALL ggc.setTableSize("s_detail1_03", 3)

    CALL ggc.wait(1503)
    CALL ggc.action("controlp") -- cmt_gzxa001 controlp

    CALL ggc.wait(159)
    CALL ggc.setTableSize("s_qry", 10)

    CALL ggc.wait(922)
    CALL ggc.action("accept") -- 確定 accept

    CALL ggc.wait(507)
    CALL ggc.action("accept") -- 確定 accept

    CALL ggc.wait(1262)
    CALL ggc.action("accept") -- 確定 accept

    CALL ggc.wait(2547)
    CALL ggc.action("next") -- 

    CALL ggc.wait(360)
    CALL ggc.action("next") -- 

    CALL ggc.wait(315)
    CALL ggc.action("next") -- 

    CALL ggc.wait(1986)
    CALL ggc.setTableSize("s_detail1_01", 2)

    CALL ggc.setTableSize("s_detail1_03", 3)

    CALL ggc.wait(11776)
    CALL ggc.action("close") -- close

    CALL ggc.end()
END FUNCTION

