# =============================================================================
# Generated using Genero Ghost Client 2.00.20-202307241032
# =============================================================================
IMPORT FGL ggc
IMPORT os
IMPORT util
MAIN
    DEFINE TT INTEGER
    CALL startlog("/u1/usr/tiptop/gcc_test/Genero_gcc/price_sample-" || fgl_getpid() || ".log")
    CALL ggc.setApplicationName("price")
    CALL ggc.parseOptions()
    CALL ggc.timer()

    # Register scenario functions
    #CALL ggc.registerScenario(FUNCTION play_0)
    #CALL ggc.registerScenario(FUNCTION play_1)
    #CALL ggc.registerScenario(FUNCTION play_2)
    CALL ggc.registerScenario(FUNCTION play_3)
    # Start execution and exits when the scenario ends
    # Exit status is 1 in case of error, 0 on success.

    DISPLAY "TT",TT
    LET TT = 0
    WHILE TT < 5
        LET TT = TT + 1 
        CALL ggc.play()
        DISPLAY 'TT',TT
    END WHILE

    
    #CALL errortlog("msg.message:" || msg.message || ".")
    CALL ggc.end()
    CALL errorlog('test')
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

    #CALL ggc.end()
END FUNCTION

# Scenario price_sample id : 0
PRIVATE FUNCTION play_1()
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

    #CALL ggc.end()
END FUNCTION

# Scenario price_sample id : 0
PRIVATE FUNCTION play_2()
    DEFINE TT INTEGER
    DEFINE windowTitle STRING
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
 
    LET TT=0
    LET windowTitle = ggc.getWindowTitle()

    DISPLAY "Window title is: " || windowTitle
    DISPLAY "Exiting with action 'cancel'"
    CALL ggc.wait(100)
    DISPLAY 'TT:',TT
    WHILE TT > 100
        LET TT = TT + 1 
        CALL ggc.wait(55)
        
        CALL ggc.action("accept") -- OK
    END WHILE
    DISPLAY 'TT:',TT
    CALL ggc.end()
END FUNCTION

PRIVATE FUNCTION play_3()
    DEFINE msg ggc.Message
    DEFINE TT INTEGER
    DEFINE windowTitle STRING
    # Get window title
    LET windowTitle = ggc.getWindowTitle()
    DISPLAY "Window title is: " || windowTitle

    CALL ggc.wait(141)
    CALL ggc.setTableSize("sr_prices", 7)

    --
    CALL ggc.wait(833)
    CALL ggc.setRowFocus("sr_prices", 3)

    CALL ggc.wait(137)
    CALL ggc.action("sr_prices.edit") -- sr_prices double click
    
    DISPLAY "The application state is " || getState()
    CALL ggc.getMessage() RETURNING msg.*
    DISPLAY 'msg.message',msg.message
    DISPLAY "TT",TT
    --

    DISPLAY "Exiting with action 'cancel'"
    CALL ggc.wait(100)
    CALL ggc.action("cancel")
    
END FUNCTION
