# =============================================================================
# Generated using Genero Ghost Client 5.00.02-202405230916
# =============================================================================
IMPORT FGL ggc
IMPORT os
IMPORT util
MAIN
    DEFINE TT INTEGER
    CALL ggc.setApplicationName("azzi085")
    CALL ggc.parseOptions()

    # Register scenario functions
    CALL ggc.registerScenario(FUNCTION play_0)

    # Start execution and exits when the scenario ends
    # Exit status is 1 in case of error, 0 on success.
    DISPLAY "TT",TT
    LET TT = 0
    WHILE TT < 5
        LET TT = TT + 1 
        CALL ggc.play()
        DISPLAY 'TT',TT
        DISPLAY 'TT',TT
    END WHILE

END MAIN

# Scenario azzi085_test id : 0
PRIVATE FUNCTION play_0()
    CALL ggc.mediaSize("large")

    CALL ggc.wait(971)
    CALL ggc.action("query") -- 查詢 query

    CALL ggc.wait(2161)
    CALL ggc.setFocus("gzda_t.gzda001")

    CALL ggc.setValue("ds")

    CALL ggc.action("cancel") -- 放棄 cancel

    CALL ggc.wait(1369)
    CALL ggc.action("query") -- 查詢 query

    CALL ggc.wait(1335)
    CALL ggc.setFocus("gzda_t.gzda001")

    CALL ggc.setValue("ds")

    CALL ggc.action("accept") -- 確定 accept

    CALL ggc.wait(2467)
    CALL ggc.action("close") -- close

    CALL ggc.end()
END FUNCTION

