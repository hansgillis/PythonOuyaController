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
        print("player 0 released BUTTON_O")
        
      if controller.down(controller.BUTTON_O, 1):
        print("player 1 pressed BUTTON_O")
        
      if controller.motion(controller.BUTTON_O, 2):
        print("player 2 is holding BUTTON_O down")
        
      print("player 3 left_stick values", controller.get_left_stick(3))
      
      controller.update()
