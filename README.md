PythonOuyaController
====================

Use PGS4A ( pygame ) or Kivy and get ouyacontroller up / down / motion events
--------------

*Replace the Java files and add the python file to your project*

**How to use:**

    from ouyacontroller import *
    controller = OuyaController()
    
    while True: #main loop
      controller.get_events()
      
      if controller.up(controller.BUTTON_O):
        print("player released BUTTON_O")
        
      if controller.down(controller.BUTTON_O):
        print("player pressed BUTTON_O")
        
      if controller.motion(controller.BUTTON_O):
        print("player is holding BUTTON_O down")
        
      controller.update()
