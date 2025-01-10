# =============================================================================
# Generated using Genero Ghost Client 2.00.20-202307241032
# =============================================================================
IMPORT FGL ggc

MAIN
    CALL ggc.setApplicationName("azzi085")
    CALL ggc.parseOptions()

    # Register scenario functions
    CALL ggc.registerScenario(FUNCTION play_0)

    # Start execution and exits when the scenario ends
    # Exit status is 1 in case of error, 0 on success.
    CALL ggc.play()
END MAIN

# Scenario azzi085 id : 0
PRIVATE FUNCTION play_0()
    CALL ggc.wait(3305)
    CALL ggc.action("query") -- 查詢 query

    CALL ggc.wait(1364)
    CALL ggc.setValue("ds")

    CALL ggc.action("accept") -- 確定 accept

    CALL ggc.wait(2932)
    CALL ggc.action("query") -- 查詢 query

    CALL ggc.wait(1702)
    CALL ggc.setValue("ds")

    CALL ggc.action("accept") -- 確定 accept

    CALL ggc.wait(2759)
    CALL ggc.action("close") -- close

    CALL ggc.end()
END FUNCTION

