# =============================================================================
# Generated using Genero Ghost Client 5.00.02-202405230916
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

# Scenario demo_scenario id : 0
PRIVATE FUNCTION play_0()
    CALL ggc.setTableSize("s_topics", 15)

    CALL ggc.setTableSize("s_demos", 15)

    CALL ggc.wait(539)
    CALL ggc.setTableSize("s_topics", 12)

    CALL ggc.setTableSize("s_demos", 12)

    CALL ggc.wait(55)
    CALL ggc.setTableSize("s_topics", 13)

    CALL ggc.setTableSize("s_demos", 13)

    CALL ggc.wait(197)
    CALL ggc.mediaSize("large")

    CALL ggc.wait(3678)
    CALL ggc.setRowFocus("s_demos", 4)

    CALL ggc.wait(186)
    CALL ggc.action("s_demos.show") -- s_demos double click

    CALL ggc.wait(1423)
    CALL ggc.action("accept") -- OK

    CALL ggc.wait(751)
    CALL ggc.setRowFocus("s_demos", 6)

    CALL ggc.wait(189)
    CALL ggc.action("s_demos.show") -- s_demos double click

    CALL ggc.wait(1223)
    CALL ggc.action("accept") -- OK

    CALL ggc.wait(2652)
    CALL ggc.setRowFocus("s_demos", 1)

    CALL ggc.wait(171)
    CALL ggc.action("s_demos.show") -- s_demos double click

    CALL ggc.wait(1380)
    CALL ggc.action("accept") -- OK

    CALL ggc.wait(1194)
    CALL ggc.expandTree("s_topics", 2)

    CALL ggc.wait(2089)
    CALL ggc.setTableOffset("s_topics", 3)

    CALL ggc.wait(128)
    CALL ggc.setTableOffset("s_topics", 4)

    CALL ggc.wait(1060)
    CALL ggc.expandTree("s_topics", 12)

    CALL ggc.wait(671)
    CALL ggc.setRowFocus("s_topics", 16)

    CALL ggc.wait(945)
    CALL ggc.setRowFocus("s_demos", 1)

    CALL ggc.wait(164)
    CALL ggc.action("s_demos.show") -- s_demos double click

    CALL ggc.wait(3384)
    CALL ggc.action("cancel") -- Cancel

    CALL ggc.end()
END FUNCTION

# Scenario demo_scenario id : 1
PRIVATE FUNCTION play_1()
    CALL ggc.action("close") -- Close

    CALL ggc.end()
END FUNCTION

