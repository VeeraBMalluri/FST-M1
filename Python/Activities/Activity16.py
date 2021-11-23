'''
Create a car class with the following details:

Properties: manufacturer, model, make, transmission, color

Methods: accelerate(), stop()

accelerate() should print "{Manufacturer} {Model} is moving"

stop() should print "{Manufacturer} {Model} has stopped"
Using this car class, create 3 different car objects.

'''

class car:
    def __init__(self, manufacturer,model,make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color
    def accelerate(self):
        print ("{} {} is moving".format(self.manufacturer, self.model))
    def stop(self):
        print ("{} {} hs stopped".format(self.manufacturer, self.model))

C1 = car('Mahendra', 'Thar', 2020, 6, 'Red')

C1.accelerate()
C1.stop()

C2 = car('TATA', 'Scorpio', 2020, 6, 'Red')
C2.accelerate()
C2.stop()


C3 = car('Maruthi', 'Baleno', 2020, 6, 'Red')
C3.accelerate()
C3.stop()