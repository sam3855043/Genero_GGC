# =============================================================================
# Generated using Genero Ghost Client 2.00.20-202307241032
# =============================================================================
IMPORT FGL ggc

MAIN
    CALL ggc.setApplicationName("demo")
    CALL ggc.parseOptions()

    # Register scenario functions
    CALL ggc.registerScenario(FUNCTION play_0)
    CALL ggc.registerScenario(FUNCTION play_1)

    # Start execution and exits when the scenario ends
    # Exit status is 1 in case of error, 0 on success.
    CALL ggc.play()
END MAIN

# Scenario gwc_demo id : 0
PRIVATE FUNCTION play_0()
    CALL ggc.wait(124)
    CALL ggc.setTableSize("s_demos", 15)

    CALL ggc.setTableSize("s_topics", 16)

    CALL ggc.wait(604)
    CALL ggc.setRowFocus("s_topics", 3)

    CALL ggc.wait(758)
    CALL ggc.setRowFocus("s_topics", 4)

    CALL ggc.wait(803)
    CALL ggc.expandTree("s_topics", 4)

    CALL ggc.wait(500)
    CALL ggc.setRowFocus("s_topics", 7)

    CALL ggc.wait(919)
    CALL ggc.setRowFocus("s_demos", 3)

    CALL ggc.wait(166)
    CALL ggc.action("s_demos.show") -- s_demos double click

    CALL ggc.wait(2496)
    CALL ggc.action("accept") -- OK

    CALL ggc.wait(1403)
    CALL ggc.setRowFocus("s_demos", 5)

    CALL ggc.wait(150)
    CALL ggc.action("s_demos.show") -- s_demos double click

    CALL ggc.wait(1634)
    CALL ggc.action("cancel") -- Cancel

    CALL ggc.end()
END FUNCTION

# Scenario gwc_demo id : 1
PRIVATE FUNCTION play_1()
    CALL ggc.wait(111)
    CALL ggc.setTableSize("srec", 6)

    CALL ggc.wait(1182)
    CALL ggc.action("accept") -- OK

    CALL ggc.end()
END FUNCTION

