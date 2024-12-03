# =============================================================================
# Generated using Genero Ghost Client 2.00.20-202307241032
# =============================================================================
IMPORT FGL ggc

MAIN
    CALL ggc.setApplicationName("price")
    CALL ggc.parseOptions()

    # Register scenario functions
    CALL ggc.registerScenario(FUNCTION play_0)

    # Start execution and exits when the scenario ends
    # Exit status is 1 in case of error, 0 on success.
    CALL ggc.play()
END MAIN

# Scenario price_sample id : 0
PRIVATE FUNCTION play_0()
    CALL ggc.wait(141)
    CALL ggc.setTableSize("sr_prices", 7)

    CALL ggc.wait(833)
    CALL ggc.setRowFocus("sr_prices", 3)

    CALL ggc.wait(137)
    CALL ggc.action("sr_prices.edit") -- sr_prices double click

    CALL ggc.wait(1873)
    CALL ggc.action("accept") -- OK

    CALL ggc.wait(955)
    CALL ggc.action("accept") -- OK

    CALL ggc.end()
END FUNCTION

